package MiniProject;

public class Bank {
     /**
      ** Due : Aug 22 2021
      *
     * * Bank -> create Customer Object
     * customerObject we gonna run methods form Customer class
             *          * methods in Customer class will be using methods form Accounts class
             *          *
             *                  */


     public static void main(String[] args) {
     Customer a2 = new Customer();
     a2.createProfile("James","123456789","646-222-0000","Queens");
     a2.updateProfile("name","Michael");
     System.out.println("\n");
     a2.showProfile();
     a2.deposit(5000.00);
     a2.withdraw(1000.00);
     a2.showBalance();
     a2.getAccountNr(123456789);











     }


}
