package HomeWorkPackage;

import java.util.Arrays;

public class MyStringMethods {
    public static String convertString(String sentence){
        //String sentence = "happy new year TO You DeaR";
        String[] sentenceSplit = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceSplit));
        String result = "";
        for (int i =0 ; i < sentenceSplit.length; i++){
            result = result + " " + sentenceSplit[i].substring(0,1).toUpperCase() + sentenceSplit[i].substring(1).toLowerCase();
        }
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
        for (int i = sentence.length() - 1; i >= 0; i--) {
            task1Word += sentence.charAt(i);
            System.out.println(task1Word);
        }
        boolean palindrome = true;
        for (int i = 0; i < sentence.length(); i++) {
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

    public static String abbreviation (String userStr){
        String abr = "";
        String [] userStrArray = userStr.split(" ");
        for (String word :userStrArray) {
            abr += word.toUpperCase().charAt(0);
        }
        return abr;
    }


}
