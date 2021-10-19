package one.innovation.digital.collections.setslinkedhashedsets.exercises.classes;

import java.util.Comparator;

public class AllPropsComparator implements Comparator<PreferredLanguage> {

    @Override
    public int compare(PreferredLanguage lf1, PreferredLanguage lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}