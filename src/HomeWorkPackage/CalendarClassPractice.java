package HomeWorkPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.HashMap;

public class CalendarClassPractice {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //System.out.println(cal);
        Date fromCal = cal.getTime();
        System.out.println(fromCal);

        Date convertDate = null;
        String dateText = "July 14 2020, 19:20:10";
        SimpleDateFormat dx = new SimpleDateFormat("MMMM d yyyy, HH:mm:ss");
        try {
            convertDate = dx.parse(dateText);
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println("CONVERTED DATE IS : "+convertDate);
        cal.setTime(convertDate);

        //HASHMAP
        Map<String,String> costumers = new HashMap<>();
        costumers.put("Juliano","6462700264");
        costumers.put("Alex","6462700263");
        costumers.put("Elmina","6462700064");
        costumers.put("Artida","6462700964");
        costumers.put("Michael","6462700000");
        System.out.println(costumers);
        System.out.println("amount of costumers is : "+costumers.size());

        String lol = costumers.get("Elmina");
        System.out.println("Elminas number is : " + lol);
        String ll = costumers.remove("Michael");
        System.out.println("The removed costumer is :" + ll);
        System.out.println(costumers);
        System.out.println("amount of costumers is : "+costumers.size());
        String lm =costumers.replace("Artida","0000000000");
        System.out.println("Replaced costumers info : " + lm);
        System.out.println(costumers);

        Collection<String> values = costumers.values();
        System.out.println("Costumer number values : " + values);
        Set<String> keySetValues = costumers.keySet();
        System.out.println("Costumer names  : " + keySetValues);
         boolean kk = keySetValues.isEmpty();
        System.out.println(kk);









    }
}
