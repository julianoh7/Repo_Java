package HomeWorkPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerConcept {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your first name: ");
            String userFirstName = MyStringMethods.convertString(input.nextLine());

            System.out.println("Please enter your age");
            int age =input.nextInt();
            System.out.println(userFirstName);
            System.out.println(age);
        }catch (InputMismatchException e){
            System.out.println("Incorrect form of data supplied.");
            e.printStackTrace();
        }





    }
}
