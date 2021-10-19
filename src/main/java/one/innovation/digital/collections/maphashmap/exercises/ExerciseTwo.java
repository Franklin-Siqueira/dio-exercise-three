package one.innovation.digital.collections.maphashmap.exercises;

import java.util.*;

/**
 * Map<String, Double> | HashMap<>() | LinkedHashMap<>() | TreeMap<>()
 *
 * English
 *
 * ...
 *
 * Português
 * (original from Camila Cavalcante - github.com/cami-la/curso-dio-intro-collections/src/br/com/dio/collection/map/ExercicioProposto02.java /)
 *
 * Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
 * Depois, mostre quantas vezes cada valor foi conseguido.
 */
public class ExerciseTwo {
    public static void main(String[] args) {
        System.out.println("Start.....................................\n");
        int roundsQty = 100;
        //
        List<Integer> values = new ArrayList<>();
        Random roundGenerator = new Random();
        for (int i = 0; i < roundsQty; i++) {
            int number = roundGenerator.nextInt(6) + 1;
            values.add(number);
        }
        //
        Map<Integer, Integer> rounds = new HashMap<>();
        for (Integer results : values) {
            if (rounds.containsKey(results))
                rounds.put(results, (rounds.get(results) + 1));
            else rounds.put(results, 1);
        }
        //
        System.out.print("Now playing | Jogando");
        //conteúdo do for + try/cath - totalmente opcional
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //
        System.out.println(" \nResults:.....................");
        System.out.println("Valor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : rounds.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
        System.out.println("End.....................................\n");
    }
}
