package one.innovation.digital.paradigms.processingsyncasync.threads.carcleaningthread;

import one.innovation.digital.paradigms.processingsyncasync.threads.carcleaningthread.classes.Car;
import one.innovation.digital.paradigms.processingsyncasync.threads.carcleaningthread.classes.Interior;
import one.innovation.digital.paradigms.processingsyncasync.threads.carcleaningthread.classes.abstracts.Parts;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class CarCleaning {
    private static final ExecutorService peopleToDoActivity = Executors.newFixedThreadPool(3);
    public static void main(String[] args) throws InterruptedException {
        //
        Car newCar = new Car(new Interior());
        //
        List<Future<String>> allActivities =
                new CopyOnWriteArrayList<>(newCar.getCarTodoActivity().stream()
                        .map(activity -> peopleToDoActivity.submit(() -> {
                                    try {
                                        return activity.implementActivity();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    return null;
                                })
                        )
                        .collect(Collectors.toList()));
        //
        while (true){
            int notFinishedActivities = 0;
            for (Future<?> nextActivity : allActivities) {
                if (nextActivity.isDone()){
                    try {
                        System.out.printf("Congratulations! You've finished it all with %s. \nBeginning %s...\n", nextActivity.get(), notFinishedActivities);
                        allActivities.remove(nextActivity);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    notFinishedActivities++;
                }
            }
            if (allActivities.stream().allMatch(Future::isDone)){
                System.out.println("You've got it all set!... Thanks!");
                break;
            }
            System.out.printf("Finishing task # %s... \n", notFinishedActivities);
            Thread.sleep(500);
        }
        peopleToDoActivity.shutdown();
    }
}
