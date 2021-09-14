package HomeWorkPackage;

public class practice1 {
    public static void main(String[] args) {
        int num1 = 10;
        // IF the number (num1) is less than 5 print "less than 5" else print "greater than5"
        if (num1 < 5) {
            System.out.println("less than 5");
        } else  {
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

        if (num%2 == 0 && num <20) {
            System.out.println(num + " * 10 = "+ (num*10));
            System.out.println( num + "divisible by 2");
        } else if (num%5 == 0 || num%3 == 0 ) {
            System.out.println(" remainder of " + num + " when divided by 2 : " + num%2);
            System.out.println(num + " divisible by 5 or 3 ");
        } else if (num < 20) {
            System.out.println(num + " less than 20" + "\n");
        }
;

        String day = "weekDay";                // weekday or weekend
        String clothes = "";            // casual, formals, suit
        boolean anyMeeting = true;      // true or false
        /**
         * day = weekend ; clothes = casual
         * day = weekdays and I have meetings ; clothes = suit
         * day = weekdays and I have no meetings ; clothes = formals
         */
        if (day.equalsIgnoreCase("weekend")) {
            clothes = "casual";
        } else if (day.equalsIgnoreCase("weekday") && anyMeeting) {
            clothes = "suit";
        } else if (day.equalsIgnoreCase("weekday") && !anyMeeting) {
            clothes = "formals";
        }
        System.out.println("clothes : " + clothes + "\n");


        ;


        int num2 = 0;
        switch (num2) {
            case 5:
                System.out.println("num is five");
                break;
            case 10:
                    System.out.println("num is 10");
                    break;
            case 15:
                System.out.println("num is fifteen");
                break;
            default:
                System.out.println("num is other than 5,10 and 15");
        }

        String name = "joy";
        switch (name) {
            case "happy":
                System.out.println("Good Name");
                break;
            case "joy":
                System.out.println("have fun");
                break;
            case "hear":
                System.out.println("keep listening");
                break;
            default:
                System.out.println(name);
        }

//




        for (int  i = 1 ; i <=5 ; i++) {
            System.out.println("Hello World");
        }


        String[] top5Students = new String [5];
        int lol = top5Students.length;
        top5Students[0] = "Happy";
        System.out.println(top5Students[0]);



}
}
