package one.innovation.digital.streaminterfaces.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOverview {
    public static void main(String[] args) {
        List<String> randomNumbers =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Elements with REFERENCE METHOD (with STREAM): ");
        randomNumbers.stream()
                 .forEach(System.out::println);

        System.out.println("Elements with REFERENCE METHOD: ");
        randomNumbers.forEach(System.out::println);

        System.out.println("First 5 elements to SET | Pegue os 5 primeiros números e coloque dentro de um Set:");
        randomNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        //
        Set<String> firstFiveRandomNumbers = randomNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(firstFiveRandomNumbers);
        //
        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        List<Integer> randomNumbers1 = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //
        List<Integer> randomNumbersInteger = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //.forEach(System.out::println);
        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        randomNumbers.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //
        List<Integer> evenNumbersGreaterThan2 = randomNumbers.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(evenNumbersGreaterThan2);

        System.out.println("Average | Mostre a média dos números: ");
        /*
        randomNumbers1.stream()
                .average()
                .ifPresent(System.out::println);
        */
        randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        //
        System.out.println("Remove odd numbers | Remova os valores ímpares: ");
        randomNumbers1.removeIf(integer -> integer % 2 != 0);
        System.out.println(randomNumbers1);
//        randomNumbersInteger.removeIf(i -> (i % 2 != 0));
//        System.out.println(randomNumbersInteger);

//        Para você
        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        randomNumbersInteger.stream()
                .skip(3)
                .forEach(System.out::println);

        long countNumerosUnicos = randomNumbersInteger.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        randomNumbersInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        randomNumbersInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);;

        int somaDosNumerosPares = randomNumbersInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> naturalOrderNumbers = randomNumbersInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(naturalOrderNumbers);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = randomNumbersInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}
