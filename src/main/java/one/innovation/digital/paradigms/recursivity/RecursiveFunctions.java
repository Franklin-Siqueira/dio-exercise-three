package one.innovation.digital.paradigms.recursivity;

import java.util.HashMap;
import java.util.Map;

public class RecursiveFunctions {
    static Map<Integer, Integer> FACTORIAL_MAP =  new HashMap<>();
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(15));
        System.out.println(factorialWithTailCallBase(15));
        // MAP related
        System.out.println("Map Related Snapshots");
        long initialTime = System.nanoTime();
        System.out.println(factorialWithMemoization(15));
        long finalTime = System.nanoTime();
        System.out.println("Factorial ellapsed processing time: " + (finalTime - initialTime));
        //
        initialTime = System.nanoTime();
        System.out.println(factorialWithMemoization(15));
        finalTime = System.nanoTime();
        System.out.println("Factorial ellapsed processing time (2): " + (finalTime - initialTime));
    }
    // Factorial | Recursive
    public static int recursiveFactorial(int value) {
        if (value == 1) {
            System.out.println(value);
            return value;
        } else {
            System.out.println(value);
            return value * recursiveFactorial((value - 1));
        }
    }
    // Factorial | Tail Call -> CAN cause StackOverflow Exception
    public static double factorialWithTailCallBase(double value){
        return factorialWithTailCall(value, 1);
    }
    public static double factorialWithTailCall(double value, double number){
        if (value == 0) {
            return number;
        }
        System.out.printf("Value: %.2f - Number: %.2f \n", value, number);
        return factorialWithTailCall(value - 1, number * value);
    }
    // Recursivity with MAPs
    public static Integer factorialWithMemoization(Integer value){
        if (value == 1) {
            return value;
        } else {
            if (FACTORIAL_MAP.containsKey(value)) {
                return FACTORIAL_MAP.get(value);
            } else {
                Integer result = value * factorialWithMemoization(value - 1);
                FACTORIAL_MAP.put(value, result);
                return result;
            }
        }
    }
}
