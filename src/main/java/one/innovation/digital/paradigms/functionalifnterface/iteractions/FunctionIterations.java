package one.innovation.digital.paradigms.functionalifnterface.iteractions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionIterations {
    public static void main(String[] args) {
        var printableNames = "Franklin";
        String[] names = {"Franklin","Jose","Carlos","Amilcar","Fred","Dão"};
        Integer[] numbers = {1,2,3,4,5,6};

        printFilteredStrings(printableNames, names);
        printFilteredStringsWithStream(printableNames, names);
        // Numbers
        printDoubledNumbers(numbers);
        // Lists
        List<String> listOfOccupations = new ArrayList();
        listOfOccupations.add("Quality Assurance Manager");
        listOfOccupations.add("Tech Manager");
        listOfOccupations.add("Human Resources Manager");
        listOfOccupations.add("Tech Leader");
        listOfOccupations.add("Junior Developer");
        listOfOccupations.add("Senior Developer");
        // Using endsWith
        listOfOccupations.stream()
                .filter(occupation -> occupation.endsWith("Manager"))
                .forEach(System.out::println);
        // Using startsWith
        listOfOccupations.stream()
                .filter(occupation -> occupation.startsWith("Tech"))
                .forEach(System.out::println);
    }

    /**
     *
     * @param printableName
     * @param names
     */
    public static void printFilteredStrings(String printableName, String... names){
        /*
        Create
         */
        String namesToPrint = "";
        for (int i = 0; i < names.length; i++){
            if (names[i].equals(printableName)){
                namesToPrint = " " + names[i];
            }
        }
        System.out.printf("Names from for filtered: %s \n", namesToPrint);
        // All names
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Names from for (not) filtered (%s): %s \n", i, names[i]);
        }
    }
    /**
     *
     * @param printableName
     * @param names
     */
    public static void printFilteredStringsWithStream(String printableName, String... names){
        String namesToPrint = Stream.of(names)
                                .filter(name -> name.equals(printableName))
                                .collect(Collectors.joining());
        System.out.printf("Names from Stream: %s \n", namesToPrint);
        // All names
        Stream.of(names)
                .forEach(name -> System.out.printf("All names from Stream (forEach): %s \n", name));
        // All names ordered
        Stream.of(names)
                .forEachOrdered(System.out::println);
    }

    /**
     * TODO: change output to an Array
     * @param printableName
     * @param names
     */
    public static void printFilteredStringsWithStreamArray(String printableName, String... names){
        String namesToPrint = Stream.of(names)
                .filter(name -> name.equals(printableName))
                .collect(Collectors.joining());
        System.out.println(namesToPrint);
    }

    /**
     *
     * @param numbers
     */
    public static void printDoubledNumbers(Integer... numbers) {
        // Using 'for'
        for (Integer number : numbers){
            System.out.printf("Number in for: %s\n", number * 2);
        }
        // Using 'Stream'
        Stream.of(numbers)
                .map(number -> number * 2)
                .forEach(number -> System.out.printf("Number in Stream: %s\n", number));
        // Using 'Stream' unformatted
        System.out.println("Printing without formatting:");
        Stream.of(numbers)
                .map(number -> number * 2)
                .forEach(System.out::println);
    }
}
