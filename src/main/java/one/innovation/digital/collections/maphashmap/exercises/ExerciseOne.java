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
 * (original from Camila Cavalcante - github.com/cami-la/curso-dio-intro-collections/src/br/com/dio/collection/map/ExercicioProposto01.java /)
 *
 * Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 *  Estado = PE - população = 9.616.621
 *  Estado = AL - população = 3.351.543
 *  Estado = CE - população  = 9.187.103
 *  Estado = RN - população = 3.534.265
 */
public class ExerciseOne {
    public static void main(String[] args) {
        System.out.println("Start.....................................\n");
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> brazilNortheasternStatesPopulation = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(brazilNortheasternStatesPopulation);

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        brazilNortheasternStatesPopulation.put("RN", 3534165);
        System.out.println(brazilNortheasternStatesPopulation);

        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        brazilNortheasternStatesPopulation.put("PB", 4039277);
        System.out.println(brazilNortheasternStatesPopulation);

        System.out.println("Exiba a população do estado PE: " + brazilNortheasternStatesPopulation.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> brazilNortheasternStatesPopulation2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(brazilNortheasternStatesPopulation2);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> brazilNortheasternStatesPopulation3 = new TreeMap<>(brazilNortheasternStatesPopulation);
        System.out.println(brazilNortheasternStatesPopulation3);

        Collection<Integer> populationCollection = brazilNortheasternStatesPopulation.values();
        String mostPopulatedState = "";
        String lessPopulatedState = "";
        for (Map.Entry<String, Integer> entry : brazilNortheasternStatesPopulation.entrySet()) {
            if (entry
                    .getValue()
                    .equals(Collections.max(populationCollection)))
                mostPopulatedState = entry.getKey();
            if (entry
                    .getValue()
                    .equals(Collections.min(populationCollection)))
                lessPopulatedState = entry.getKey();
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                lessPopulatedState, Collections.min(populationCollection));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                mostPopulatedState, Collections.max(populationCollection));

        int sum = 0;
        // Original approach
        /*
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        */
        // IDE suggested approach
        for (Integer integer : brazilNortheasternStatesPopulation.values()) {
            sum += integer;
        }
        System.out.println("Exiba a soma da população desses estados: " + sum);
        /*        
        int soma2 = 0;
        for(Map.Entry<String, Integer> entry : brazilNortheasternStatesPopulation.entrySet()) {
           soma2 += entry.getValue();
        }
        */
        System.out.println("Exiba a média da população deste dicionário de estados: " + (sum / brazilNortheasternStatesPopulation.size()));
        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        // Original approach
        /*
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        */
        // IDE suggested approach
        brazilNortheasternStatesPopulation.values().removeIf(integer -> integer <= 4000000);
        System.out.println(brazilNortheasternStatesPopulation);
        //
        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        brazilNortheasternStatesPopulation.clear();
        System.out.println(brazilNortheasternStatesPopulation.isEmpty() ? "Empty Map!" : brazilNortheasternStatesPopulation);
        // System.out.println("Confira se a lista está vazia: " + brazilNortheasternStatesPopulation.isEmpty());
        System.out.println("Map empty status (just in case): " + brazilNortheasternStatesPopulation.isEmpty());
        System.out.println("End.....................................\n");
    }
}
