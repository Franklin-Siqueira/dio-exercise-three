package one.innovation.digital.operators.repetitions;

import java.util.stream.IntStream;

public class LoopFor {
    public static void main(String[] args) {
        // With curly brackets
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("I = " + i);
        }
        // Without curly brackets (with one line only)
        for (int x = 0; x <= 5; x++)
            System.out.println("X = " + x);
        //
        IntStream.of(1,2,3,4,5).forEach(n-> {
            System.out.println("Number (with IntStream.of(1,2,3,4,5)) = " + n);
        });
        //
        IntStream.range(0,3).forEach(n->{
            System.out.println("Number (with IntStream.range(0,3)) = " + n);
        });
    }
}
