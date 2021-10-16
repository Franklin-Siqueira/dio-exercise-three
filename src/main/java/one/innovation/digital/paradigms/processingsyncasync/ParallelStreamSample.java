package one.innovation.digital.paradigms.processingsyncasync;

import java.util.stream.IntStream;

public class ParallelStreamSample {
    public static void main(String[] args) {
        //
        long begin = System.currentTimeMillis();
        //
        IntStream.range(1,100000).forEach(num -> factorial(num));
        long end = System.currentTimeMillis();
        System.out.println("Serial execution time = " + (end - begin));
        //
        begin = System.currentTimeMillis();
        //
        IntStream.range(1,100000).parallel().forEach(num -> factorial(num));
        end = System.currentTimeMillis();
        System.out.println("Parallel execution time = "+(end - begin));
    }
    /**
     *
     * @param num
     * @return
     */
    public static long factorial(long num){
        long fat = 1;
        for (long i = 2; i <= num ; i++) {
            fat *= i;
        }
        return fat;
    }
}
