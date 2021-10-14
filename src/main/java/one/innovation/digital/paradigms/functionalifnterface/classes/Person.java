package one.innovation.digital.paradigms.functionalifnterface.classes;

/**
 * Auxiliary class for FunctionalInterface
 */
public class Person {
        private String name;
        private Integer age;

        public Person(){
            name = "Franklin";
            age = 55;
        }

        @Override
        public String toString(){
            return String.format("Name: %s and Age: %s", name, age);
        }
}
