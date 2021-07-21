package HomeWorkPackage;

public class HW5 {
    public static void main(String[] args) {
        System.out.println("HW5");
        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         */

        double studentScore = 84.5;
        int maxScore = 100;

        if (studentScore >= 100) {
            System.out.println("Grade A");
        } else if (studentScore <= 90.99) {
            System.out.println("Grade is B");
        } else if (studentScore < 80.99) {
            System.out.println("Grade is C");
        } else if (studentScore < 70.99) {
            System.out.println("Grade is D");
        } else if (studentScore < 60.99) {
            System.out.println("Grade is E");
        } else if (studentScore < 50.99) {
            System.out.println("Grade is F");
        } else {
            System.out.println("Grade is F");
        }




      ;




        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */
        
        int num = 30;
        if (num%3 == 0 && num%5 == 0) {
            System.out.println("divisible by both");
        } else if (num%3 == 0) {
            System.out.println("divisible by three");
        } else if (num%5 ==0) {
            System.out.println("divisible by five");
        } else {
            System.out.println("number");
        }









    }
}
