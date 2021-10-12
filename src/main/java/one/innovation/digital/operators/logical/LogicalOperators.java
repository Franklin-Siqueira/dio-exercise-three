package one.innovation.digital.operators.logical;

public class LogicalOperators {
    public static void main(String[] args) {
        // Initialization
        final var newNumber = 2;
        final var newLetter = "A";
        // Short Circuit: validate after checking the first condition - if "||" is used
        if (newNumber < 5 && newLetter.equals("A")) {
            System.out.println("Meets condition");
        }
        if (newNumber < 5 || newLetter.equals("A")) {
            System.out.println("Meets another condition");
        }
        if ((10 - 5) > 1 && (5 - 3) > 1) {
            System.out.println("Nonsense logic...");
        }

        // Non Short Circuit: checks both arguments
        if (checkFunction(8) & checkFunction("A")) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }

    }
    //
    private static boolean checkFunction(String letterArg) {
        System.out.println("Checking letter...");
        return letterArg.equals("A");
    }
    //
    private static boolean checkFunction(Integer numberArg) {
        System.out.println("Checking number...");
        return numberArg > 10;
    }
}
