package HomeWorkPackage;

import java.util.Arrays;

public class HW8NEW {
    public static void main(String[] args) {
        /**
         * Write a method to convert given string into Titlecase
         *
         * Input sentence = "happy new year TO You DeaR"
         * Final answer = "Happy New Year To You Dear"
         */

        convertString("happy new year TO You DeaR");


        /**
         * Write a method to reverse a String
         */

        reverseString("happy birthday");


        /**
         * Write a method which will return the result, if the given string is a Palindrome
         *
         * return type: boolean
         */

        palindromeMethod("juliano");

        /**
         * Write a method to return the average of a given int array
         *
         * Input array : {7, 10, 3, 6, 10}
         * ans : 7.2
         *
         */
        int[] values = {10, 10, 10};
        double avg = averageReturnMethod(values);
        System.out.println(avg);

        /**
         * Write a method to return the maximum value from a given int array
         *
         * Input array: {33, 54, 67, 19, 9, 52}
         * max : 67
         */
        int[] nr= {33, 54, 67, 19, 9, 52};
        int maxVal =maxValueOfArray(nr);
        System.out.println(maxVal);



    }
    public static String convertString(String sentence){
        //String sentence = "happy new year TO You DeaR";
        String[] sentenceSplit = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceSplit));
        String result = "";
        for (int i =0 ; i < sentenceSplit.length; i++){
            result = result + " " + sentenceSplit[i].substring(0,1).toUpperCase() + sentenceSplit[i].substring(1).toLowerCase();
        }
        System.out.println(result);
        return result;
    }


    public static String reverseString (String sen3){
        //String sen3 = "happy holidays";
        String task3String = "";
        for (int b = sen3.length()-1; b>=0; b--){
            task3String += sen3.charAt(b);
            System.out.println(task3String);
        }
        return task3String;
    }


    public static String palindromeMethod (String sentence) {
        String task1Word = "";
        for (int i = sentence.length()-1; i>=0 ; i--) {
            task1Word += sentence.charAt(i);
            System.out.println(task1Word);
        }
        boolean palindrome = true;
        for (int i=0; i <sentence.length(); i++) {
            if (sentence.charAt(i) != task1Word.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        return task1Word;

    }


    public static double averageReturnMethod (int[] values) {
            double sum = 0;
            for (int num: values){
                sum+=num;
            }
            return sum/values.length;
    }


    public static int maxValueOfArray (int[] intValues){
        //int [] intValues = {33,54,67,19,9,52};
        int maxValue = intValues[0];
        for (int x=0; x < intValues.length; x++) {
            if (intValues[x]>maxValue) maxValue=intValues[x];
        }
        return maxValue;
    }

}
