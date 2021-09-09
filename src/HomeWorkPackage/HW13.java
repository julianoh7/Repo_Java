package HomeWorkPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HW13 {
    public static int hourReturnMethod() {
        DateFormat df1 = new SimpleDateFormat("HH:mm:ss a");
        Calendar cal = Calendar.getInstance();
        System.out.println("Current time : " + cal.getTime());
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        int startTime = cal.get(Calendar.DATE);
        while (cal.get(Calendar.DATE) == startTime) {
            System.out.println(df1.format(cal.getTime()));
            cal.add(Calendar.HOUR, 2);
        }
       return startTime;
    }


    public static void main(String[] args) {

        System.out.println(hourReturnMethod());

        /**
         * Question:
         * Create a method that will take an int as input.
         * Return the timeline (hour am/pm) with 2 hours interval from the current hour
         *
         */

        // sout(generateTimeline(5));
        // 9pm 11pm 1am 3am 5am


        // sout(generateTimeline(5));   // running code around 8:12am
        // 8am 10am 12pm 2pm 4pm

        // sout(generateTimeline(10));   // running code around 3:45pm
        // 3pm 5pm 7pm 9pm 11pm 1am 3am 5am 7am 9am


    }
}
