package one.innovation.digital.streaminterfaces.refactoring;

import one.innovation.digital.streaminterfaces.classes.Contact;

import java.util.*;

/**
 * MapOrderRefactoring
 *
 *
 *
 * Dadas as seguintes informações  de id e Contact, crie um dicionário e
 * ordene este dicionário exibindo (Nome id - Nome Contact);
 * id = 1 - Contact = nome: Simba, numero: 2222;
 * id = 4 - Contact = nome: Cami, numero: 5555;
 * id = 3 - Contact = nome: Jon, numero: 1111;
*/
public class MapOrderRefactoring {
    public static void main(String[] args) {
        System.out.println("|    Start processing...    |_________________________");
        System.out.println("|    Ordem aleatória    |_________________________");
        Map<Integer, Contact> agenda = new HashMap<>() {{
            put(1, new Contact("Simba", 5555));
            put(4, new Contact("Cami", 1111));
            put(3, new Contact("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contact> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("|    Ordem Inserção    |_________________________");
        Map<Integer, Contact> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contact("Simba", 5555));
            put(4, new Contact("Cami", 1111));
            put(3, new Contact("Jon", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contact> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("|    Ordem id    |_________________________");
        Map<Integer, Contact> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contact> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("|    Ordem número telefone    |_________________________");
        // Using ANONYMOUS FUNCTION
        /*
        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contact>>() {
            @Override
            public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
                return Integer.compare(cont1.getValue().getNumber(), cont2.getValue().getNumber());
            }
        });
        */
        // Using FUNCTIONAL INTERFACE
        /*
        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contact>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contact> cont) {
                        return cont.getValue().getNumber();
                    }
                }));
        */
        // Using LAMBDA FUNCTION
        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumber()));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contact> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() +
                    ": " + entry.getValue().getName());
        }
        // Using LAMBDA FUNCTION (again)
        System.out.println("|    Ordem nome Contact    |_________________________");
        // precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contact>> set1 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getName()));
        set1.addAll(agenda.entrySet());
        // imprimindo usando forEach
        set1.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().getName()));
        System.out.println("|    End processing...    |_________________________");
    }
}

/*class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contact>> {
    @Override
    public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
        return Integer.compare(cont1.getValue().getNumber(), cont2.getValue().getNumber());
    }
}*/

/*class ComparatorOrdemNomeContact implements Comparator<Map.Entry<Integer, Contact>> {
    @Override
    public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}*/
