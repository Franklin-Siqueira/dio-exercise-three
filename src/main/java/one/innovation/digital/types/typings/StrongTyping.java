package one.innovation.digital.types.typings;

public class StrongTyping {
    public static void main(String[] args) {
        // Once a type is defined, it can't be changed!!!
        String text = "New text string...";
        // text = 1024; // Error
        Integer n = Integer.valueOf("1024");
        n = 512; // Ok
    }
}
