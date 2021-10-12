package one.innovation.digital.operators.equality;

public class EqualityOperators {
    public static void main(String[] args) {

        final var firstNumber = 11;

        if (firstNumber == 10) {
            System.out.println("Number is 10");
        } else {
            System.out.println("Number is not 10");
        }

        if (firstNumber != 10) {
            System.out.println("Number is not 10");
        } else {
            System.out.println("Number is 10");
        }

        final var firstLetter = "B";

        if ("A".equals(firstLetter)) {
            System.out.println("It's letter A");
        }

        if (!firstLetter.equals("A")) {
            System.out.println("It's not letter A");
        }
    }
}
