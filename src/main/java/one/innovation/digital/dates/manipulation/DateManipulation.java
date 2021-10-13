package one.innovation.digital.dates.manipulation;

import java.time.Instant;
import java.util.Date;

public class DateManipulation {
    public static void main(String[] args) {
        /**
         New Date instance
        */
        Date newDate = new Date();
        System.out.println(newDate);
        /**
         * New Date instance in milliseconds parameter
        */
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        // Ex. 1563127311564
        Date newDateOne = new Date(currentTimeMillis);
        System.out.println(newDateOne);
        // Ex. Sun Jul 14 15:01:51 BRT 2019
        /**
         * Comparing past and future Date
        */
        Date pastDate = new Date(1513124807691L);
        //Tue Dec 12 22:26:47 BRST 2017
        Date futureDate = new Date(1613124807691L);
        //Fri Feb 12 08:13:27 BRST 2021
        // Comparing if pastDate is AFTER futureDate
        boolean isAfter = pastDate.after(futureDate);
        System.out.println(isAfter);
        //false
        // Comparing if pastDate is BEFORE futureDate
        boolean isBefore = pastDate.before(futureDate);
        System.out.println(isBefore);
        //true
        /**
         * CompareTo and equals
        */
        Date pastDateTwo = new Date(1513124807691L);        // Tue Dec 12 22:26:47 BRST 2017
        Date futureDateTwo = new Date(1613124807691L);      // Fri Feb 12 08:13:27 BRST 2021
        Date sameFutureDate = new Date(1613124807691L);  // Fri Feb 12 08:13:27 BRST 2021
        // Comparing if dates are equal
        boolean isEquals = futureDateTwo.equals(sameFutureDate);
        System.out.println(isEquals); //true
        // Comparing dates
        int compareCase1 = pastDateTwo.compareTo(futureDateTwo);        // past -> future
        int compareCase2 = futureDateTwo.compareTo(pastDateTwo);        // future -> past
        int compareCase3 = futureDateTwo.compareTo(sameFutureDate);  // equal
        System.out.println(compareCase1); // -1
        System.out.println(compareCase2); // 1
        System.out.println(compareCase3); // 0
        /**
         * Using Instant
         */
        Date initialDate = new Date(1513124807691L);
        System.out.println(initialDate);
        // Tue Dec 12 22:26:47 BRST 2017
        Instant instant = initialDate.toInstant();
        System.out.println(instant);
        // 2017-12-13T00:26:47.691Z
    }
}
