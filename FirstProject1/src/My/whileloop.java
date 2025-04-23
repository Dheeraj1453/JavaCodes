package My;
import java.util.Scanner;
public class whileloop {
	public static void main(String args[]) {
		int count=1;
		while(count<=10)   //While is an entry control loop 
		{
			System.out.println(count+". Hello World");
			count++;
		}
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("Hi People");
			System.out.println("Do you want to print the Msg again Yes or No?");
			String a=sc.next();
			if(a.equals("No"))  //yes or no mai jb comparison krenge
			{
				break;
			}
		}		
	}
}
