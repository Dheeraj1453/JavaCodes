package ExceptionHandling;
import java.util.Scanner;
//Or kya kya exception aa skte hai program mai

public class handling1
{
	static Scanner sc = new Scanner(System.in);
public static void test2()  //static method
{
	System.out.println("Inside Test 2");
	try {   //aab ho skta hai user int i mai kisika name daalde toh wo input exception hogya isliye jaha jaha exception aa skta hai usko hmlog try mai daal denge
	System.out.println("Enter 1st number");
	int i=sc.nextInt();
	System.out.println("Enter 2nd number");
	int j=sc.nextInt();
	int res=i/j;
	System.out.println("Division:"+res);
	//System.out.println("End of Test 2");  ye try k andar nhi likhenge kyuki fir ye print nhi hoga or iska exception se koi lena dena nhi
	}
	
	catch(Exception ob)  //try k just baad catch aaega and 'Eception ob' kisi bhi tarah ka exception yaha hmlog specific exception ka naam bhi de skte hai
	{
		System.out.println(ob.getMessage());  //ye hmlog ko btaega kis tarah ka exception ouccur hua hai
		ob.printStackTrace();  //ye bhi konsa exception hua ye or konse line mai hua uska pura tracki krke btata hai
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

