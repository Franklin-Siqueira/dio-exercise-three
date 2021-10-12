package one.innovation.digital.finals;

public class DriverProgram {
    public static void main(String[] args) {
        final Driver driverOne = new Driver();
        final ProDriver driverTwo = new ProDriver();
        final RacDriver driverThree = new RacDriver();
        // "final" variables can't be changed
        final var destination = "the International Airport.";
        final var circuit = "Daytona International Speedway ";

        System.out.println(driverOne.steeringWheel());
        System.out.println(driverTwo.drive(destination));
        System.out.println(driverThree.race(circuit));
    }
}
