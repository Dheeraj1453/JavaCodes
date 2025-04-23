package My;
import java.util.Scanner;
public class logic {
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter value of 1st number=");
		int num1= scan.nextInt();
		System.out.println("Enter value of 2nd number=");
		int num2= scan.nextInt();
		System.out.println("And Operation="+(num1&num2));
	    System.out.println("Or Operation="+(num1|num2));
	    System.out.println("Xor Operator="+(num1^num2));
	    System.out.println("Not operator="+(~num1));
	}
}
