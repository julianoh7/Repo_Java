package HomeWorkPackage;

import java.util.Arrays;

public class HW7 {
    public static void main(String[] args) {
        // Due date: July 28

        /**
         * Task 1:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable
         * --> palindrome: string which reads the same in reverse
         * eg:
         * level --> level          (palindrome)
         * eye  --> eye             (palindrome)
         * head --> daeh            (not palindrome)
         * racecar --> racecar      (palindrome)
         */
        //(level,eye,head,racecar)
        String sentence = "mouse";
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

        System.out.println("\n");




        /**
         * Task2:
         * Find if the value stored in num variable is a prime number or not.
         * And, store the final result in "isPrime" variable
         * --> prime number -> number which is ONLY divisible by 1 and itself.
         * eg:
         * 5 -> prime
         * 7 -> prime
         * 10 -> not a prime
         */
        int num = 5;
        boolean isPrime = true;
        for(int a=2; a<num/2 ; a++){
            if (num%a==0){
                isPrime=false ;
        }
        }
        if (!isPrime)
            System.out.println("Not prime");
        else{
            System.out.println("Prime");
        }

//System.out.println("num " + num + " is : " + isPrime);
        System.out.println("\n");
        /**
         * Task3:
         * Write code to reverse a string
         *
         * "happy holidays"
         *
         * "syadiloh yppah"
         *
         */
        String sen3 = "happy holidays";
        String task3String = "";
        for (int b = sen3.length()-1; b>=0; b--) {
            task3String += sen3.charAt(b);
            System.out.println(task3String);
        }

        System.out.println("\n");


        /**
         * Task4:
         * Count the number of the vowels (a,e,i,o,u) present in the given sentence.
         */
        String task4Sentence = "hOW arE You My DEAr FRiEnd";
        int count = 0;
        char [] vowels = {'a','e','i','o','u'};
        for (int c=0 ; c <task4Sentence.length(); c++){
            char ch = task4Sentence.toLowerCase().charAt(c);
            for (char vowel : vowels) {
                if (vowel == ch ) {
                    count++;

                }
            }
        }
        System.out.println(count);

        char myInitial = 'J';





    }
}
