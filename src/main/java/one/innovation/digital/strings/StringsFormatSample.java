package one.innovation.digital.strings;

public class StringsFormatSample {
    public static void main(String[] args) {
        // Initialization
        var firstName = "Franklin";
        var lastName = "Siqueira";
        final var fullName = firstName + " " + lastName;
        // Print
        System.out.println(firstName);
        System.out.println("Customer's first name: " + firstName);
        System.out.println("Customer's full name : " + fullName);
        // Format
        final var message = String.format("Customer %s last name's %s ", firstName, lastName);
        // Print
        System.out.println(message);
        // Masking numbers
        System.out.println(String.format("Original number: 1.2375d"));
        System.out.println(String.format("Number rounded to 2 decimal places %.2f ", 1.2375d));
        System.out.println(String.format("Number rounded to 3 decimal places %.3f ", 1.2375d));
    }
}
