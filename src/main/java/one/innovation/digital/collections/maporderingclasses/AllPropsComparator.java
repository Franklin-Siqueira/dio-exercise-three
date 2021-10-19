package one.innovation.digital.collections.maporderingclasses;

import java.util.Comparator;
import java.util.Map;
/**
 *  ExerciseThree
 */
public class AllPropsComparator implements Comparator<Map.Entry<Integer, Contact>> {
    @Override
    public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
        return cont1.getValue().getName().compareToIgnoreCase(cont2.getValue().getName());
    }
}