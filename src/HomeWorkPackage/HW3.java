package HomeWorkPackage;

public class HW3 {
    public static void main(String[] args) {

        /** Question 1
         * Assign result_1 as 100 if the length of sentence_1 is 10 or greater
         * else assign result_1 as 15
         * use: Ternary operator
         */

         String sentence_1 = "hello dear, how are you?";
         int sentence_1length = sentence_1.length();
         System.out.println("Length of : '" + sentence_1 + "' is -> " + sentence_1length);
         int result_1 = sentence_1length >=10?100:15;
         System.out.println("Result is :" + result_1 + '\n');
         ;

         /**Question - 2
          * replace all 'R/r' with 'F'
          */
        String sentence_2 ="We all ARe GOod ProgrAMmer";
        sentence_2 = sentence_2.toLowerCase();
        System.out.println("Sentence 2 : " +sentence_2);
        String sentenceAfterReplacement = sentence_2.replace("r", "F");
        System.out.println("Result is : " + sentenceAfterReplacement + '\n');

        ;
        // Question - 3
        /**
         * 1. Display/Print length of your sentence_3
         * 2. does sentence_3 starts with "a" (ignore cases)
         * 3. does sentence_3 ends with "K" (ignore cases)
         * 4. Assign result_3 as "Media" if sentence_3 starts with 'a' (ignore cases)
         *      else assign "Entertainment"
         *      Print the result_3 in console.
         */
        String sentence_3 = "ABC Networks";

        int sentence_3Length = sentence_3.length();
        System.out.println("Length of : '" + sentence_3 + "' is -> " + sentence_3Length);
        boolean itStartsWith_A = sentence_3.toLowerCase().startsWith("a");
        System.out.println("Does '" + sentence_3 + "' starts with 'A' -> " + itStartsWith_A);
        boolean itEndsWith_K = sentence_3.toUpperCase().endsWith("K");
        System.out.println("Does '" + sentence_3 + "' ends with 'K' -> " + itEndsWith_K );
        String result_3 = sentence_3.toLowerCase().startsWith("a") ? "Media":"Entertainment";
        System.out.println("Result is : "+ result_3 + '\n');

        char myInitial = 'J';














    }
}
