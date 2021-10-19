package one.innovation.digital.collections.maporderingclasses;

import java.util.Comparator;
import java.util.Map;

public class NameComparator implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Map.Entry<String, Book> l1, Map.Entry<String, Book> l2) {
        return l1.getValue().getName().compareToIgnoreCase(l2.getValue().getName());
    }
}