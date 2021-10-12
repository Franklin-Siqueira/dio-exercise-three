package one.innovation.digital.operators.mathematical;

public class MathOperators {
    public static void main(String[] args) {
        // Print
        System.out.println(0 + 1);
        System.out.println(3 - 1);
        System.out.println(3 * 1);
        System.out.println(8 / 2);
        System.out.println("8 % 3 : " + (8 % 3)); // Modulus
        System.out.println("8 % 2 : " + (8 % 2)); // Modulus
        // Initialize
        var newNumber = 10;
        // Print original newNumber
        System.out.println("This the newNumber variable: " + newNumber);
        newNumber *= 2;
        // Print resulting newNumber
        System.out.println("Result from newNumber x 2 (newNumber *= 2): " + newNumber);

    }
}
