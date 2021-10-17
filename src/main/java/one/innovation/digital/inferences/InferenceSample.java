package one.innovation.digital.inferences;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenceSample {
    public static void main(String[] args) {
        connectAndPrintURLJavaOracle();
        printFullName("Franklin", "Siqueira");
        printSum(1,2,3,5,5,6);
    }
    /**
     *  O que a versão 10 do Java pode inferir / What Java 10 can infer:
     *
     *     // variáveis locais inicializadas
     *     // Initialized local variables
     *     // variável suporte do enhaced for
     *     // Enhanced for support variable
     *     // variável suporte do for iterativo
     *     // Iterative for support variable
     *     // variável try with resource
     *     // try with resource variable
     *
     * O que a versão 10 do Java não infere / What Java 10 CAN NOT infer:
     *
     *     // var não pode ser utilizado a nivel de classe
     *     // Var cannot be implemented at class level
     *     // var nao pode ser utilizado como parametro
     *     // Var cannot be used as a parameter
     *     // var nao pode ser utilizada em variaveis locais nao inicializadas
     *     // Var cannot be employed in not initialized local variables
     *
     *  Referência / Reference
     *     // https://docs.oracle.com/javase/10/language/
     */
    private static void connectAndPrintURLJavaOracle()  {
        try {
            var url = new URL("https://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();

            try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
                System.out.println(bufferedReader
                        .lines()
                        .collect(Collectors.joining())
                        .replaceAll(">", ">\n"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param name
     * @param lastName
     */
    public static void printFullName(String name, String lastName) {
        var fullName = String.format("%s %s", name, lastName);
        System.out.println(fullName);
    }

    /**
     *
     * @param numbers
     */
    public static void printSum(int... numbers) {
        int sum;
        if (numbers.length > 0) {
            sum = 0;
            for (var number = 0; number < numbers.length; number++) {
                sum += numbers[number];
            }
            System.out.println("Sum is: " + sum);
        }
    }
}
