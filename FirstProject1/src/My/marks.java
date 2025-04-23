package My;
import java.util.Scanner;
public class marks {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks=");
		int marks= sc.nextInt();
		if(marks>=90)
		System.out.println("First Division");
		else
			if(marks>=75&&marks<90)
				System.out.println("Second Division");
			else
				if(marks>=50&&marks<75)
					System.out.println("Third Division");
				else
					System.out.println("You have been Fail");
	}

}
