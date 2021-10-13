package one.innovation.digital.debug.bmi;

import one.innovation.digital.debug.person.Person;

public class BmiCalculator {
    /**
     * Less than 18,5           UNDERWEIGHT     0
     * Between 18,5 and 24,9    NORMAL          0
     * Between 25,0 and 29,9    OVERWEIGHT      I
     * Between 30,0 and 39,9    OBESITY         II
     * More than 40,0           OBESITY GRAVE   III
     */
    public Double calculateBmi(final Person person) {
        // Initialize
        final var height = person.getHeight();
        final var bmi = person.getWeight() / (height * height);
        // Return
        // return bmi;
        return person.getWeight() / (height * height);
    }
}
