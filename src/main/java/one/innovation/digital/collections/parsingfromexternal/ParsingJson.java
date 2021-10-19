package one.innovation.digital.collections.parsingfromexternal;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;

/**
 *  ParsingJson
 *
 */
public class ParsingJson {
    public static void main(String[] args) throws IOException {
        var filePath = "/Users/user/DocumentsNew/Assets/images/Courses/DigitalInnovationOne/java-spring-gradle-dio/src/main/java/one/innovation/digital/collections/parsingfromexternal/data/user.json";
        try {
            ObjectMapper mapper = new ObjectMapper();
            // JsonNode nodes = mapper.readTree(Paths.get("user.json").toFile());
            JsonNode nodes = mapper.readTree(Paths.get(filePath).toFile());
            // iterate over all users
            for (JsonNode node : nodes) {
                // print JSON nodes
                System.out.println("User____________________________");
                System.out.println("Name      : " + node.path("name").path("firstName").asText());
                System.out.println("Last name : " + node.path("name").path("lastName").asText());
                System.out.println("Gender    : " + node.path("gender").asText());
                System.out.println("E-mail    : " + node.path("email").asText());
                System.out.println("Verified  : " + node.path("verified").asText());
                System.out.println("Image path: " + node.path("userImage").asText());
                System.out.println("________________________________");
                // iterate `roles`
                /*
                System.out.println("Roles: ");
                for (JsonNode role : node.path("roles")) {
                    System.out.println(role.asText());
                }
                */
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        // JSON file URL
        // final String gistFileUrl = "https://gist.githubusercontent.com/Franklin-Siqueira/c1402edd19ba6dabd14700091facbb2d/raw/c1406061f94288d55fdf1b05c3cac8a3e07b56c8/User.json";
        //Here we are taking the input from the json file and extracting the data
        // File jsonFile = new File("user.json");
        /*
        // This is the command to get data from the url
        URL jsonUrl = new URL("https://gist.githubusercontent.com/Franklin-Siqueira/c1402edd19ba6dabd14700091facbb2d/raw/c1406061f94288d55fdf1b05c3cac8a3e07b56c8/User.json");
        */
/*        URL jsonUrl = new URL(gistFileUrl);
        //Here we are declaring complete data as string and then extracting into normal daat
        String jsonStr =
                "{\"name\":{\"first\":\"Joe\",\"last\":\"Sixpack\"},\"gender\":\"MALE\",\"verified\":false,\"userImage\":\"Rm9vYmFyIQ==\"}";

        Employee employee;
        // convert java to json and vice versa
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // Here we are reading the json file to user
        // employee = mapper.readValue(jsonFile, Employee.class);
        employee = mapper.readValue(jsonUrl, Employee.class);
        // user.getName().getFirst() first it reads name and then goes to firstname and gives Joe
        System.out.println(employee.getFirstName());
        // this command retrieves the gender from the prints in the output
        System.out.println(employee.getEmail());
        // Here the data is taken from the Url data
        employee = mapper.readValue(jsonUrl, Employee.class);
        // We are retrieving the data similar to the json file
        System.out.println(employee.getFirstName());*/
        // Here we are getting the data from the String jsonString declared above and printing the output
        /*
        employee = mapper.readValue(jsonStr, Employee.class);
        System.out.println(employee.getFirstName());
        */
    }
}
