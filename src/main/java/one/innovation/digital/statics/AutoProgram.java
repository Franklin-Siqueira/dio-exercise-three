package one.innovation.digital.statics;

public class AutoProgram {
    public static void main(String[] args) {
        final AutoMotor ecosport = new AutoMotor();
        ecosport.automotive = "4 wheels";
        ecosport.automotives = "4 wheels";

        final AutoMotor xtz600 = new AutoMotor();

        System.out.println(ecosport.automotive);
        System.out.println(ecosport.automotives);
        System.out.println(xtz600.automotive);
        System.out.println(xtz600.automotives);
    }
}
