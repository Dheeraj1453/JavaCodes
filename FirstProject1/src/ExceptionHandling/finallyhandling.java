package ExceptionHandling;
import java.util.Scanner;
import java.io.PrintWriter;
public class finallyhandling 
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	PrintWriter pw=null;
	try
	{
		pw=new PrintWriter("text.text");  //ye hmlog ko output console mai nhi alag 1 txt file mai dega
		System.out.println("Enter 1st number:");
		int i= sc.nextInt();
		System.out.println("Enter 2nd number:");
		int j= sc.nextInt();
        int res=i/j;
        String result="Division of Numbers:"+res;
        pw.println(result);
        System.out.println("Try block Executed Successfully");
       
	}
	catch(Exception e)
	{
		pw.println("Exception occur");
		System.out.println("Catch block Executed Successfully");
	}
	
	/*aab flush abd close ko dono try and block mai likhne se acha hmlog 'finally' mai likh dnge
	 * kyuki exception ho ya na ho 'finally' block hmesha chlega.
	 * jbhi bhi try catch ho toh finally ko catch k baad hi likhenge.
	 */
 finally
 {
	 //Exception ho ya na ho finally hmesha execute hoga
	 pw.flush();
	 pw.close();
	 System.out.println("Finallys block Executed Successfully");
 }

}
}
