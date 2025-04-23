package ExceptionHandling;
import java.io.PrintWriter;   //or we can use java.io.*
import java.util.InputMismatchException;
import java.util.Scanner;

public class exhandling 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 number");
		PrintWriter pw;   //No use
		try {
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("div="+(num1/num2));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception o)
		{
			System.out.println(o);
		}
		System.out.println("exception handling demo");
		System.out.println("end of code");

	}

}
