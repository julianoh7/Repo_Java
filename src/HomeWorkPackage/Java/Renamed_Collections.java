package HomeWorkPackage.Java;

import HomeWorkPackage.HW12;

import java.util.*;

class Collections1 {
    public static List<String> findRepeatingValues(String[] arr) {
        List<String> repeatedWords = new ArrayList<>();
        Collection<String> list = null;
        Set<String> set = new HashSet<String>(list);
        int count =0;
        for (String words1 : repeatedWords) {
            System.out.println(words1 + ": " + Collections.frequency(list, words1));
            count++;
        }
        return repeatedWords;
    }

    public static List<String> ex (String[] arr) {
        List<String> jay = new ArrayList<>();
        System.out.println("The repeated values are as follows : ");
        Set<String> set = new HashSet<String>(jay);
        for (String words : set) {
        System.out.println(words + ": " + Collections.frequency(jay, words));
    }
        return jay;
    }



    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy");
        System.out.println("The repeated values are as follows : ");
        Set<String> set = new HashSet<String>(list1);
        for (String words : set) {
            System.out.println(words + ": " + Collections.frequency(list1, words));
        }







    }

}








