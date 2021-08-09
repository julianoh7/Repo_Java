package HomeWorkPackage;

import java.util.Arrays;
import java.util.List;

public class HW9 {
    public static void main(String[] args) {
        /**
         * Count the words which contains "happy" in the given array.
         *
         * if no word contains 'happy' --> "none"
         * if 1 word contains 'happy' --> word
         * if 2 or more words contain 'happy' --> all the words which happy
         *
         * {"happy holidays" , "how are you", "have a happy vacation", "happyness is the key" , "I want happiness for you"}
         *      {"happy holidays", "have a happy vacation", "happyness is the key"}
         *
         * {"happidays" , "how are you"}
         *      none
         *
         * {"happy holidays" , "happiness is the key" , "I want happiness for you"}
         *      happy holidays
         *
         * input: 2 ( String[] , String )
         * return type: String[] ( {"happy holidays", null, null} )
         *
         *
         */

        String[] words = {"happy holidays", "how are you", "have a happy vacation", "happyness is the key", "I want happiness for you"};
        String findHappy = "happy";
        findWord(words,findHappy);



           System.out.println("\n");

            /**
             * Find the name which has the max length.
             *
             * Note: If 2 or more names has same length (which is max) then send all such names
             *
             * {"happy, "peaceful", "loving", "dear"}
             *      peaceful
             *
             * {"happy, "peace", "love", "dear"}
             *      happy, peace
             *
             * input: 1 (String[])
             * return type: String[]
             */

            String[] bla = {"happy", "peaceful", "loving", "dear",};
            maxWordCount(bla );


        }
    public static String maxWordCount (String[] names){
        // String names = {"happy" "peaceful" "loving" "dear"};
        String []lol = names;
        String maxLength= lol[0];
        for (String name : lol) {
            if (name.length()>maxLength.length()){
                maxLength=name;
            }
        }
        System.out.println(maxLength);
        return maxLength;

    }
    public static String findWord (String[] words, String findHappy) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(findHappy)) {
                count++;
                System.out.println(count);
                if (count == 1) {
                    System.out.println("all the words which contain happy :" + words[i]);
                } else if (count >= 2) {
                    System.out.println("all the words which contain happy :" + words[i]);

                } else {
                    System.out.println("none");
                }
            }
        }
        return findHappy;
    }
}

