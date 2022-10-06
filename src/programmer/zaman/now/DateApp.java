package programmer.zaman.now;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Calendar calendarNow = Calendar.getInstance();
        Integer yearNow = calendarNow.get(Calendar.YEAR);
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, 2000);
//        calendar.set(Calendar.DAY_OF_MONTH, Calendar.AUGUST);
//        Date newCalendar = calendar.getTime();
//        long newCalendarToMillis = calendar.getTimeInMillis();
//        long getYearMillis =  newTanggal - newCalendarToMillis;

        Calendar calendarSet = Calendar.getInstance();
        calendarSet.set(Calendar.YEAR, 2000);
        Integer yearSet = calendarSet.get(Calendar.YEAR);

        System.out.println(yearNow - yearSet + " years");
//
//        System.out.println(newCalendar);

    }
}
