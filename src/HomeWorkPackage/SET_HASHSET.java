package HomeWorkPackage;

import java.util.HashSet;

public class SET_HASHSET {
    public static void main(String[] args) {
        HashSet<Double> mortgageRates = new HashSet<>();
        int mortgageRatesLength = mortgageRates.size();
        System.out.println("mortgage Rates" + mortgageRates);
        System.out.println("mortgage Rates Length : " + mortgageRatesLength);

        mortgageRates.add(1.1);
        mortgageRates.add(2.2);
        mortgageRates.add(1.1);
        mortgageRates.add(3.3);
        mortgageRates.add(4.1);
        mortgageRates.add(5.2);
        mortgageRates.add(6.1);
        mortgageRates.add(7.3);
        mortgageRates.add(8.1);
        mortgageRates.add(9.2);
        mortgageRates.add(10.1);
        mortgageRates.add(11.3);

        System.out.println("mortgage Rates" + mortgageRates);
        System.out.println("mortgage Rates Length : " + mortgageRates.size());

        boolean is2_2Removed = mortgageRates.remove(2.2);
        System.out.println("is 2.2 removed : " + is2_2Removed);
        boolean is2_22Removed = mortgageRates.remove(2.2);
        System.out.println("is 2.2 removed : " + is2_22Removed);
        boolean is2_222Removed = mortgageRates.remove(2.2);
        System.out.println("is 2.2 removed : " + is2_222Removed);
        System.out.println("mortgage Rates" + mortgageRates);
        System.out.println("mortgage Rates Length : " + mortgageRates.size());




        boolean lm =mortgageRates.contains(1.1);
        System.out.println("does it contain 1.1 " + lm);
        boolean isEmpty = mortgageRates.isEmpty();
        System.out.println("IS MORTGAGE RATES EMPTY : " + isEmpty);
        System.out.println("clearing all values from mortgage rates set\n");
        mortgageRates.clear();
        System.out.println("IS MORTGAGE RATES EMPTY : " + isEmpty);
        System.out.println("mortgage Rates" + mortgageRates);
        System.out.println("mortgage Rates Length : " + mortgageRates.size());




    }
}
