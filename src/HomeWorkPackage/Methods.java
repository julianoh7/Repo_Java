package HomeWorkPackage;

public class Methods {
    public static void main(String[] args) {

String [] weatherType = {"Sunny", "Rainy", "Cloudy","Windy"};
for (int i=0; i< weatherType.length; i++ )
        if (weatherType[i].equalsIgnoreCase("sunny")) {
            System.out.println("day " + (i+1) + "show sun icon" );
        } else if (weatherType[i].equalsIgnoreCase("rainy")) {
            System.out.println("day " + (i+1) + "show rain icon" );
        } else if (weatherType[i].equalsIgnoreCase("cloudy")){
            System.out.println("day " + (i+1) + "show cloudy icon" );
        }else if (weatherType[i].equalsIgnoreCase("windy")) {
            System.out.println("day " + (i+1) + "show windy icon" );
        }





        int[] values = {7, 10, 3, 6, 10};
        double avg = averageMethod(values);
        System.out.println(avg);
        ///public static double averageMethod (int[] values){
            //int values[] = {7, 10, 3, 6, 10};
         //   double sum = 0;
        //    for (int num: values){
        //        sum+=num;
         //   }
         //   return sum/values.length;

    }
    public static double averageMethod (int[] values){
        double sum = 0;
            for (int num: values){
               sum+=num;
           }
          return sum/values.length;
    }
}
