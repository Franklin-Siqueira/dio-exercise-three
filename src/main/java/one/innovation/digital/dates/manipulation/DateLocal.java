package one.innovation.digital.dates.manipulation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateLocal {
    public static void main(String[] args) {
        /**
         * Using LocalDate
         */
        LocalDate today = LocalDate.now();
        System.out.println(today);
        // Ex. 2021-10-13
        /**
         *  Manipulating LocalDate
         */
        LocalDate todayOn = LocalDate.now();
        LocalDate yesterday = todayOn.minusDays(1);
        System.out.println(todayOn);
        // 2019-07-14
        System.out.println(yesterday);
        // 2019-07-13
        /**
         *  LocalTime
         */
        LocalTime localTimeNow = LocalTime.now();
        System.out.println(localTimeNow);
        /**
         *  Manipulation of LocalTime
         */
        LocalTime oneHourMore = localTimeNow.plusHours(1);
        System.out.println(oneHourMore);
        // Ex. 00:55:37.421
        /**
         *  Using and manipulating LocalDateTime
         */
        LocalDateTime todayLocalDetails = LocalDateTime.now();
        System.out.println(todayLocalDetails);
        // Ex. 2019-07-15T00:02:16.076
        LocalDateTime futuro = todayLocalDetails.plusHours(1).plusDays(2).plusSeconds(12);
        System.out.println(futuro);
        // Ex. 2019-07-17T01:02:28.076
    }
}
