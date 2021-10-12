package one.innovation.digital.strings;

public class Strings {
    public static void main(String[] args) {
        // Initialization
        var firstName = "Franklin";
        var lastName = "Siqueira";
        final var fullName = firstName + " " + lastName;
        // Print
        System.out.println(firstName);
        System.out.println("Customer's first name: " + firstName);
        System.out.println("Customer's full name : " + fullName);
        // Redundant Initialization
        var string = new String(" My String ");
        // Methods
        System.out.println("Char at position 5: " + string.charAt(5));
        System.out.println("String length: " + string.length());
        System.out.println("Without Trim: [" + string + "]");
        System.out.println("With Trim: [" + string.trim() + "]");
        System.out.println("Lower: " + string.toLowerCase());
        System.out.println("Upper: " + string.toUpperCase());
        System.out.println("Contains M: " + string.contains("M"));
        System.out.println("Contains X: " + string.contains("X"));
        System.out.println("Replace: " + string.replace("n", "$"));
        System.out.println("Equals: " + string.equals(" My String "));
        System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" my sTrinG "));
        System.out.println("Substring(1,6): " + string.substring(1, 6));
        // .toCharArray()
        System.out.println("toCharArray(): " + firstName.toCharArray());
        // .split()
        System.out.println("split(): " + fullName.split(" "));
        // .concat()
        System.out.println("concat(): " + firstName.concat(" Carrilho"));
        // .replaceAll()
        System.out.println("replaceAll(): " + firstName.replaceAll("[A-Z]", "N"));
    }
}
