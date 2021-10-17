package one.innovation.digital.HttpClientApi;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;
import java.util.stream.Collectors;
/**
 *
 */
public class HttpClientApi {
    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread NewThread = new Thread(runnable);
            System.out.printf("New thread created: %s | Thread Group: %s\n", (NewThread.isDaemon() ? "daemon" : ""), NewThread.getThreadGroup());
            return NewThread;
        }
    });

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        connectAndPrintURLJavaOracle();
        // connectAkamaiHttp11Client();
        connectAkamaiHttp2Client();
        StringLinesSample();
        CollectionSample();
    }

    /**
     *
     */
    private static void CollectionSample() {
            Collection<String> namesCollection = Set.of("Joao", "Paulo", "Oliveira", "Santos");
            System.out.println(namesCollection);
    }
    /**
     *
     */
    private static void StringLinesSample() {
            String html = "<html>\n <head>\n </head>\n <body>\n </body>\n </html>\n";
            System.out.println(html.lines().map(s -> "[TAG]: " + s).collect(Collectors.toList()));
            // System.out.println(html.lines().map(s -> "[TAG]: %s"+s).collect(Collectors.toList()));
    }
    /**
     *
     * @throws Exception
     */
    private static void connectAkamaiHttp11Client() throws Exception {
        System.out.println("Running HTTP/1.1 example ...");
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.printf("Status Code: %s\n", response.statusCode());
            System.out.printf("Response Headers: %s\n", response.headers());
            String responseBody = response.body();
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                    .forEach(image ->  {
                        Future<?> imgFuture  = executor.submit(() -> {
                            HttpRequest imgRequest  = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com" + image))
                                    .build();
                            try {
                                HttpResponse<String> imageResponse = httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.printf("Loaded image tile: %s with status code %s\n", image, imageResponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                System.out.printf("Error: could not retrieve image tile: \n", image);
                            }
                        });
                        future.add(imgFuture);
                        System.out.printf("New submission to image tile: %s!\n", image);
                    });

            future.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Error: couldn't wait for image tile!\n");
                }
            });

            long end = System.currentTimeMillis();
            System.out.printf("Total image tiles loading time: %s ms \n", (end - start));
        } finally {
            executor.shutdown();
        }
    }

    /**
     * <h2>HTTP2 Client Example</h2>
     * </br>
     * <p>Create a connection with variable targetUrl URL, retrieve body
     * and image tiles for testing time.</p>
     *
     * @throws Exception
     */
    private static void connectAkamaiHttp2Client() throws Exception {
        var targetUrl = "https://http2.akamai.com/demo/h2_demo_frame.html";
        System.out.println("Running HTTP/2 example...");
        try {
            // Create a new HttpClient builder
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .proxy(ProxySelector.getDefault())
                    .build();
            // Get start time
            long start = System.currentTimeMillis();
            // Create a new HttpRequest builder
            HttpRequest mainRequest = HttpRequest.newBuilder()
                    //.uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .uri(URI.create(targetUrl))
                    .build();
            // Create a new HttpResponse builder
            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());
            System.out.printf("Status Code: %s\n", response.statusCode());
            System.out.printf("Response Headers: %s\n", response.headers());
            String responseBody = response.body();
            //
            System.out.printf("Printing response body for URL %s \n", targetUrl);
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                    .forEach(image ->  {
                        Future<?> imgFuture  = executor.submit(() -> {
                            HttpRequest imgRequest  = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com" + image))
                                    .build();

                            try {
                                HttpResponse<String> imageResponse = httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.printf("Loaded image: %s with status code %s\n", image, imageResponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                System.out.printf("Error: Request for %s failed!\n", image);
                            }
                        });
                        future.add(imgFuture);
                        System.out.printf("New submission for future image tile: %s\n", image);
                    });

            future.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Error while waiting for future image tile!");
                }
            });

            long end = System.currentTimeMillis();
            System.out.printf("Total image tiles loading time: %s ms\n", (end - start));
        } finally {
            executor.shutdown();
        }
    }

    /**
     *
     * @throws IOException
     * @throws InterruptedException
     */
    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.printf("Status code: %s\n", response.statusCode());
        System.out.printf("Headers response: %s\n", response.headers());
        System.out.println(response.body());
    }
}
