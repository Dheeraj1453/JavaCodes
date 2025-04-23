package My;
import java.util.Scanner;
public class Name {
	public static void main(String args[]){
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any Interger:");
	int i= scan.nextInt();
	System.out.println("Number="+i);
	System.out.println("Enter any Float:");
	float j= scan.nextFloat();
	System.out.println("Float Value="+j);
	System.out.println("Enter any Double");
	double d= scan.nextDouble();
	System.out.println("Double value="+d);
	System.out.println("Enter Any Name:");
	scan.nextLine(); //nextline enter ko default string maan leta hai isliye phle hi 1 use kr liye
	String str= scan.nextLine(); //nextLine() function space accept krta hai sirf next() space nhi lega
	System.out.println("Name="+str);
}
}
