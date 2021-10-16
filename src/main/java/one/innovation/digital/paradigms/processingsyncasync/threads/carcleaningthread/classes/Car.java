package one.innovation.digital.paradigms.processingsyncasync.threads.carcleaningthread.classes;

import one.innovation.digital.paradigms.processingsyncasync.threads.carcleaningthread.classes.abstracts.Parts;
import one.innovation.digital.paradigms.processingsyncasync.threads.carcleaningthread.interfaces.Activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class Car
 *
 */
public class Car {
    private List<Parts> partsList;
    /**
     *
     * @param partsList
     */
    public Car(Parts... partsList) {
        this.partsList = Arrays.asList(partsList);
    }
    /**
     *
     * @return
     */
    public List<Activity> getCarTodoActivity() {
        return this.partsList.stream().map(Parts::getCarTodoActivity)
                .reduce(new ArrayList<Activity>(), (pivot, getCarTodoActivity) -> {
                    pivot.addAll(getCarTodoActivity);
                    return pivot;
                });
    }
}
