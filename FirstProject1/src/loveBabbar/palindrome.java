package loveBabbar;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int n= sc.nextInt();
		int temp=0,rem,x=n;
		while(x>0)
		{
	     	rem=x%10;
	     	temp=temp*10+rem;
	     	x=x/10;
		}
		if(temp==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		double s =1;
		double e=4;
		double mid=s+(e-s)/2;
		System.out.println(mid);
	}
}
