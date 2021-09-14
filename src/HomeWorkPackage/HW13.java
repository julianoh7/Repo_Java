package HomeWorkPackage;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class HW13 {
    public static List<String> generateTimeLine(int userNum) {
        List<String> timeline = new ArrayList<>();

        SimpleDateFormat date = new SimpleDateFormat("haa");//format date to required format
        Calendar cal = Calendar.getInstance(); //get a calendar using the current time zone

        //'for loop' to repeat code userNum times
        for (int i = 0; i < userNum; i++) {
            String hour = date.format(cal.getTime()).toLowerCase(); //format calender time to required (lower case)
            timeline.add(hour); //add value to output list
            cal.add(Calendar.HOUR, 2); // add 2 hours to calendar
        }
        return timeline;

<<<<<<< HEAD
    }

=======
        System.out.println(hourReturnMethod());
        /**
         * Question:
         * Create a method that will take an int as input.
         * Return the timeline (hour am/pm) with 2 hours interval from the current hour
         *
         */
>>>>>>> main

    public static void main(String[] args) {
        System.out.println(generateTimeLine(5));
    }





}
