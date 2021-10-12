package one.innovation.digital.interfaces;

public class CarProgram {
    public static void main(String[] args) {
        final Accord accord = new Accord();
        final Civic civic = new Civic();
        final Tractor tractorOne = new Tractor();
        final Corolla corollaOne = new Corolla();

        var vinTractorOne = tractorOne.vinNumber("AD13DSDE432543154");
        var vinCorollaOne = tractorOne.vinNumber("AD13DSDE432243154");

        System.out.println("Brand: " + accord.brand());
        accord.turnOn();
        System.out.println("Brand: " + civic.brand());
        civic.turnOn();
        System.out.println("Tractor One Vin Number: " + vinTractorOne);
        tractorOne.inspection();
        System.out.println("Brand: " + corollaOne.brand());
        corollaOne.turnOn();
        System.out.println("Corolla One Vin Number: " + vinCorollaOne);
        corollaOne.inspection();
    }
}
