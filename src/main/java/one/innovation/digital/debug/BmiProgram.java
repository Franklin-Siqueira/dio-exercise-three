package one.innovation.digital.debug;

import one.innovation.digital.debug.bmi.BmiCalculator;
import one.innovation.digital.debug.person.Person;

public class BmiProgram {
    public static void main(String[] args) {
        // Initialize
        final Person person = new Person("Franklin", 1.7, 74.50);
        final var bmiCalculator = new BmiCalculator();
        final var bmi = bmiCalculator.calculateBmi(person);
        // Print
        // System.out.println(String.format("%s's resulting BMI: %.2f", person.getName(), bmi));
        System.out.printf("%s's resulting BMI: %.2f", person.getName(), bmi);
        // System.out.printf("BMI = %.2f", bmi);
    }
}
