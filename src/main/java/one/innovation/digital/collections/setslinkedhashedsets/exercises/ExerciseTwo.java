package one.innovation.digital.collections.setslinkedhashedsets.exercises;

import one.innovation.digital.collections.setslinkedhashedsets.exercises.classes.AllPropsComparator;
import one.innovation.digital.collections.setslinkedhashedsets.exercises.classes.CreationYearAndNameComparator;
import one.innovation.digital.collections.setslinkedhashedsets.exercises.classes.IdeComparator;
import one.innovation.digital.collections.setslinkedhashedsets.exercises.classes.PreferredLanguage;

import java.util.*;

/**
 *
 *
 *
 *
 * Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
 * Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
 * a) Ordem de inserção;
 * b) Ordem natural(nome);
 * c) IDE;
 * d) Ano de criação e nome;
 * e) Nome, ano de criação e IDE;
 * Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class ExerciseTwo {
    public static void main(String[] args) {
        Set<PreferredLanguage> myPreferredLanguages = new HashSet<>();
        myPreferredLanguages.add(new PreferredLanguage("Python", 1991, "Pycharm"));
        myPreferredLanguages.add(new PreferredLanguage("JavaScript", 1995, "IntelliJ"));
        myPreferredLanguages.add(new PreferredLanguage("Java", 1991, "Visual Studio Code"));

        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<PreferredLanguage> myPreferredLanguages1 = new LinkedHashSet<>(
                Arrays.asList(
                        new PreferredLanguage("Python", 1991, "Pycharm"),
                        new PreferredLanguage("JavaScript", 1995, "IntelliJ"),
                        new PreferredLanguage("Java", 1991, "Visual Studio Code")
                )
        );
        for (PreferredLanguage language : myPreferredLanguages1) System.out.println(language);

        System.out.println("--------\tOrdem Natural: Nome\t--------");
        Set<PreferredLanguage> myPreferredLanguages2 = new TreeSet<>(myPreferredLanguages);
        for (PreferredLanguage language : myPreferredLanguages2) System.out.println(language);

        System.out.println("--------\tOrdem IDE\t--------");
        Set<PreferredLanguage> myPreferredLanguages3 = new TreeSet<>(new IdeComparator());
        myPreferredLanguages3.addAll(myPreferredLanguages);
        for (PreferredLanguage language : myPreferredLanguages3) System.out.println(language);

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<PreferredLanguage> myPreferredLanguages4 = new TreeSet<PreferredLanguage>(new CreationYearAndNameComparator());
        myPreferredLanguages4.addAll(myPreferredLanguages);
        for (PreferredLanguage language : myPreferredLanguages4) System.out.println(language);

        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<PreferredLanguage> myPreferredLanguages5 = new TreeSet<PreferredLanguage>(new AllPropsComparator());
        myPreferredLanguages5.addAll(myPreferredLanguages3);
        for (PreferredLanguage language : myPreferredLanguages5) System.out.println(language);

    }
}
