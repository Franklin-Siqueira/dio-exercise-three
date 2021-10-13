package one.innovation.digital.dates.manipulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {
    public static void main(String[] args) {
        /**
         *  DateFormat
         */
        Date now = new Date();
        String dateToStr = DateFormat.getInstance().format(now);
        System.out.println(dateToStr);
        // 15/07/19 22:13
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(now);
        System.out.println(dateToStr);
        // 15 de Julho de 2019 22:13
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(now);
        System.out.println(dateToStr);
        // 15 de Julho de 2019 22h13min55s BRT
        /**
         * SimpleDateFormat
         */
        Date nowOn = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(nowOn);
        System.out.println(formattedDate);
        // 14/07/2019
    }
}
