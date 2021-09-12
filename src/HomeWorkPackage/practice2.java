package HomeWorkPackage;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {
        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         */
        double studentScore = 90.91;
        int maxScore = 100;

        if (studentScore >= 100) {
            System.out.println("Grade A");
        } else if (studentScore <= 90.99) {
            System.out.println("Grade B");
        } else if (studentScore <= 80.99) {
            System.out.println("Grade C");
        } else if (studentScore <= 70.99) {
            System.out.println("Grade D");
        } else if (studentScore <= 60.99) {
            System.out.println("Grade E");
        } else if (studentScore <= 50.99) {
            System.out.println("Grade F");
        } else {
            System.out.println("Grade F");
        }

        ;

        double studentNewScore = 70.99;
        int newMaxScore = 100;

        if (studentNewScore >= 100) {
            System.out.println("grade a");
        } else if (studentNewScore >= 91) {
            System.out.println("grade a");
        } else if (studentNewScore >= 81) {
            System.out.println("grade b");
        } else if (studentNewScore >= 71) {
            System.out.println("grade c");
        } else if (studentNewScore >= 61) {
            System.out.println("grade d");
        } else if (studentNewScore >= 51) {
            System.out.println("grade e");
        } else {
            System.out.println("grade f");
        }

        ;

        double stScore = 80.50;
        int mxScore = 120;
        // 78 f
        if (stScore >= 120) {
            System.out.println("A");
        } else if (stScore >= 110) {
            System.out.println("A");
        } else if (stScore >= 100) {
            System.out.println("B");
        } else if (stScore >= 90) {
            System.out.println("C");
        } else if (stScore >= 80) {
            System.out.println("D");
        } else if (stScore >= 70) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }

        ;


        /**
         * store value in an int variable
         * if number is divisible by 2, print "divisible by 2"
         * if number is divisible by 4, print "divisible by 4"
         * if number is divisible by 2 and 4, print "divisible by both"
         * if not divisible by 2 or 4, print the number
         */

        int nrValue = 111;
        if (nrValue % 2 == 0 && nrValue % 4 == 0) {
            System.out.println("divisible by both");
        } else if (nrValue % 2 == 0) {
            System.out.println("divisible by 2");
        } else if (nrValue % 4 == 0) {
            System.out.println("divisible by four");
        } else {
            System.out.println("nrValue is --> " + nrValue);
        }


        ;

        String[] names = {"Happy", "Peace", "Grow", "Learn"};
        int namesLength = names.length;
        for (int i = 0; i <= namesLength - 1; i++) {
            System.out.println(names[i]);
        }
        System.out.println("\n");

        String[] emra = {"Bye", "Welcome", "Hello"};
        int emraLength = emra.length;
        for (int i = 1; i <= emraLength; i++) {
            System.out.println(emra[emraLength - i]);
        }
        System.out.println("\n");
        ;


        String[] myWords = {"Happy", "Peace", "Grow", "LEARN", "slEEp", "outside", "Hello", "Bye"};
        for (int i = 0; i < myWords.length; i++) {
            if (myWords[i].toLowerCase().contains("e"))
                System.out.println(myWords[i]);

            System.out.println("\n");
        }
        /*
            Print the words which contains 'e' in it.
            Note: Pls ignore cases
            Expected ans:
            Peace
            LEARN
            slEEP
            outside
            Hello
            Bye
         */

        //myWords[0] = "Happy";
        //if (myWords[0].toLowerCase().contains("e")) {


        String[] sen1 = {"WelcOme", "hoMe", "nOw"};
        String result = "";
        System.out.println(Arrays.toString(sen1));
        for (int z = 0; z < sen1.length; z++)
            result = result + " " + sen1[z].substring(0, 1).toUpperCase() + sen1[z].substring(1).toLowerCase();
        {
            System.out.println(result);

        }

        System.out.println("\n");

        String bomb = "Hi HOW Are YOU";
        String[] bombSplit = bomb.split(" ");
        System.out.println(Arrays.toString(bombSplit));
        String kk = "";
        for (int p = 0; p < bombSplit.length; p++)
            kk = kk + " " + bombSplit[p].substring(0, 1).toUpperCase() + bombSplit[p].substring(1).toLowerCase();
        {
            System.out.println(kk);
        }

        int values[] = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int z = 0; z < values.length; z++)
            sum = sum + values[z];
        System.out.println(sum);

        int maxxScore = 100;
        int studenttScore = 66;
        String Grade = "";
        String yesOrNo = "";
        double percentage = (studenttScore * 100.00) / maxScore;
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
        }if (percentage >= 91)
            yesOrNo = "Full Scholarship";
        else if (percentage >= 71 && percentage <= 90.99)
            yesOrNo = "Half Schoolarship";
        else
            yesOrNo = "No Scholarship";
        System.out.println("Your percentage is : " + percentage + " and your Grade is: " + Grade + " and Scholarship status is -->" + yesOrNo);







    }
}
