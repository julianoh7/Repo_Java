package HomeWorkPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HW1 {
    public static void main(String[] args) {
        System.out.println("hw1");

// 1. number of hours in a day (byte)
        byte hoursPerDay = 24;


// 2. max no. of days in an year
        short daysPerYear = 365;

// 3. total number of employees in an organization (IBM)
        int numberOfEmployees = 345900;

// 4. population in a country (USA)
        long usaPopulation = 331002651L;


// 5. mortgage rate
        float mortgageRate = 2.8f;


// 6. balance in a bank account
        short accountBalance = 30000;


// 7. does the sun rise from the west? Store answer
        boolean sunRiseFromTheWest = false;

// 8. initials of your name (^Use: char)

      char myInitial = 'J';

        System.out.println(hourReturnMethod(4));
        /**
         * Question:
         * Create a method that will take an int as input.
         * Return the timeline (hour am/pm) with 2 hours interval from the current hour
         *
         */

    }
    public static Date hourReturnMethod(int arr) {
        Date time= new Date();
        SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss a");
        String currentTime =df.format(time);
        //Integer timeInteger = Integer.valueOf(currentTime);


        System.out.println("-----" +currentTime);
        return time;

    }


}
