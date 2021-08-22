package MiniProject;

public class Customer extends Accounts {
    String name, ssn, phone, cityName;

    /**
     * Every Customer can have maximum 5 bank account with Bank.
     */
    Customer acc1;
    Customer acc2;
    Customer acc3;
    Customer acc4;
    Customer acc5;

    /**
     * 1. createProfile
     *      name
     *      ssn
     *      phone
     *      cityName (optional)
     */
    public void createProfile (String xname,String xssn,String xphone,String xcityName) {
        if (totalAccounts <= 5) {
            name = xname;
            ssn = xssn;
            phone = xphone;
            cityName = xcityName;
            accountNr = ++totalAccounts;
            System.out.println("name:" + name + "\n" + "ssn: " + ssn + "\n" +
                    "phone: " + phone + "\n" + "CityName: " + cityName);
        } else{
            System.out.println("Maximum accounts are 5, you have reached the limit");
        }
    }


    /**
     * 2. updateProfile()
     *      customer should send fieldName and newValue
     */

    public void updateProfile (String field , String newValue){
        switch (field.toLowerCase()){
            case "name":
                name = newValue;
                break;
            case "ssn":
                ssn = newValue;
                break;
            case "phone":
                phone = newValue;
                break;
            case "cityName":
                cityName = newValue;
                break;
            default:
                System.out.println("Incorrect field entered : " + field);

        }
    }



    /**
     * 3. showProfile
     *      Name:
     *      Phone number:
     *      (if provided) CityName:
     *      Total number of Accounts:
     */
    public void showProfile (){
        System.out.println("Profile name : " + name + "\n" + "Phone number : " + phone + "\n" + "CityName : " + cityName);
    }




    public static void main(String[] args) {

        /**
         * openAnAccount
         *      pls use openAccount method from Accounts class
         */
       Accounts a1 = new Accounts();


        a1.setAccountType("checking");
        a1.setBalance(100);
        a1.getAccountNr(123456789);

        /**
         * makeDeposit
         *      pls use deposit method from Accounts class
         */
        a1.deposit(5000.00);

        /**
         * makeWithdraw
         *      pls use withdraw method from Accounts class
         */

        a1.withdraw(1000.00);
        /**
         * getBankBalance
         *      with 1 argument
         *      pls use showBalance method from Accounts class
         *
         * Account Number: 1234
         * Balance $ 100.00
         *
         */
        a1.showBalance();
        a1.getAccountNr(123456789);



        /**
         * getBankBalance
         *      with no arguments
         *      pls use showBalance method to print balance of
         *      all Account with the Customer
         */
        a1.showBalance();



    }

}
