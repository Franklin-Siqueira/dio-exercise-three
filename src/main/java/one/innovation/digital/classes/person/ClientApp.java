package one.innovation.digital.classes.person;

import one.innovation.digital.classes.client.ClientClass;

public class ClientApp {
    public static void main(String[] args) {
        final var cliente = new ClientClass(22);
        // OK! These methods are accessible outside pessoa's package
        cliente.getAge();
        cliente.getWeight();
        // Ok! report is a protected method, hence it can be accessed inside pessoa's package
        System.out.println(cliente.report());
        // Compare with the class ClienteProgram @ cliente's package
    }
}
