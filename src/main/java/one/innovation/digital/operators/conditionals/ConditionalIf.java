package one.innovation.digital.operators.conditionals;

public class ConditionalIf {
    public static void main(String[] args) {
        // Initialization
        final var condition = false;
        // Condition check with 'else'
        if (condition) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }
        // Condition check without 'else'
        if (!condition)
            System.out.println("Condition in one line with condition reversed...");
        // Ternary
        final var ternaryInit = condition ? "is true" : "is false";
        // Print value of ternaryInit
        System.out.println(ternaryInit);
    }
}
