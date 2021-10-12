package one.innovation.digital.operators.relationals;

public class RelationOperators {
    public static void main(String[] args) {
        // Initialize
        final var newNumber = 6;
        // Relational Conditions
        if (newNumber > 20) {
            System.out.println("Number is greater than 20");
        } else if (newNumber >= 10) {
            System.out.println("Number is greater than or equal to 10");
        } else if (newNumber <= 5) {
            System.out.println("Number is lesser than or equal to 5");
        } else {
            System.out.println("Not a valid option!");
        }
    }
}
