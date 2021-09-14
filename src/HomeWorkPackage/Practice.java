package HomeWorkPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String cityName = "New YOrk is BESt Place";
        String cityName_0To5 = cityName.substring(0, 5);
        System.out.println("cityName : " + cityName);
        System.out.println("cityName_0To5 : " + cityName_0To5);


        ;
        String student1 = "alsa";
        String student2 = "alsb";
        String student3 = "alsc";
        String[] top3Students = new String[3];
        int top3Students_Length = top3Students.length;
        System.out.println(" Length of top3Students is " + top3Students_Length);
        ;


        String[] bottom3Students = new String[3];
        int bottom3Students_Length = top3Students.length;
        System.out.println("Length of bottom3Students array :" + bottom3Students_Length);
        bottom3Students[0] = "Happy";
        bottom3Students[1] = "Happi";
        bottom3Students[2] = "Happu";

        System.out.println("bottom3Students : " + Arrays.toString(bottom3Students));

        ;

        cityName = "New York city is best city in the world";
        String[] cityName_split_i = cityName.split("i");
        System.out.println("Array split by 'i' : " + Arrays.toString(cityName_split_i));
        String[] cityNamee_split_Space = cityName.split(" ");
        System.out.println("Array split by ' ' : " + Arrays.toString(cityNamee_split_Space));
        ;
        ;

        double[] topBills = new double[5];
        topBills[0] = 23.32;
        topBills[1] = 10;
        topBills[2] = 22.2;
        topBills[3] = 98.76;
        // topBills [4] should be sum of index-2 and index-3 values
        topBills[4] = topBills[2] + topBills[3];
        System.out.println("topBills array -> " + Arrays.toString(topBills));
        // Store the value at index-2 in new variable (foodBill)
        double foodBill = topBills[2];
        //change the value at index 3
        // new value should be the average of value at index 0&1
        topBills[3] = (topBills[0] + topBills[1]) / 2;
        System.out.println("topBills array --> " + Arrays.toString(topBills));

        String sentence5 = "I like food";
        String[] sentence5Split = sentence5.split("");
        System.out.println(Arrays.toString(sentence5Split));
        int sentence5Length = sentence5Split.length;
        System.out.println(sentence5Length + "\n");


        ;
//July 19

        int num1 = 10;
        // IF the number (num1) is less than 5 print "less than 5" else print "greater than5"
        if (num1 < 5) {
            System.out.println("less than 5");
        } else {
            System.out.println("greater than 5");
        }

        int nr1 = 1;
        // IF the number (num1) is less than 5 print "less than 5" else print "greater than5"
        if (nr1 < 5) {
            System.out.println("less than 5");
        } else {
            System.out.println("greater than 5");
        }
        ;


        int num = 15;

        if (num % 2 == 0 && num < 20) {
            System.out.println(num + " * 10 = " + (num * 10));
            System.out.println(num + "divisible by 2");
        } else if (num % 5 == 0 || num % 3 == 0) {
            System.out.println(" remainder of " + num + " when divided by 2 : " + num % 2);
            System.out.println(num + " divisible by 5 or 3 ");
        } else if (num < 20) {
            System.out.println(num + " less than 20");
        }


        String day = "";                // weekday or weekend
        String clothes = "";            // casual, formals, suit
        boolean anyMeeting = true;      // true or false
        /**
         * day = weekend ; clothes = casual
         * day = weekdays and I have meetings ; clothes = suit
         * day = weekdays and I have no meetings ; clothes = formals
         */
        if (day.equalsIgnoreCase("weekend")) {
            clothes = "casual";
        } else if (day.equalsIgnoreCase("weekdays") && anyMeeting) {
            clothes = "suit";
        } else if (day.equalsIgnoreCase("weekdays") && !anyMeeting) {
            clothes = "formals";
        }
        System.out.println("clothes : " + clothes);


        String[] app = {"happy", "peaceful", "loving", "dear",};
       // maxWordCount(app);


    //public static String maxWordCount (String[] names)
    //public static void main(String[] arg) {

        String[] names = {"happy", "peaceful", "loving", "dear"};
          for (int i = 0; i < names.length-1; i++) {
            if (names[i].length() == names[i + 1].length()) {
                System.out.println(names[i] + names[i + 1]);
            }
        }
    }
}
