package Assignment;
import java.util.Scanner;
public class SimpleInterest 
{
	public static void main(string[] args) 
	{
    Scanner sc=new Scanner(System.in);
    int p; //Principle
    double r,t,si; //they can be decimal hence there datatype is double
    System.out.println("Enter the Principle Amount:");
    p=sc.nextInt();
    System.out.println("Enter the Rate of Interest:");
    r=sc.nextDouble();
    System.out.println("Enter the time in Year:");
    t=sc.nextDouble();
    si=p*r*t/100;    //Simple Interest formula
    System.out.println("Simple Interest= "+si);
	}

}
