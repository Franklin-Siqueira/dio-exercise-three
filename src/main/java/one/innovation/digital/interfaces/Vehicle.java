package one.innovation.digital.interfaces;

public interface Vehicle {
    String vinNumber(String code);
    default void inspection() {
        System.out.println("Time for an inspection!");
    }
}
