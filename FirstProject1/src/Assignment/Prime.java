package Assignment;
import java.util.Scanner;
public class Prime 
{
	public static void main(string[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,s=0;
		System.out.print("Prime Number from 1 to which number:");
        n=sc.nextInt();
        System.out.print("Prime No: ");
        for(i=1;i<=n;i++)
        {
        	for(j=1;j<=n;j++)
        	{
        	if(i%j==0)
        	{
        		s++;
        	}}
        	if(s==2)
        		System.out.print(" "+i);
        	s=0;
	}
	}
}
