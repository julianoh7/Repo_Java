package HomeWorkPackage;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;

public class HW4 {
    public static void main(String[] args) {
        System.out.println("HW#4");


        // Question - 1:
        /**
         * String threeWordSentence = "hApPy nEW yeAr"
         * // code
         * String threeWordSentence = "Happy New Year"
         */
        String threeWordSentence_1 = "hApPy nEW yeAr";
        String[] threeWordSentence_1Split = threeWordSentence_1.split(" ");
        System.out.println(Arrays.toString(threeWordSentence_1Split));
        String t = threeWordSentence_1Split[0].substring(0,1).toUpperCase() + threeWordSentence_1Split[0].substring(1).toLowerCase();
        String t1 = threeWordSentence_1Split[1].substring(0,1).toUpperCase() + threeWordSentence_1Split[1].substring(1).toLowerCase();
        String t2 = threeWordSentence_1Split[2].substring(0,1).toUpperCase() + threeWordSentence_1Split[2].substring(1).toLowerCase();
        System.out.println("Before Code : " + threeWordSentence_1);
        System.out.println("After Code : " + t + " " + t1 + " " + t2 + "\n");





        // Question - 2:

        String sentence2 = "Very Good morning";
        String [] sentence2Split = sentence2.split(" ");
        String a = sentence2Split[0].substring(0,1).toUpperCase() + sentence2Split[1].substring(0,1).toUpperCase() + sentence2Split[2].substring(0,1).toUpperCase();
        System.out.println("Before abbreviation : " + sentence2);
        System.out.println("After abbreviation : " + a + "\n");





        // Question - 3:
        /**
         * print the number of words in the sentence.
         */

        String sentence_3 = "We all are here to learn programming and testing";
        String[] sentence_3Split = sentence_3.split(" ");
        System.out.println(Arrays.toString(sentence_3Split));
        int sentence_3Length = sentence_3Split.length;
        System.out.println("The number of words in the sentence is : " + sentence_3Length);

        char myInitial = 'J';



        int[] lol = {1,7,9,25,32,57,69};
       double avg= MyArrayMethods.averageReturnMethod(lol);
        System.out.println(avg);

       String aaa= MyStringMethods.abbreviation("happy holidays");
        System.out.println(aaa);


      MyStringMethods.convertString("HELLO and gOoDBye");



        String mm = MyStringMethods.reverseString("hello friend");
        System.out.println(mm);


        String nnn = "happy";
        int ff=100;
        System.out.println(nnn.toUpperCase().charAt(4));


        try{
            System.out.println(nnn.toUpperCase().charAt(ff));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Incorrect index given");
            e.printStackTrace();
            try {
                Thread.sleep(2000);
                System.out.println("Checkfile");
            }catch (InterruptedException sl) {
                sl.printStackTrace();
                System.out.println("sleep");
            }
        }finally {
            System.out.println("in the finally block");
        }

        System.out.println("outside the try catch block");


        ////CONTACTORS









    }
    public HW4(){
        System.out.println("Constructor method");
    }











}
