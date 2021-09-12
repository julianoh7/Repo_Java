package HomeWorkPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_CLASS {
    public static void main(String[] args) {

        Date now= new Date();
        System.out.println(now);

        SimpleDateFormat df = new SimpleDateFormat("MMMM/dd/yyyy hh:mm:ss:SS a`");
        String nowFormat =df.format(now);
        System.out.println(nowFormat);


        Date currentDate = new Date();
        SimpleDateFormat df1 = new SimpleDateFormat("d");
        String currDate =df1.format(currentDate); //"2" the second of sep should print 2 in number format '2'
        Integer dateInitger = Integer.valueOf(currDate);
        if (dateInitger<= 15) {
            System.out.println("in first half of month");
        }else {
            System.out.println("in second half of month");

        }

        Date convertDate = null;
        String dateText = "August 22 2020, 19:20:10";
        SimpleDateFormat df2 = new SimpleDateFormat("MMMM d yyyy, HH:mm:ss");
        try {
            convertDate = df2.parse(dateText);
        } catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println("Converted date : "+convertDate);
        System.out.println("now date : " + now);

        boolean ln = now.equals(convertDate);
        System.out.println("is it equal to converted date : "+ln);

         boolean lm=now.after(convertDate);
        System.out.println("is now come after converted date : "+lm);

        boolean lk=now.before(convertDate);
        System.out.println("is now come before converted date : "+lk);






    }
}
