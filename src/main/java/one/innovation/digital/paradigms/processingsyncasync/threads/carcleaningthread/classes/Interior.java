package one.innovation.digital.paradigms.processingsyncasync.threads.carcleaningthread.classes;

import one.innovation.digital.paradigms.processingsyncasync.threads.carcleaningthread.classes.abstracts.Parts;
import one.innovation.digital.paradigms.processingsyncasync.threads.carcleaningthread.interfaces.Activity;

import java.util.Arrays;
import java.util.List;

public class Interior extends Parts {
    @Override
    public List<Activity> getCarTodoActivity() {
        //
        return Arrays.asList(
                this::cleanInteriorRoof,
                this::cleanBackSeat,
                this::cleanFrontSeat
        );
    }
    /**
     *
     * @return
     * @throws InterruptedException
     */
    private String cleanInteriorRoof() throws InterruptedException {
        String cleanRoof = "clean car roof task...";
        System.out.println(cleanRoof);
        Thread.sleep(5000);
        return cleanRoof;
    }
    /**
     *
     * @return
     * @throws InterruptedException
     */
    private String cleanBackSeat() throws InterruptedException {
        String cleanBackSeat = "clean back seat task...";
        System.out.println(cleanBackSeat);
        Thread.sleep(7000);
        return cleanBackSeat;
    }
    /**
     *
     * @return
     * @throws InterruptedException
     */
    private String cleanFrontSeat() throws InterruptedException {
        String cleanFrontSeat = "clean front seat(s) task...";
        System.out.println(cleanFrontSeat);
        Thread.sleep(10000);
        return cleanFrontSeat;
    }
}
