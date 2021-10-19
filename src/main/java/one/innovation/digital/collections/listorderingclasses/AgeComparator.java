package one.innovation.digital.collections.listorderingclasses;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat g1, Cat g2) {
        return Integer.compare(g1.getAge(), g2.getAge());
    }
}