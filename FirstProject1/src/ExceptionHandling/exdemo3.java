package ExceptionHandling;
import java.io.*;  //include all the libraries
import java.util.Scanner;
public class exdemo3 {
	
	static void writeData() throws FileNotFoundException   //this throw the exception which will handle in main method
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your message");
		String message=sc.nextLine();
		PrintWriter pw=new PrintWriter("testing.text");
		pw.print(message);
		pw.flush();
		pw.close();
		
	}

	public static void main(String[] args) {
		
		try {
				writeData(); //calling method write data
			}
		catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
	}

}
