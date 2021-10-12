package one.innovation.digital.classes.pessoa;

import one.innovation.digital.classes.cliente.Cliente;

public class ClienteProgram {
    public static void main(String[] args) {
        final var cliente = new Cliente(22);
        // OK! These methods are accessible outside pessoa's package
        cliente.getAge();
        cliente.getWeight();
        // Ok! report is a protected method, hence it can be accessed inside pessoa's package
        System.out.println(cliente.report());
        // Compare with the class ClienteProgram @ cliente's package
    }
}
