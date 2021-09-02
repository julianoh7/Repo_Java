package HomeWorkPackage;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class HW12 {


    /**
     * Question:1
     * Create a method, that will return all duplicates values with count from the given List<String>
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     *      happy - 2
     *      joy - 3
     *      laugh - 2
     * @return
     */
    public static Map<String, Integer> duplicateCount (List<String> words){
        //* List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        Map<String,Integer> wordCount = new HashMap<>();
        for ( int i=0; i<words.size();i++){
            if(!wordCount.containsKey(words.get(i))){
                int count = 1;
                for (int j =i+1; j<words.size();j++){
                    if (words.get(i).equalsIgnoreCase(words.get(j))){
                        count ++;
                    }
                    if (count>1){
                        wordCount.put(words.get(i),count);
                    }
                }

            }

        }
        return wordCount;
    }

    String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
            "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
            "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
            "green", "green"};


    /**
     * Question:2
     * Create a method that will take String-array as input
     *
     * If there is a color with maximum count, return the color name
     * If there are two or more colors with same number, return all
     *
     * hint: return type as Set/List<String>
     */

    public static Map<String, Integer> duplicateFinder (String[] words){
        Map<String,Integer> wordCount = new HashMap<>();
        for ( int i=0; i<words.length;i++){
            if(!wordCount.containsKey(words[i])){
                int count = 1;
                for (int j =i+1; j<words.length;j++){
                    if (words[i].equalsIgnoreCase(words[j])){
                        count ++;
                    }
                    if (count>1){
                        wordCount.put(words[i],count);
                        Collection<Integer> val = wordCount.values();
                        Integer[] array = val.toArray(new Integer[0]);
                        int maxValue = array[0];
                        for (int x=0; x < array.length; x++) {
                            if (array[x]>maxValue)
                                maxValue=array[x];

                        }

                    }
                }

            }

        }
        return wordCount;
    }



    /**
     *
     * Question:3
     * Create a hashMap with any numbers of key-value pairs from the user
     * Key should be Integer
     * Value should be String
     *
     * Create method that will print the keys with same value, else "All keys have different values"
     *
     * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
     * Output (print) ->
     *      "happy" with keys -> 101, 103, 106
     *      "peace" with keys -> 102, 105
     *
     * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
     * Output (print) ->
     *      All keys have different values
     *
     *
     */

    public static Set<Integer>  FindDuplicateKeys(Map<Integer,String> finder){
        Set<Integer> allKeys = finder.keySet();
        Set<Integer> keysWithDuplicates = new HashSet<>();

        for (Integer key : allKeys){
            String value = finder.get(key);
            for (Integer otherKey : allKeys){
                if (otherKey !=key){
                    if (finder.get(otherKey).equalsIgnoreCase(value)){
                        keysWithDuplicates.add(key);
                        keysWithDuplicates.add(otherKey);
                    }
                }
            }
        }
        return keysWithDuplicates;
    }










    public static void main(String[] args) {
        //Question1
        String[] lol = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        List<String> names = Arrays.asList(lol);
        System.out.println(duplicateCount(names));



        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};
                System.out.println("The amount of different colors in array is : " + arr.length);
        System.out.println(duplicateFinder(arr));
        System.out.println();



        //QUESTION3
        //[{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
        Map<Integer,String> ln = new java.util.HashMap<>();
        ln.put(101,"happy");
        ln.put(102,"peace");
        ln.put(103,"learn");
        ln.put(104,"Happy");
        ln.put(105,"PEaCe");
        ln.put(106,"HAPPY");
        System.out.println("repeating values are in keys : " + FindDuplicateKeys(ln));



    }
}
