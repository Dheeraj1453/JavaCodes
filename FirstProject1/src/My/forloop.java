package My;
import java.util.Scanner;
public class forloop {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		for(;;) //it means condition is true
		{
			System.out.println("Hello Human");
			System.out.println("You want to print Msg again? Yes or No");
			String a= sc.next();
			if(a.equals("No"))
			{
				break;
			}
		}
	}

}
