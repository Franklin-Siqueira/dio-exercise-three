package one.innovation.digital.paradigms.processingsyncasync.threads.simplethread.auxclasses;

public class PdfFileGenerator extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Starting PDF generator");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Success! PDF created...");
    }
}
