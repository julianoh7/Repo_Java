package HomeWorkPackage;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> names = new java.util.ArrayList<>();


        List<Double> tempValues = new java.util.ArrayList<>();

        int namesLength = names.size();
        System.out.println("names --> " + names);
        System.out.println("names length --> " + namesLength);

        names.add("bye");
        names.add("happy");
        names.add("sad");
        names.add("shorT".toUpperCase());
        names.add("TALl");
        names.add("happy");
        names.add("bye");
        System.out.println("names --> " + names);
        System.out.println("names length --> " + names.size());
        names.add("HELLO");
        System.out.println(names);

        System.out.println("\n");

       String x= names.remove(3);
        System.out.println("Removed name at index3 is : " + x);
        System.out.println("names --> " + names);
        System.out.println("names length --> " + names.size());

        String replaceValue = names.set(1,"USA");
        System.out.println("REPLACED VALUE IS :" + replaceValue);
        System.out.println("names --> " + names);
        System.out.println("names length --> " + names.size());

       String lm = names.get(1);
        System.out.println(lm);

        System.out.println("\n");

        String valueToRemove = "happy";
        for (int i= 0; i< names.size(); i++) {
            if (names.get(0).equalsIgnoreCase(valueToRemove)) {
                names.remove(names.get(i));
            }
        }
        System.out.println("names --> " + names);
        System.out.println("names length --> " + names.size());
//       if( names.get(0).equalsIgnoreCase(valueToRemove) ) {
//           names.remove(valueToRemove);
//           System.out.println("Value Found : " + valueToRemove);
//       }else {
//           System.out.println("Value not found");
//       }
        System.out.println("\n");
        int lastIndedofBye = names.lastIndexOf("bye");
        System.out.println("Last index of bye is : " + lastIndedofBye);
        System.out.println("names --> " + names);
        System.out.println("names length --> " + names.size());
        System.out.println("\n");
        int firstIndexofBye = names.indexOf("bye");
        System.out.println("First index of bye is : " + firstIndexofBye);
        System.out.println("names --> " + names);
        System.out.println("names length --> " + names.size());

//        int lastindexOfValue = -1;
//        for (int L=0; L<names.size(); L++){
//            if (names.get(L).equalsIgnoreCase("BYe")){
//                lastindexOfValue = L;
//                System.out.println("last index where bye was found is : " + lastindexOfValue);
//            }
//        }

        boolean containsMethodTall = names.contains("TALl");
        System.out.println("contains tall : " + containsMethodTall);




//        boolean isNamesEmpty = names.isEmpty();
//        System.out.println("is names empty after clear-method? : " + isNamesEmpty);





        System.out.println("\n");
        tempValues.add(100.00);
        tempValues.add(110.00);
        tempValues.add(120.00);
        tempValues.add(130.00);
        tempValues.add(140.00);
        System.out.println("Temp values are : " + tempValues);

//        System.out.println(tempValues.get(0));
//        System.out.println(tempValues.get(1));
//        System.out.println(tempValues.get(2));
//        System.out.println(tempValues.get(3));
//        System.out.println(tempValues.get(4));

        for (int i= 0; i< tempValues.size(); i++){
            System.out.println(tempValues.get(i));
        }




    }
    /**
     * ArrayList<datatypeClass> arrList = new ArrayList<>();
     * or
     *
     */









}
