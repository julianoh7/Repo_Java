package MiniProject;

public class Accounts {
    double balance;
    String accountType;
    int accountNr;
   static int totalAccounts;


    /**
     * 1. openAccount
     *      Type (Savings, Checking)
     *      starting deposit
     *      user should get unique account number
     */
    public void setAccountType (String type){
        String accountType = type;
        System.out.println("The current account type is a " + accountType + " account");
    }
        public void setBalance (double mBalance){
        double balance = mBalance;
            System.out.println("Minimum deposit is : " + balance);
        }
    public int getAccountNr (int number){
        int accountNr=0;
        System.out.println("Account number is : " + number);
        return 0;
    }




    /**
     * 2. deposit
     *      account number
     *      amount
     *
     */

    public double deposit(double amount) {
        if (amount>0){
            balance = balance +amount;
        }else {
            System.out.println("Invalid amount to deposit" + amount);
        }
        return balance;
    }


    /**
     * 3. withdraw
     *      account number
     *      amount
     */
    public double withdraw (double amount) {
        if (balance>=amount){
            balance-= amount;
        }else{
            System.out.println("error");
        }
        return balance;

    }


    /**
     * 4. showBalance
     *      account number
     *      sout(balance)
     */
    public void showBalance (){
        System.out.println("Balance is : " + balance + accountNr);
    }





}
