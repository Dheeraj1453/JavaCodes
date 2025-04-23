package My;
import java.util.Scanner;
public class Lcm{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int n1,n2,n3,max,lcm,temp,n=2;
	System.out.print("Enter first number:");
	n1= sc.nextInt();
	System.out.print("Enter second number:");
	n2= sc.nextInt();
	System.out.print("Enter third number:");
	n3= sc.nextInt();
	temp = n1>n2 ? n1:n2;
	max = temp>n3 ? temp:n3;
	lcm=max;
	while(true)
	{
		if(lcm%n1==0 && lcm%n2==0 && lcm%n3==0)
		{
			System.out.println("LCM of three number:"+lcm);
			break;
		}
     lcm+=max;
     System.out.println(lcm);
	}}
}
