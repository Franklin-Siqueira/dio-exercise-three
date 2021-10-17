package one.innovation.digital.classes.client;

public class ClientAPI {
    public static void main(String[] args) {
        final var clientInstance = new ClientClass(22);
        // OK! These methods are accessible outside pessoa's package
        clientInstance.getAge();
        clientInstance.getWeight();
        // Error: report is a protected method, hence it can't be accessed outside pessoa's package
        // System.out.println(clientInstance.report());
    }
}
