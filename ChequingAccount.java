/*
 Name: Dwayne Dsouza
 Student ID: 200568219
 Class Details: This class represents Challenge 1. It indicates the initialization of 4 Instance Variables, without a Constructor 
 with 4 arguments and making use of the Getter and Setter for each Instance Variable
 */

public class ChequingAccount 
{
    private String firstName; //Instance Variable1
    private String lastName; //Instance Variable2
    private double balance; //Instance Variable3
    private int accountNumber; //Instance Variable4

    //Make use of the Getter for Instance Variable1
    public String getfirstName()
    {
        return firstName; 
    }
    //Make use of the Setter for Instance Variable 1
    public void setfirstName(String fn) 
    {
        this.firstName = fn; 
    }

    //Make use of the Getter for Instance Variable 2
    public String getlastName()
    {
        return lastName; 
    }
    //Make use of the Setter for Instance Variable 2
        public void setlastName(String ln) 
    {
        this.lastName = ln; 
    }

    //Make use of the Getter for Instance Variable 3
    public double getbalance() 
    {
        return balance; 
    }
    //Make use of the Setter for Instance Variable 3
    public void setbalance(double bal)
    {
        this.balance = bal; 
    }

    //Make use of the Getter for Instance Variable 4
    public int getaccountNumber()
    {
        return accountNumber; 
    }
    //Make use of the Setter for Instance Variable 4
    public void setaccountNumber(int an)
    {
        this.accountNumber = an; 
    }
    
}
