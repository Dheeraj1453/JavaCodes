package Abstract;
abstract class Bank   //Abstract class 
{ 
	public Bank()  //Abstract class constructor used of child classes
	{
		System.out.println("In Sate Bank Of India");
	}
	abstract void deposit();
	abstract void credit();
}

class Current extends Bank  //Inherit class 1 of Bank
{
	public void deposit()
	{
		System.out.println("You can Deposit upto 2-10 Lakhs at a time");
	}
	public void credit()
	{
		System.out.println("There is no Limit of credit");
	}
}

class Saving extends Bank //Inherit class 2 of Bank
{
	public void deposit()
	{
		System.out.println("You can Deposit upto 10 Lakhs per Financial year");
	}
	public void credit()
	{
		System.out.println("You can Credit upto 50 Thousands in a Day");
	}
}


//Main class
public class Account 
{
public static void main(String args[])
{
	System.out.println("Current Account:-");
	Current ob= new Current();  //current class obj
	ob.deposit();
	ob.credit();
	System.out.println("\nSaving Account:-");
	Saving ob1= new Saving(); //saving class obj
	ob1.deposit();
	ob1.credit();
	System.out.println();

  //by referncing
	Bank Ob= new Current();
	Ob.deposit();
	Ob.credit();
	System.out.println();
	Ob=new Saving();
	Ob.deposit();
	Ob.credit();
   }
}
