package HomeWorkPackage;

import java.util.List;

public class HW11 {


/**
 * Question 1:
 * Create a method that would return the common values between two given arrays
 *
 * ["happy", "King" , "HAPPY", "PEACE"]
 * ["king", "Peace", "happiness", "connection", "learn"]
 *
 * ["king", "peace"]
 *
 * ["happy", "Kingdom" , "HAPPY", "PEACeful"]
 * ["king", "Peace", "happiness", "connection", "learn"]
 *
 * []
 *
 */
public static void main(String[] args) {
    String[] Array1 = {"happy", "King" , "HAPPY", "PEACE"};
    String[] Array2 = {"king", "Peace", "happiness", "connection", "learn"};
    for(int i = 0; i < Array1.length; i++){
        for(int a = 0; a < Array2.length; a++){
            if(Array1[i].equalsIgnoreCase(Array2[a])){
                System.out.println("The common values between the two given arrays are : " + Array1[i]);
                break;
            }
        }
    }



    System.out.println("\n");

/**
 * Question 2:
 * Create a method that would return the values occurring more than 1 times in given array
 *  String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
 *  ["happy", "joy" , "laugh"]
 *
 *
 *  String[] words = {"happy", "peace", "laugh", "joy"};
 *  []
 */
    String[] repWords = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
    for (int i=0; i<repWords.length; i++){
        for (int j=i+1; j< repWords.length;j++){
            if (repWords[i]== repWords[j]){
                System.out.println("The values occurring more than 1 times in this given array is : " +repWords[i]);
                break;
            }
        }
    }

    System.out.println("\n");
/**
 * Question 3:
 * Create a method that can print the count of given value in the given array
 * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
 * String word = "happy"
 *
 * output: 'happy' occurs N times in array.
 *
 * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
 * String word = "PEace"
 *
 * output: 'peace' occur only one time in array
 *
 * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
 * String word = "Helpful"
 *
 * output: 'Helpful' is not present in array
 }*/
    String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
    String word = "joy";
    int count = 0;
    for (int i = 0; i < words.length; i++) {
        if (words[i].contains(word)) {
            count++;
            if (count == 1) {
                System.out.println("The word " +word  + " is repeated "  + count + "time");
            } else if (count >= 2) {
                System.out.println("The word " +word + " is repeated " + count + "times");
            } else {
                System.out.println("The word " +word  + " is not repeated");
            }
        }
    }




    char myInitial = 'J';
        }
    }
