package HomeWorkPackage;

import java.sql.Array;
import java.util.Arrays;

public class midterm {
    public static void main(String[] args) {
/**
 * Question 1:
 * Scenario: Traffic ticketing system
 * Write a method, that will print (not return) the points to be charged against
 * the license for over speeding.
 *
 *    1. Speed Limit = 70
 *    2. Every 5 miles over the speed limit will add 1 point
 *    3. If user speed is such that system shows 12 points for a speed
 *      then print, license is suspended
 *
 *  Example:
 *      user speed = 74 ; 0 points
 *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
 *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
 *      user speed = 178 ; 21 points (License suspended).
 *      user speed = 70 ; Thank you for driving within the speed limit.
 */
        int driverSpeed = 155;
        int maxSpeed = 300;
        String points = "";


        if (driverSpeed >= 175 && driverSpeed <= 300) {
            points = "License Suspended";
        } else if (driverSpeed >= 165 && driverSpeed <= 169.99) {
            points = "20";
        } else if (driverSpeed >= 160 && driverSpeed <= 164.99) {
            points = "19";
        } else if (driverSpeed >= 155 && driverSpeed <= 159.99) {
            points = "18";
        } else if (driverSpeed >= 150 && driverSpeed <= 154.99) {
            points = "17";
        } else if (driverSpeed >= 145 && driverSpeed <= 149.99) {
            points = "16";
        } else if (driverSpeed >= 140 && driverSpeed <= 144.99) {
            points = "15";
        } else if (driverSpeed >= 135 && driverSpeed <= 139.99) {
            points = "14";
        } else if (driverSpeed >= 130 && driverSpeed <= 134.99) {
            points = "13";
        } else if (driverSpeed >= 125 && driverSpeed <= 129.99) {
            points = "12";
        } else if (driverSpeed >= 120 && driverSpeed <= 124.99) {
            points = "11";
        } else if (driverSpeed >= 115 && driverSpeed <= 119.99) {
            points = "10";
        } else if (driverSpeed >= 110 && driverSpeed <= 114.99) {
            points = "9";
        } else if (driverSpeed >= 105 && driverSpeed <= 109.99) {
            points = "8";
        } else if (driverSpeed >= 100 && driverSpeed <= 104.99) {
            points = "7";
        } else if (driverSpeed >= 95 && driverSpeed <= 99.99) {
            points = "6";
        } else if (driverSpeed >= 90 && driverSpeed <= 94.99) {
            points = "5";
        } else if (driverSpeed >= 85 && driverSpeed <= 89.99) {
            points = "4";
        } else if (driverSpeed >= 80 && driverSpeed <= 84.99) {
            points = "3";
        } else if (driverSpeed >= 75 && driverSpeed <= 79.99) {
            points = "2";
        } else if (driverSpeed >= 70 && driverSpeed <= 74.99) {
            points = "1";
        } else {
            points = "Thank you for driving within the speed limit";
        }
        System.out.println("Your speed : " + driverSpeed + " and your points are : " + points);


        /**
         * Question 2:
         * Create a method to return an int-array
         * after removing a given int-value from a given int array.
         *
         * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
         * Returned array: {32, 14, 98, 56, 148, 78}
         *
         * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
         * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
         */
        int[] intArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int remove = 24;
        int count = 0;
        for (int i=0; i< intArray.length; i++){
            if (remove==intArray[i]){

                count++;
                System.out.println(intArray[i]);
            }
        }


        System.out.println("\n");
        /**
         * Question 3:
         * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
         *
         * Example:
         *  For array : {3, 5, 1, 4, 2, 7}
         *  Method should return : 6
         *
         *  For array : {2, 5, -1, 0, 6}
         *  Method should return : 1
         *
         *  For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
         *  Method should return : 4
         *
         *  For array : {-2, -5, -1, -10, -6}
         *  Method should return : 1
         */

         int[] nr= {3, 5, 1, 4, 2, 7};
         int missingNr = 6;
         boolean found = true;
         while (found) {
             found = false;
             for (int i=0; i<nr.length;i++){
                 if(missingNr ==nr[i]){
                     missingNr++;
                     found=true;
                     break;
                 }
             }
         }
        System.out.println("Returned number is :" + missingNr);



        char myInitial = 'J';

    }
}
