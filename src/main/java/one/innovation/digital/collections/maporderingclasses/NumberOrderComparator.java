package one.innovation.digital.collections.maporderingclasses;

import java.util.Comparator;
import java.util.Map;
/**
 *  ExerciseThree
 */
public class NumberOrderComparator implements Comparator<Map.Entry<Integer, Contact>> {
    @Override
    public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
        return Integer.compare(cont1.getValue().getNumber(), cont2.getValue().getNumber());
    }
}