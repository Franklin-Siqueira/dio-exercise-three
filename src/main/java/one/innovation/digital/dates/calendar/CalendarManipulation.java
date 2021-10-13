package one.innovation.digital.dates.calendar;

import java.util.Calendar;

public class CalendarManipulation {
    public static void main(String[] args) {
        /**
         * Calendar manipulation
         *
         * Remarks:
         * Observe that nowBase value changes after each method manipulation
         */
        Calendar nowBase = Calendar.getInstance();
        System.out.println("Current date: " + nowBase.getTime());
        // Current date: Sun Jul 14 20:50:31 BRT 2019
        nowBase.add(Calendar.DATE, -15);
        System.out.println("15 days ago: " + nowBase.getTime());
        // 15 days ago: Sat Jun 29 20:50:31 BRT 2019
        nowBase.add(Calendar.MONTH, 4);
        System.out.println("4 months after: " + nowBase.getTime());
        // 4 months after: Tue Oct 29 20:50:31 BRT 2019
        nowBase.add(Calendar.YEAR, 2);
        System.out.println("2 years after: " + nowBase.getTime());
        // 2 years after: Fri Oct 29 20:50:31 BRT 2021
        /**
         *  Date convertions
         */
        Calendar nowOn = Calendar.getInstance();
        System.out.printf("%tc\n", nowOn);
        // Dom jul 14 20:58:11 BRT 2019
        System.out.printf("%tF\n", nowOn);
        // 2019-07-14
        System.out.printf("%tD\n", nowOn);
        // 07/14/19
        System.out.printf("%tr\n", nowOn);
        // 08:58:11 PM
        System.out.printf("%tT\n", nowOn);
        // 20:58:11
        /**
         * Calendar Instance properties
         */
        Calendar now = Calendar.getInstance();
        System.out.println(now);
        /*  java.util.GregorianCalendar[
                time=1563147161361,
                areFieldsSet=true,
                areAllFieldsSet=true,
                lenient=true,
                zone=sun.util.calendar.ZoneInfo[
                    id="America/Sao_Paulo",
                    offset=-10800000,
                    dstSavings=3600000,
                    useDaylight=true,
                    transitions=129,
                    lastRule=java.util.SimpleTimeZone[
                        id=America/Sao_Paulo,
                        offset=-10800000,
                        dstSavings=3600000,
                        useDaylight=true,
                        startYear=0,
                        startMode=3,
                        startMonth=10,
                        startDay=1,
                        startDayOfWeek=1,
                        startTime=0,
                        startTimeMode=0,
                        endMode=3,
                        endMonth=1,
                        endDay=15,
                        endDayOfWeek=1,
                        endTime=0,
                        endTimeMode=0
                    ]
                ],
                firstDayOfWeek=1,
                minimalDaysInFirstWeek=1,
                ERA=1,
                YEAR=2019,
                MONTH=6,
                WEEK_OF_YEAR=29,
                WEEK_OF_MONTH=3,
                DAY_OF_MONTH=14,
                DAY_OF_YEAR=195,
                DAY_OF_WEEK=1,
                DAY_OF_WEEK_IN_MONTH=2,
                AM_PM=1,
                HOUR=8,
                HOUR_OF_DAY=20,
                MINUTE=32,
                SECOND=41,
                MILLISECOND=361,
                ZONE_OFFSET=-10800000,
                DST_OFFSET=0
             ]
        */
    }
}
