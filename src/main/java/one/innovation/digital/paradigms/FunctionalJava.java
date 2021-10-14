package one.innovation.digital.paradigms;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class FunctionalJava {
    public static void main(String[] args) {
        // Functional Paradigm
        //
        // #1 | Interface UnaryOperator<T>, where T is the parameter type
        UnaryOperator<Float> calculateThreeTimes = value -> value*3;
        var value = 10.25F;
        System.out.printf("Result: %.2f \n", calculateThreeTimes.apply(value));
        System.out.printf("Result: " + calculateThreeTimes.apply(10.25F) + "\n");
        // #2 | Interface BiPredicate<T,T>, where both Ts are the parameters types
        BiPredicate<Integer, Integer> checkIfGreater =
                (valueOne, valueForComparison) -> valueOne > valueForComparison;
        int x = 12;
        int y = 13;
        System.out.println("Is " + x + " greater than " + y + "? " + checkIfGreater.test(x,y));
        // Three alternatives: #1 Functional Paradigm | #2 and #3 Imperative Paradigm
        // #1
        int[] values = {1, 3, 6, 8};
        Arrays.stream(values)
                .filter(number -> number % 2 == 0)              // Filter even numbers
                .map(number -> number * 2)                      // Multiply
                .forEach(number -> System.out.println(number)); // Print
        // #2
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0){
                System.out.println(values[i] * 2);
            }
        }
        // #3
        for (int i = 0; i < values.length; i++) {
            int valueInArray = 0;
            if (values[i] % 2 == 0){
                valueInArray = values[i] * 2;
                System.out.println(valueInArray);
            }
        }
    }
}
