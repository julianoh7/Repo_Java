package HomeWorkPackage;

import java.util.ArrayList;
import java.util.List;

public class HW11REDO {
    public static List<String> findCommons (String[] arr1, String[] arr2){
        List<String> commonWords = new ArrayList<>();
        for (String arr1Word : arr1) {
            for (String arr2Word :arr2){
                if(arr1Word.equalsIgnoreCase(arr2Word) && !commonWords.contains(arr1Word.toLowerCase())){
                    commonWords.add(arr1Word.toLowerCase());
                }
            }
        } return commonWords;
    }

    public static List<String> findRepeatingValues (String[] arr){
        List<String> repeatedWords = new ArrayList<>();
        for (int i =0; i <arr.length;i++){
            for (int j=i+1; j< arr.length;j++){
                if (arr[i].equalsIgnoreCase(arr[j]) && !repeatedWords.contains(arr[i].toLowerCase())){
                    repeatedWords.add(arr[i].toLowerCase());
                }
            }
        }return repeatedWords;
    }


    public static void main(String[] args) {
        //Question1
        String[] Array1 = {"happy", "King" , "HAPPY", "PEACE"};
        String[] Array2 = {"king", "Peace", "happiness", "connection", "learn"};
        System.out.println("common words are : " + MyArrayMethods.findCommons(Array1,Array2));

        //Question2
        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        System.out.println("The repeated words in array are : " + findRepeatingValues(words));

        //Question3




    }
}
