package NPTEL;
import java.util.Scanner;
class BankAccount 
{
    private double balance;
    
   //your code
    public BankAccount(double balance)
    {
      this.balance=balance;
    }

    //method for Deposit Amount
    public void deposit(double x)
    {
    	this.balance+=x; 
    }
        
      public void withdraw(double y)
    {
    	if(y>balance)
    	System.out.println("Insufficient Balance!");
    	else
    	this.balance-=y;
    }
     public double getBalance()
     {
    	 return balance;
     }
    	
    	
    	
    	
   //Main method
    	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();

            BankAccount account = new BankAccount(initialBalance);

            // System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            // System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);

            System.out.print("Balance: " + account.getBalance());

            scanner.close();
        }
    }
    	