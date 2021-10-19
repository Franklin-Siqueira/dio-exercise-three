package one.innovation.digital.collections.listslinkedlists.exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Exercise #1
 *
 * English
 *
 * Implement a solution that takes average temperatures of the first 6 months of a fake place and year.
 * Then, save them in a list. After doing that, print the average temperature on that semester and all
 * temperatures (with their respective months) above and below that average (e.g., 1 - January, 2 - February, and
 * so on and so forth).
 *
 * Portuguese
 *
 * Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
 * e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
 */
public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperatures = new ArrayList<Double>();
        // Get temperatures
        // Adiciona as temperatures na lista:
        int count = 0;
        while (true) {
            if (count == 6) break;
            System.out.print("Add first month temperature / Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperatures.add(temp);
            count++;
        }
        System.out.println("--------------------------------------------------");
        // Showing temperatures
        // exibe todas as temperatures:
        System.out.print("All registered temperatures / Todas as temperaturas: ");
        temperatures.forEach(t -> System.out.print(t + " "));
        // Processing temperatures and calculating average
        // calcula e exibe a média das temperatures:
        double average = temperatures.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nAverage temperature / Média das temperatures: %.1f\n", average);
        // Show above average temperatures
        // exibe as temperatures acima da média
        System.out.print("Above average temperatures / Temperaturas acima da média: ");
        temperatures.stream()
                .filter(t -> t > average)
                .forEach(t -> System.out.printf("%.1f ", t));
        // Show the month with above average temperatures
        //exibe o mês das temperatures acima da média por extenso:
        System.out.println("\n\nAbove average temperature months / Meses das temperatures acima da média: ");
        //
        Iterator<Double> iterator = temperatures.iterator();
        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > average) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - January: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - February: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - March: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - April: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - May: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - June: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("No temperatures above average were observed!");
                }
            }
            count++;
        }
    }
}
// Other approach
/*
public class ExercicioProposto01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturesSemestral = new ArrayList<Double>();
        double soma = 0.0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Qual a temperatura do mês " + i + ": ");
            double temp = scan.nextDouble();
            temperaturesSemestral.add(temp);
            soma += temp;
        }
        double mediaTemperaturasSemenstral = soma/temperaturesSemestral.size();
        System.out.println("Temperaturas Semestral: " + temperaturesSemestral);
        System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + "oC");
        System.out.println("----------");
        for (Double temp : temperaturesSemestral) {
            if(temp > mediaTemperaturasSemenstral) {
                int index = temperaturesSemestral.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
*/
