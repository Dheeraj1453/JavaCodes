package ExceptionHandling;
import java.util.InputMismatchException;  //using this exception handling
import java.util.Scanner;

public class exdemo2 
{	
	static public void checkage()
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Ur Age:");		
		try {
			int age=sc.nextInt();
			if (age<18)
				throw new ArithmeticException("You r not allowed to cast ur vote"); //throw is use to print what message we want if exception occur
			else
				System.out.println("Welcome voter u r allowed to vote");
		}
		catch(ArithmeticException o)
		{
			System.out.println(o.getMessage());
		}
		catch(InputMismatchException o)  //if anyone enter string value then this handle
		{
			System.out.println("age accept only number");
		}
	}
	public static void main(String[] args) 
	{
		checkage();  //calling checkage method

	}

}
