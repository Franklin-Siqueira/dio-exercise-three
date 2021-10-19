package one.innovation.digital.collections.maphashmap.exercises;

import one.innovation.digital.collections.maporderingclasses.AllPropsComparator;
import one.innovation.digital.collections.maporderingclasses.NumberOrderComparator;
import one.innovation.digital.collections.maporderingclasses.Contact;

import java.util.*;
/**
 *  Dadas as seguintes informações  de id e contato, crie um dicionário e
 *  ordene este dicionário exibindo (Nome id - Nome contato);
 *  id = 1 - Contato = nome: Simba, numero: 2222;
 *  id = 4 - Contato = nome: Cami, numero: 5555;
 *  id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class ExerciseThree {
    public static void main(String[] args) {
        System.out.println("Start.....................................\n");
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contact> agenda = new HashMap<>() {{
            put(1, new Contact("Simba", 5555));
            put(4, new Contact("Cami", 1111));
            put(3, new Contact("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contact> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contact> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contact("Simba", 5555));
            put(4, new Contact("Cami", 1111));
            put(3, new Contact("Jon", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contact> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contact> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contact> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("--\tOrdem número telefone\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(new NumberOrderComparator());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contact> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() +
                    ": " +entry.getValue().getName());
        }

        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contact>> set1 = new TreeSet<>(new AllPropsComparator());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contact> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }
        System.out.println("\nEnd.....................................\n");
    }
}

