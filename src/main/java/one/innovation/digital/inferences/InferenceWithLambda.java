package one.innovation.digital.inferences;

import java.util.function.Function;

public class InferenceWithLambda {
    public static void main(String[] args) {
        Function<Integer,Double> divideByTwo = (var number) -> number / 2.0;
        System.out.println(divideByTwo.apply(9849387));
    }
}
