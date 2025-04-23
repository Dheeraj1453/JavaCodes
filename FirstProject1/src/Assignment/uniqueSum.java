package Assignment;
import java.util.Scanner;
public class uniqueSum {
	public static void main(string args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any Number: ");
	int n,p,s=0;
	n=sc.nextInt();
	while(n!=0)
	{
		p=n%10;   //give the last digit of number 
		s=s+p;    //sum each last digit of number
		n=n/10;   //Last digit of number remove
	}
	System.out.println("Sum of your Number: "+s);
	}

}
