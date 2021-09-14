package HomeWorkPackage;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class ClassPractice {
    public static void main(String[] args) {
        Map<Integer,String> ssnData = new java.util.HashMap<>();
        //Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(1111,"Happy");
        ssnData.put(1211,"jappy");
        ssnData.put(1311,"pappy");
        ssnData.put(1411,"tappy");
        ssnData.put(1511,"happy");
        ssnData.put(1611,"qappy");
        ssnData.put(1711,"homegoods");
        System.out.println(ssnData);
        // print the ssn date where person name contains h( in uppercase/lowecase)?
        //if ("Happy".toLowerCase().contains("h".toLowerCase())){
        String letter_h= "h";
        Set<Integer> allSsnKeys = ssnData.keySet();
        System.out.println("all keys" + allSsnKeys);
        for ( Integer key :allSsnKeys){
             String value =ssnData.get(key);
             if (value.toLowerCase().contains(letter_h.toLowerCase())){
                 System.out.println("key containing 'h' : " + key);
             }
        }
        //Print the ssnNumber when name length is greater than 7
        for ( Integer key :allSsnKeys){
            String value = ssnData.get(key);
            if (value.length()>7){
                System.out.println("The key which has a length over greater than 7 is : " + key);
            }
        }


        //PRINT THE AVERAGE OF EVERY STUDENT
        Map<String,int[]> grade = new java.util.HashMap<>();

        int[] sm1= {21,23,85};
        int[] sm2 = {25,56,78};
        int[] sm3 = {100,60,};

        grade.put("jay", sm1);
        grade.put("mike", sm2);
        grade.put("peter", sm3);

        //PRINTING ARRAY OF  INT[] IN HASHMAP USING "GET" METHOD.

        int [] arrayOfSm1 =grade.get(sm1);
        System.out.println(Arrays.toString(sm1));



        //System.out.println(grade);

        Set<String> studentIds = grade.keySet();

        for (String id : studentIds){
           int[] studentScore = grade.get(id);
           double sum = 0;
           for ( int score : studentScore){
               sum +=score;
           }
            System.out.println("Average of: " + id + " is "  + (sum/ studentScore.length));
        }





    }
}
