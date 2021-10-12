package one.innovation.digital.classes.cliente;

public class ClienteProgram {
    public static void main(String[] args) {
        final var cliente = new Cliente(22);
        // OK! These methods are accessible outside pessoa's package
        cliente.getAge();
        cliente.getWeight();
        // Error: report is a protected method, hence it can't be accessed outside pessoa's package
        // System.out.println(cliente.report());
    }
}
