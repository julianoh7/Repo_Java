package HomeWorkPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HW2 {
    public static void main(String[] args) {
        System.out.println("HW2");

        //* Convert deg-Cel into Fahrenheit
        //* fT = cT * 9/5 +32

        double cTemp = 21.11;
        double fTemp = cTemp * 9 / 5 + 32;
        double kTemp = cTemp + 273.15;


        //* C->F
        System.out.println(cTemp + "°C = " + fTemp + "°F");
        //* C->K
        System.out.println(cTemp + "°C = " + kTemp + "K");
        //* F->C
        System.out.println(fTemp + "°F = " + cTemp + "°C");
        //* F->K
        System.out.println(fTemp + "°F = " + kTemp + "K");
        //* K->C
        System.out.println(kTemp + "K = " + cTemp + "°C");
        //* K ->F
        System.out.println(kTemp + "K = " + fTemp + "°F");

        char myInitial = 'J';


        int[] ssMarks = {90, 89, 91, 67, 87, 88, 93, 90, 110, 81};
        String[] sNames = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David"};
        for (int i=0; i <ssMarks.length; i++){
            if (ssMarks[i] == 110){
                System.out.println("GRADE is :" + ssMarks[i] + "student is -> " + sNames[i]) ;
            }
        }

        DateFormat df = new SimpleDateFormat("HH:mm:ss a");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        int startDate = cal.get(Calendar.DATE);
        while (cal.get(Calendar.DATE) == startDate) {
            System.out.println(df.format(cal.getTime()));
            cal.add(Calendar.HOUR,2);
        }

        System.out.println(hourReturnMethod(3));

    }
    public static int hourReturnMethod(int arr){
        DateFormat df = new SimpleDateFormat("HH:mm:ss a");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        int startDate = cal.get(Calendar.DATE);
        while (cal.get(Calendar.DATE) == startDate) {
            System.out.println(df.format(cal.getTime()));
            cal.add(Calendar.HOUR,2);
        }
        return startDate;
    }



}




















