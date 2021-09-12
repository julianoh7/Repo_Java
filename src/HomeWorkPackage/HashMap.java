package HomeWorkPackage;

import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer,String> ssnData = new java.util.HashMap<>();
        //Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(1111,"Happy");
        ssnData.put(1211,"jappy");
        ssnData.put(1311,"pappy");
        ssnData.put(1411,"tappy");
        ssnData.put(1511,"bappy");
        ssnData.put(1611,"qappy");
        System.out.println(ssnData);

        String pmp = ssnData.get(1111);
        System.out.println(pmp);
        String ln = ssnData.remove(1211).toUpperCase(Locale.ROOT);
        System.out.println("removed value is : " + ln);
        System.out.println("after removal :" + ssnData);
        boolean tOrF =ssnData.isEmpty();
        System.out.println(tOrF);
        String lol = ssnData.get(1511);
        System.out.println(lol);

        //GET ALL KEYS IN SET
        Set<Integer> allSsnKeys = ssnData.keySet();
        System.out.println(allSsnKeys);
        //GET ALL VALUES IN SET
       Collection<String> allSsnValues = ssnData.values();
        System.out.println(allSsnValues);








//        Map<String,Integer[]> grade = new java.util.HashMap<>();
//        Integer[] ps = {23,43};
//        grade.put("student1",ps);
//        System.out.println(grade);


        Map<String,int[]> sgrade = new java.util.HashMap<>();
        int[] sm= {21,23};
        sgrade.put("jay", sm);

        int[] ppp= sgrade.get(sm);
        System.out.println(Arrays.toString(sm));







    }
    }
