package one.innovation.digital.collections.maphashmap;

import one.innovation.digital.collections.maporderingclasses.Book;
import one.innovation.digital.collections.maporderingclasses.NameComparator;

import java.util.*;

/**
 * Map<String, Double> | HashMap<>() | LinkedHashMap<>() | TreeMap<>()
 *
 * English
 * 
 * ...
 *
 * Português
 * (original from Camila Cavalcante - github.com/cami-la/curso-dio-intro-collections/src/br/com/dio/collection/map/ExemploOrdenacaoMap.java)
 *
 * Dadas as seguintes informações sobre meus books favoritos e seus autores,
 * crie um dicionário e ordene este dicionário:
 * exibindo (Nome Autor - Nome Book);
 * Autor = Hawking, Stephen  - Book = nome: Uma Breve História do Tempo. páginas: 256
 * Autor = Duhigg, Charles - Book = nome: O Poder do Hábito, paginas: 408
 * Autor = Harari, Yuval Noah  - Book = 21 Lições Para o Século 21, páginas: 432
*/

public class MapOrdering {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Book> myBooks = new HashMap<>() {{
            put(" Hawking, Stephen", new Book("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Book("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Book("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Book> book : myBooks.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Book> myBooks1 = new LinkedHashMap<>() {{
            put(" Hawking, Stephen", new Book("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Book("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Book("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Book> book : myBooks1.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Book> myBooks2 = new TreeMap<>(myBooks1);
        for (Map.Entry<String, Book> book : myBooks2.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tOrdem alfabética nomes dos books\t--");

        Set<Map.Entry<String, Book>> myBooks3 = new TreeSet<>(new NameComparator());
        myBooks3.addAll(myBooks.entrySet());
        for (Map.Entry<String, Book> book : myBooks3)
            System.out.println(book.getKey() + " - " + book.getValue().getName());

//        System.out.println("--\tOrdem número de página\t--"); // Pra você

    }
}
