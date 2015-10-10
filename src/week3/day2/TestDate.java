package week3.day2;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by Ihor Samanchuk on 04.10.2015.
 */
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long millis = date.getTime();
        System.out.println(millis);
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTimeZone());
    }
}
