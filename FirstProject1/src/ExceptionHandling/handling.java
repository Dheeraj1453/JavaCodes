package ExceptionHandling;
/*There are 6 methods for Exception Handling:-
 * try-> Trap the Exception.
 * catch->exception handler(action)
 * finally->resources free
 * throw->forcefully raise exception
 * throws->to delegate the task of exception handling to parents
 * assert-> debugging
 */
import java.util.Scanner;
// Aab wahi example mai jb 0 le rhe toh exception aa jaa rha tha toh aab isko exception handlig k through kaise bnaenge

public class handling
{
	static Scanner sc = new Scanner(System.in);
public static void test2()  //static method
{
	System.out.println("Inside Test 2");
	System.out.println("Enter 1st number");
	int i=sc.nextInt();
	System.out.println("Enter 2nd number");
	int j=sc.nextInt();
	try { //try mai wahi likhenge jaha exception aa skta hai
	int res=i/j;
	System.out.println("Division:"+res);
	//System.out.println("End of Test 2");  ye try k andar nhi likhenge kyuki fir ye print nhi hoga or iska exception se koi lena dena nhi
	}
	
	catch(Exception ob)  //try k just baad catch aaega and 'Eception ob' kisi bhi tarah ka exception yaha hmlog specific exception ka naam bhi de skte hai
	{
		System.out.println("Exception occur");
	}
	System.out.println("End of Test 2");
	
	}

public static void test1()  //static method
{
	System.out.println("Inside Test 1");
	test2();
	System.out.println("End of Test 1");
}

public static void main(String args[])
{
	System.out.println("Inside Main");
	test1();
	System.out.println("End of Main");
}
}

