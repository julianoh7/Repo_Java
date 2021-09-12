package HomeWorkPackage;

public class x {
    public static void main(String[] args) {
        double studentScore = 92;
        int maxScore = 100;
        String grade = "";
        double percentage = (studentScore/maxScore)*100;

        if (percentage >= 91 && percentage <= 100) {
            grade = "1";
        }else if (percentage >= 81 && percentage <= 90.99) {
            grade = "B";
        }else if (percentage >= 71 && percentage <= 80.99) {
            grade = "C";
        }else if (percentage >= 61 && percentage <= 70.99) {
            grade = "D";
        }else if (percentage >= 51 && percentage <= 60.99) {
            grade = "E";
        }else {
            grade = "F";
        }
        System.out.println("Your percentage : " + percentage + " and your Grade is : " + grade);

        int driverSpeed = 75;
        int maxSpeed = 300;
        String points = "";


        if (driverSpeed >= 175 && driverSpeed <= 300) {
            points = "License Suspended";
        }else if (driverSpeed >= 165 && driverSpeed <= 169.99) {
            points = "20";
        }else if (driverSpeed >= 160 && driverSpeed <= 164.99) {
            points = "19";
        }else if (driverSpeed >= 155 && driverSpeed <= 160.99) {
            points = "18";
        }else if (driverSpeed >= 165 && driverSpeed <= 170.99) {
            points = "17";
        }else if (driverSpeed >= 160 && driverSpeed <= 165.99) {
            points = "16";
        }else if (driverSpeed >= 155 && driverSpeed <= 160.99) {
            points = "15";
        }else if (driverSpeed >= 150 && driverSpeed <= 155.99) {
            points = "14";
        }else if (driverSpeed >= 145 && driverSpeed <= 150.99) {
            points = "13";
        }else if (driverSpeed >= 140 && driverSpeed <= 145.99) {
            points = "12";
        }else if (driverSpeed >= 135 && driverSpeed <= 140.99) {
            points = "11";
        }else if (driverSpeed >= 120 && driverSpeed <= 130.99) {
            points = "10";
        }else if (driverSpeed >= 115 && driverSpeed <= 120.99) {
            points = "9";
        }else if (driverSpeed >= 110 && driverSpeed <= 115.99) {
            points = "8";
        }else if (driverSpeed >= 105 && driverSpeed <= 110.99) {
            points = "7";
        }else if (driverSpeed >= 100 && driverSpeed <= 105.99) {
            points = "6";
        }else if (driverSpeed >= 95 && driverSpeed <= 100.99) {
            points = "5";
        }else if (driverSpeed >= 90 && driverSpeed <= 95.99) {
            points = "4";
        }else if (driverSpeed >= 85 && driverSpeed <= 90.99) {
            points = "3";
        }else if (driverSpeed >= 80 && driverSpeed <= 85.99) {
            points = "2";
        }else if (driverSpeed >= 75 && driverSpeed <= 80.99) {
            points = "1";
        }else {
            points = "safe";
        }
        System.out.println("Your speed : " + driverSpeed + " and your points are : " + points);

//

        String [] names = {"Happy", "Peace", "Grow", "Learn"};
        for (String name : names) {
            System.out.println(name);
        }




        //ENHANCED FOR LOOP
        int [] numberzz = {1111,2222,3333,4444,5555};
        for (int numberz : numberzz ){
            System.out.println(numberz);
        }
        // FOR LOOP
        for (int i=0 ; i <= numberzz.length-1; i++){
            System.out.println(numberzz[i]);
        }

        // FOR LOOP
        int [] ssn = {2222,4444,6666};
        for (int x=0 ; x <= ssn.length ; x+=2) {
            System.out.println(ssn[x]);
        }

        //ENHANCED FOR LOOP
        for (int ssn1 : ssn) {
            if (ssn1%2 == 0) {
                System.out.println(ssn1);
            }
        }


        // WHILE LOOP


        char [] letters = {'a','b','c','d','e'};
        for ( int v=0 ; v < letters.length ; v++) {
            System.out.println(letters[v]);
        }


        char [] letterz = {'a','b','c','d','e'};
        for (int letterz1 : letterz) {
            System.out.println(letterz);
        }


    }
}
