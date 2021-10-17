//requires utils.one.innovation.digital.utils.caller.Calculator;

import utils.caller.Calculator;

public class Main {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println(calculator.sum(1,2));
    System.out.println(calculator.sub(1,2));
    System.out.println(calculator.mult(1,2));
    System.out.println(calculator.div(1,2));
    }
}