package HomeWorkPackage;

import java.util.Arrays;

public class n {
    public static void main(String[] args) {



        String sentence = "happy new year TO You DeaR";
        String[] sentenceSplit = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceSplit));
        String result = "";
        for (int a = 0 ; a < sentenceSplit.length; a++)
            result = result + " " + sentenceSplit[a].substring(0, 1).toUpperCase() + sentenceSplit[a].substring(1).toLowerCase();
        System.out.println( "Before fix : " + sentence + " & After fix : " + result);

        String sentence1 = "very gOOD MorNING to You dear";
        String abc = "";
        String[] sentence1Split = sentence1.split(" ");
        System.out.println(Arrays.toString(sentence1Split));
        for (int i = 0; i < sentence1Split.length; i++)
            abc = abc + sentence1Split[i].substring(0, 1).toUpperCase();
            {
                System.out.println("Abbreviation for : " + sentence1 + " is --> " + abc);
            }


        int maxScore = 100;
        int studentScore = 89;
         String grade = "";
        double percentage = (studentScore*100)/maxScore;
        if (percentage >= 91 && percentage <= 100) {
            grade = "A";
        } else if (percentage >= 81 && percentage <= 90.99) {
            grade = "B";
        } else if ( percentage >= 71 && percentage <= 80.99) {
            grade = "C";
        } else if (percentage>=61 && percentage <=70.99) {
            grade = "D";
        } else if (percentage>=51 & percentage <= 60.99) {
            grade = "E";
        } else {
            grade = "F";

            System.out.println(grade);

        }


                String task4Sentence = "hOW arE You My DEAr FRiEnd";
                int count = 0;
                for (int c=0 ; c <task4Sentence.length(); c++){
                    char ch = task4Sentence.toLowerCase().charAt(c);
                    if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o'|| ch == 'u') {
                        count++;
                    }
                    System.out.println(count);{
            }
        }



        String[] words = {"happy holidays","happy birthday","happy life","happiness"};
                for (int i=0; i< words.length;i++) {
                    if (words[i].toLowerCase().contains("happy"))
                        System.out.println(words[i]);
                }




        //Question-1:
       // Write a method to sort an integer array
        //  Example:
        // Given array : [20, 10, 40, 44]
        //Method should return : [10, 20, 40, 44]
        int [] intArray = {20, 10, 40, 44};
        for (int i=0; i< intArray.length; i++){
            Arrays.sort(intArray);
            System.out.println(intArray[i]);
        }


        // Question-2:
        // Write method to find the minimum value from an integer array
        // Example:
        int[] arrNum = {90, 89, 91, 67, 87, 88, 93};
        int maxvalue = arrNum[0];
        for (int p=0; p< arrNum.length;p++) {
            if (arrNum[p]>maxvalue) maxvalue=arrNum[p];
        } System.out.println(maxvalue);


        //Question-3:
        //Reverse an array
        // Example-1:
        // Given array : [25, 15, 3, 2, 40]
        //Method should return : [40, 2, 3, 15, 25]
        int [] reverseArray = {25, 15, 3, 2, 40};
        for (int i=0; i<reverseArray.length;i++){
        }for (int i=reverseArray.length-1;i>=0;i--){
            System.out.println(reverseArray[i] + " ");
        }

        // Example-2:
        // Given array : [20, 10, 44]
        // Method should return : [44, 10, 20]
        int[] nr = {20, 10, 44};
        for (int i =0; i< nr.length;i++){
        } for (int i= nr.length-1;i>=0;i--){
            System.out.println(nr[i] + " ");
        }


        // Question-4:
        // Given two arrays,
        //         first array (marks-array) contains total marks of 11 students of a class;
        // second array (names-array) contains their names in the same order as marks-array.
        //        Create a method which takes both array as parameters, and returns name of student who scored maximum marks in the class.
        //   Example-1:
          double[] sMarks = {90,89,91,67,87,88,93,90,110,81};
         String [] sNames = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David"};
        // For above example, method should return "Hannah" (because she scored maximum marks i.e. 110).
            for (int i=0; i < sMarks.length;i++){
                if(sMarks[i] == 110) {
                    System.out.println("Grade is :" + sMarks[i] + " and the student is --> " + sNames[i]);
                }
            }
        // Example-2:
        // double[] studentMarks = {90, 89, 92, 97, 87, 88, 93, 95};
        // String [] students = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky"};
        // Method should return "Kaitlin" as Kaitlin scored the highest marks (97).


MyStringMethods.reverseString("hello");
MyStringMethods.convertString("hELLo you");



int[] bm = {5,10,15,20};
double arr= MyArrayMethods.averageReturnMethod(bm);
        System.out.println(arr);

int[] bmx= {1,3,5,7,9,65,2};
int sss = MyArrayMethods.maxValueOfArray(bmx);


        ;




    }

}
