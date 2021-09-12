package HomeWorkPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //System.out.println(cal);
        Date fromCal=cal.getTime();
        System.out.println(fromCal);

        //
        Date convertDate = null;
        String dateText = "August 22 2020, 19:20:10";
        SimpleDateFormat df2 = new SimpleDateFormat("MMMM d yyyy, HH:mm:ss");
        try {
            convertDate = df2.parse(dateText);
        } catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println("Converted date : "+convertDate);
        //
        //Create Calendar using date
        cal.setTime(convertDate);
        //System.out.println(cal);
        //add 37days to convertedDate

        cal.add(Calendar.DATE,37);
        cal.add(Calendar.YEAR,10);
        cal.add(Calendar.MONTH,-2);
        cal.add(Calendar.HOUR,+2);



        //System.out.println(cal);
        Date xm =cal.getTime();
        System.out.println(xm);

    }
}
