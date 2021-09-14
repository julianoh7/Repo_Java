package HomeWorkPackage;

import java.util.ArrayList;
import java.util.List;

public class MyArrayMethods {
    public static double averageReturnMethod (int[] values) {
        double sum = 0;
        for (int num: values){
            sum+=num;
        }
        return sum/values.length;
    }


    public static int maxValueOfArray (int[] intValues){
        //int [] intValues = {33,54,67,19,9,52};
        int maxValue = intValues[0];
        for (int x=0; x < intValues.length; x++) {
            if (intValues[x]>maxValue) maxValue=intValues[x];
        }
        return maxValue;
    }

    public static List<String> findCommons (String[] arr1,String[] arr2){
        List<String> commonWords = new ArrayList<>();
        for (String arr1Word : arr1) {
            for (String arr2Word :arr2){
                if(arr1Word.equalsIgnoreCase(arr2Word) && !commonWords.contains(arr1Word.toLowerCase())){
                    commonWords.add(arr1Word.toLowerCase());
                }
            }
        } return commonWords;
    }
}
