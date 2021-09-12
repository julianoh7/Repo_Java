package HomeWorkPackage;

import java.util.Arrays;

public class HW6 {
    public static void main(String[] args) {
        System.out.println("HW6");

        // Due: Sunday July 25

        /**
         * String sentence = "happy new year TO You DeaR"
         * // code
         * String sentence = "Happy New Year To You Dear"
         *
         * For hint refer: Loops_Concept , Line#34
         */
        String sentence = "happy new year TO You DeaR";
        String[] sentenceSplit = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceSplit));
        String result = "";
        for (int i = 0; i < sentenceSplit.length; i++)
            result = result + " " + sentenceSplit[i].substring(0, 1).toUpperCase() + sentenceSplit[i].substring(1).toLowerCase();
        {
            System.out.println("The correct form to write : " + sentence + " is --> " + result);
        }

        ;

        System.out.println("\n");


        /**
         * create the abbreviation  // HNY
         */
        String sentence1 = "very gOOD MorNING to You dear";
        String abc = "";
        String[] sentence1Split = sentence1.split(" ");
        System.out.println(Arrays.toString(sentence1Split));
        for (int a = 0; a < sentence1Split.length; a++)
            abc = abc + sentence1Split[a].substring(0, 1).toUpperCase();
        {
            System.out.println("Abbreviation for : " + sentence1 + " is --> " + abc);
        }

        ;
        System.out.println("\n");


        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         *
         * student got grade A, gets full scholarship for next year
         *
         * student got better than grade D (i.e. B or C), get half scholarship for next year
         *
         * otherwise no scholarship for next year
         *
         * Sample output:
         *  Your percentage: XX.yy and your Grade is: Z
         *  Based on your grade(Z), you get XXXX scholarship for next year
         */

        int maxScore = 100;
        int studentScore = 86;
        String Grade = "";
        String yesOrNo = "";
        double percentage = (studentScore * 100.00) / maxScore;
        if (percentage >= 91 && percentage <= 100) {
            Grade = "A";
        } else if (percentage >= 81 && percentage <= 90.99) {
            Grade = "B";
        } else if (percentage >= 71 && percentage <= 80.99) {
            Grade = "C";
        } else if (percentage >= 61 && percentage <= 70.99) {
            Grade = "D";
        } else if (percentage >= 51 && percentage <= 60.99) {
            Grade = "E";
        } else if (percentage <= 50.99) {
            Grade = "F";
        }
        if (percentage >= 91)
            yesOrNo = "Full Scholarship";
        else if (percentage >= 71 && percentage <= 90.99)
            yesOrNo = "Half Scholarship";
        else
            yesOrNo = "No Scholarship";
        System.out.println("Your percentage is : " + percentage + " and your Grade is: " + Grade + " and Scholarship status is --> " + yesOrNo);


        System.out.println("\n");

        /**
         * Create an array and store 5 int-values.
         * Print the average of numbers in array.
         *
         * sum of values / number of values
         *
         * {10, 20, 30, 40, 50}
         * (10+20+30+40+50)/5
         *
         */
        {
            int[] values = {10, 10, 10};
            int sum = 0;
            for (int z = 0; z < values.length; z++){
                sum = sum + values[z] / values.length;
            }
            System.out.println("The average of the numbers in the array are : " + sum);


        }
        System.out.println("\n");

        /**
         *
         * String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"}
         * String nameToSearch = "faith";
         *
         * if name found, Print "LUI is at position-5 in the array"
         * if name not found, print "king is not present in the array"

         */

        String[] namess = {"john", "happy", "peACe", "jOy", "lui", "harry"};
        String nameToSearch = "faith";
        System.out.println(Arrays.toString(namess));
        for (int q = 0; q < namess.length; q++)
            if (namess[q].contains("faith")) {
                System.out.println("LUI");
            } else {
                System.out.println("king is not present in the array");
            }




        System.out.println("\n");


        /**
         *
         *String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
         * print the names from array if the name-length is >=5 and name contains 'o' or 'O'
         */
        String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length; i++)
            if (names[i].toLowerCase().contains("o"))
                System.out.println("The names containing 'o' are : " + names[i]);



    }


    /**
     * int[] numbers = {11, 22, 33, 44, 55, 98, 65};
     * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
     * <p>
     * Limitation: both array must be of same length
     * <p>
     * if the numbers-array has 33 in it,
     * print the index at which 33 is present in numbers array
     * And, print the name present at same index in names array.
     */
    int[] numbersss = {11, 22, 33, 44, 55, 98, 65};
    String[] namesss = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"}; {
        for (int a = 0; a < numbersss.length; a++){
            if(numbersss[a] == 33)
                System.out.println(a);

          //  int[] numbers = {11, 22, 33, 44, 55, 98, 65};
           // String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
           // for (int i=0;i< numbers.length;i++){                                                          CORRECT WAY
             //   if (numbers[i]==33){
              //      System.out.println(i);
               //     System.out.println(names[i].toUpperCase());
              //  }
           // }

    }
    }





        ;

    char myInitial = 'J';






        }

