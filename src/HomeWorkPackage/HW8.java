package HomeWorkPackage;

import java.util.Arrays;

public class HW8 {
    public static void main(String[] args) {
        /**
         * Write a method to convert given string into Titlecase
         *
         * Input sentence = "happy new year TO You DeaR"
         * Final answer = "Happy New Year To You Dear"
         */
            calculateString();

        /**
         * Write a method to reverse a String
         */
            reverseString();

        /**
         * Write a method which will return the result, if the given string is a Palindrome
         *
         * return type: boolean
         */
            palindromeMethod();
        /**
         * Write a method to return the average of a given int array
         *
         * Input array : {7, 10, 3, 6, 10}
         * ans : 7.2
         *
         */
            averageReturn();
        /**
         * Write a method to return the maximum value from a given int array
         *
         * Input array: {33, 54, 67, 19, 9, 52}
         * max : 67
         */
        maxValue();
    }

public static void calculateString() {
    String sentence = "happy new year TO You DeaR";
    String[] sentenceSplit = sentence.split(" ");
    System.out.println(Arrays.toString(sentenceSplit));
    String result = "";
    for (int i = 0; i < sentenceSplit.length; i++)
        result = result + " " + sentenceSplit[i].substring(0, 1).toUpperCase() + sentenceSplit[i].substring(1).toLowerCase();
    {
        System.out.println("The correct form to write : " + sentence + " is --> " + result);
    }
}
public static void reverseString(){
        String sen3 = "happy holidays";
        String task3String = "";
        for (int b = sen3.length()-1; b>=0; b--) {
            task3String += sen3.charAt(b);
            System.out.println(task3String);
        }
    }
public static void palindromeMethod (){
    String sentence = "level";
    String task1Word = "";
    for (int i = sentence.length()-1; i>=0; i--) {
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
}
public static void averageReturn(){
    int values[] = {7, 10, 3, 6, 10};
    int sum = 0;
    for (int z = 0; z < values.length; z++)
        sum = sum + values[z] / values.length;
    System.out.println("The average of the numbers in the array are : " + sum);
}
public static void maxValue(){
    int [] intValues = {33,54,67,19,9,52};
    int maxValue = intValues[0];
    for (int x=0; x < intValues.length; x++) {
        if (intValues[x]>maxValue) maxValue=intValues[x];
    }
    System.out.println(maxValue);
}
}
