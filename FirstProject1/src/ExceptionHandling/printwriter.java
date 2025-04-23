package ExceptionHandling;
import java.util.Scanner;
import java.io.PrintWriter;
public class printwriter 
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
        pw.flush();  //ye dono(flush and close) agar try k body mai rha toh exception nhi aaega tbhi txt mai print hoga
        pw.close();  //isliye ye dono ko catch k body mai bhi likhenge taki exception aae firbhi txt mai print ho
	}
	catch(Exception e)
	{
		pw.println("Exception occur");
		pw.println(e.getStackTrace()); //konsa exception and konse line mai hua ye btaega
		pw.flush();
		pw.close();
	}
}
}
