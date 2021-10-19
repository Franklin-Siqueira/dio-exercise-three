package one.innovation.digital.collections.setslinkedhashedsets.exercises.classes;

import java.util.Comparator;

public class IdeComparator implements Comparator<PreferredLanguage> {

    @Override
    public int compare(PreferredLanguage lf1, PreferredLanguage lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}