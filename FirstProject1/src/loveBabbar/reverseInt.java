package loveBabbar;

import java.util.Scanner;

public class reverseInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int n= sc.nextInt();
		long temp=0;
		int rem;
		while(n!=0)
		{
	     	rem=n%10;
	     	temp=temp*10+rem;
	     	n=n/10;
		}
		if(temp>Integer.MAX_VALUE || temp<Integer.MIN_VALUE)
	    System.out.println("0");
		else
		System.out.println(temp);
	}
}
