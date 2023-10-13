/*
 Name: Dwayne Dsouza
 Student ID: 200568219
 Class Details: 
 This class represents Challenge 2. New Object is created to call the set & get methods from the previous class and print the appropriate 
 statement using the correct get method. 
 This class also represents Challenge 3 where the First Name and Last Name are changed again using Setters and Getters.  
 */

public class ChequingAccountTestHarness 
{
    public static void main (String [] args)
    {
        //Creating a new Object to call the method from the common class
        ChequingAccount details = new ChequingAccount ();

        //Using the newly created object to call the methods from the common class
        details.setfirstName("Jason");
        details.setlastName("Bourne");
        details.setbalance(88537.75);
        details.setaccountNumber(230065);

        //Print the First Name 
        System.out.println("My First Name is" + " " + details.getfirstName());

        //Print the Last Name 
        System.out.println("My Last Name is" + " " + details.getlastName());

        //Print the Balance 
        System.out.println("The Total Balance of the Checking Account is" + " " + details.getbalance());

        //Print the Account Number
        System.out.println("The Account Number is" + " " + details.getaccountNumber());

        //Create a new Object to call the method from the common class
        ChequingAccount details1 = new ChequingAccount();

        //Challenge 3. Changing the First name and Last Name and obtaining the desired result 
        details1.setfirstName("John"); 
        details1.setlastName("Wick");

        //Print the new First Name
        System.out.println("My First Name is" + " " + details1.getfirstName());

        //Print the new Last Name
        System.out.println("My Last Name is" + " " + details1.getlastName());

        //Print the original Balance
        System.out.println("The Total Balance of the Checking Account is" + " " + details1.getbalance());

        //Print the original Account Number
        System.out.println("The Account Number is" + " " + details.getaccountNumber());
    } 
}

