package one.innovation.digital.collections.listorderingclasses;

import java.util.Comparator;

public class ColorComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat g1, Cat g2) {
        return g1.getColor().compareToIgnoreCase(g2.getColor());
    }
}