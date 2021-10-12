package one.innovation.digital.operators.repetitions;

public class LoopWhile {
    public static void main(String[] args) {
        // Initialize
        var x = 0;
        // Prior condition check
        while (x < 1) {
            System.out.println("Inside while...");
            x++;
        }
        // Initialization
        var y = 0;
        // Check condition after
        do {
            System.out.println("Inside do/while...");
        } while (y++ < 1);
    }
}
