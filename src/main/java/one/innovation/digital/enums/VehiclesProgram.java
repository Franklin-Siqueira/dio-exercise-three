package one.innovation.digital.enums;

public class VehiclesProgram {
    public static void main(String[] args) {
        // Enums can't be instantiated
        // final VehicleType vehicleType = new VehicleType();
        System.out.println(VehicleType.LAND);
        System.out.println(VehicleType.AIR);
        System.out.println(VehicleType.valueOf("LAND"));
        System.out.println(VehicleType.valueOf("AIR"));

        for (VehicleType typeOf : VehicleType.values()) {
            System.out.println("Type: " + typeOf);
        }
        // For Status codesT
        System.out.println("Status for OPEN: " + Status.OPEN);
        System.out.println("Code for OPEN: " + Status.OPEN.getCod());
        System.out.println("Text for OPEN: " + Status.OPEN.getText());
        System.out.println("Status for CLOSED: " + Status.CLOSED);
        System.out.println("Code for CLOSED: " + Status.CLOSED.getCod());
        System.out.println("Text for CLOSED: " + Status.CLOSED.getText());
    }
}
