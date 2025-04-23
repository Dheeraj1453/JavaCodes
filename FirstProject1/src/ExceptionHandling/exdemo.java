package ExceptionHandling;
import java.util.Scanner;
public class exdemo {	
	public void calc()
	{
		Scanner sc=new Scanner(System.in);
		try { 
			System.out.println("Enter the value of num1: ");
			int num1=sc.nextInt();  //ye bhi isliye try k andar likhe kyuki ho skta hai integer k jagah use string value inpur kre
			System.out.println("Enter the value of num2: ");
			int num2=sc.nextInt();
			System.out.println("div of numbers="+(num1/num2));
		} 
		catch(ArithmeticException o)
		{
			System.out.println(o.getMessage()); //get message will give which type of exception is occuring
		}
		catch(Exception ob)  //ye sbhi tarah k exception ko handle kr skta hai
		{
			System.out.println("Input the Integer Data");
		}
		
	}	
	
	public static void main(String[] args) {
		
		exdemo ob=new exdemo();
		ob.calc();
		
		
	}

}
