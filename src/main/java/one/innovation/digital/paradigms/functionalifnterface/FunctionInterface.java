package one.innovation.digital.paradigms.functionalifnterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterface {
    public static void main(String[] args) {
        FunctionOne createPrefixString = new FunctionOne() {
            @Override
            public String createStringValue(String value) {
                return "Mr " + value;
            }
        };
        final var nameOne = "John Doe";
        final var message = String.format("Dear %s,", createPrefixString.createStringValue(nameOne));
        // Print | .println
        System.out.println(message);
        System.out.println(String.format("Dear %s,", createPrefixString.createStringValue(nameOne)));
        System.out.println("Dear " + createPrefixString.createStringValue(nameOne) + ",");
        // Print | .printf
        System.out.printf("Dear %s,\n", createPrefixString.createStringValue(nameOne));
        //
        // With Lambda
        //
        FunctionOne createStringValueLambda = value -> "Mr " + value;
        System.out.printf("Dear %s,\n", createStringValueLambda.createStringValue(nameOne));
        // With Lambda and void | FunctionTwo
        FunctionTwo createStringValueLambdaVoid = value -> System.out.printf("Dear Mr %s,\n", value);
        createStringValueLambdaVoid.createStringValue("Franklin");
        // With Lambda and more than one instruction | FunctionOne
        // In this case, prints the expression twice
        FunctionOne createStringValueLambdaTwo = value -> {
            System.out.printf("Dear %s,\n", value);
            return value;
        };
        System.out.printf("Dear %s,\n", createStringValueLambdaTwo.createStringValue(nameOne));
        //.
        FunctionCalculate sumNm = (a, b) -> a + b;
        FunctionCalculate subtractNm = (a, b) -> a - b;
        FunctionCalculate divideNm = (a, b) -> a / b;
        FunctionCalculate multiplymNm = (a, b) -> a * b;
        // Values
        var valueOne = 10;
        var valueTwo = 20;
        // Print
        System.out.printf("Result: %.3f \n", runCalculation(sumNm, valueOne, valueTwo));
        System.out.printf("Result: %.3f \n", runCalculation(subtractNm, valueOne, valueTwo));
        System.out.printf("Result: %.3f \n", runCalculation(divideNm, valueOne, valueTwo));
        System.out.printf("Result: %.3f \n", runCalculation(multiplymNm, valueOne, valueTwo));
        //
        // API Consumer
        //
        Consumer<String> printText = textInput -> System.out.println("This is the text: " + textInput);
        printText.accept("Hi there...");
        // Without my hands (rsssss...) | Using Reference Method
        Consumer<String> printTextTwo = System.out::println;
        printTextTwo.accept("Hi there...");
        //
        // API Function
        //
        var textStringVar = "Franklin Siqueira";
        var textStringVar2 = "20";
        Function<String, String> returnInverseString = textString -> new StringBuilder(textString).reverse().toString();
        System.out.println(returnInverseString.apply(textStringVar));
        //
        Function<String, Integer> returnValueOfString = string -> Integer.valueOf(string);
        System.out.println(returnValueOfString.apply(textStringVar2));
        //
        // API Predicate
        //
        Predicate<String> isEmptyString = testValue -> testValue.isEmpty();
        System.out.println(isEmptyString.test(textStringVar));
        //
        Predicate<String> isEmptyStringTwo = String::isEmpty;
        System.out.println(isEmptyStringTwo.test(textStringVar));
        //
        // API Supplier<T>
        //
        Supplier<Person> supplierTest = () -> new Person();
        System.out.println(supplierTest.get());
        //
        Supplier<Person> supplierTestTwo = Person::new;
        System.out.println(supplierTestTwo.get());
    }
    // High Order Function
    public static float runCalculation(FunctionCalculate calculate, float a, float b){
        return calculate.calculateValue(a,b);
    }
}
@FunctionalInterface
interface FunctionOne {
    String createStringValue(String value);
}
@FunctionalInterface
interface FunctionTwo {
    void createStringValue(String value);
}
@FunctionalInterface
interface FunctionCalculate {
    public float calculateValue(float valueA, float valueB);
}
//
class Person {
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