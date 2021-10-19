package one.innovation.digital.collections.setslinkedhashedsets.exercises.classes;

import java.util.Comparator;

public class CreationYearAndNameComparator implements Comparator<PreferredLanguage> {

    @Override
    public int compare(PreferredLanguage lf1, PreferredLanguage lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}