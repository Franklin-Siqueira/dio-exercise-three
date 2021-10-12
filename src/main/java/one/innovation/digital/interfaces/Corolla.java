package one.innovation.digital.interfaces;

public class Corolla implements Car, Vehicle {
    @Override
    public String brand() {
        return "Toyota";
    }
    @Override
    public String vinNumber(String code) {
        return code;
    }
}
