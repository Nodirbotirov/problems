package collection.flowbosConverter.client;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime {
    public DateTime() {
    }

    public static long getDateTimeTicks() {
        long TICKS_AT_EPOCH = 621355968000000000L;
        return System.currentTimeMillis() * 10000 + TICKS_AT_EPOCH;
    }

    public static String getDateTimeString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        return (dateFormat.format(cal.getTime()));
    }

    public static String getDateTimeStringMilliseconds() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Calendar cal = Calendar.getInstance();
        return (dateFormat.format(cal.getTime()));
    }

    public static String getDateString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        return (dateFormat.format(cal.getTime()));
    }
}
