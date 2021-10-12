package one.innovation.digital.interfaces;

public interface Car {
    // Given it's an "interface", access modifiers are implicit
    String brand();
    default void turnOn() {
        System.out.println("Turning on...");
    }
}
