package Assignment;
import java.util.Scanner;
public class RomanNo 
{
public static void main(string args[])
{
	Scanner sc=new Scanner(System.in);
	int i,n;
	System.out.println("Enter Your Number:");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		if(n<=3)
			System.out.print("I");
	    if(n==4)
	    {
	    	System.out.print("IV");
	        break;
	    }
	}
}
}
