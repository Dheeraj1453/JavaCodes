package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
//Or kya kya exception aa skte hai program mai

public class handling3
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
	//1 try k 1 se jyada Catch ho skte hai
	//aese Hmlog specify kr denge ki kis Exception k liye hmlog catch bnaya hai toh isse Readability badh jata hai code ka
	//Ex:- 'Exception ob' mai saare exception aajate the toh koi usse nhi bta skta tha ki konse exception k liye code hai
	catch(ArithmeticException ob) 
	{
		System.out.println("Arithematic Exception Occur");
		//yaha exception k andar exception tha toh waha bhi try catch bn lenge
		try  //Catch k andar try
		{
	    System.out.println(10/0); //toh jaha bhi exception aae waha try and catch bna lo
		}
		catch(ArithmeticException ex)  //ye catch dusre try k liye hai toh ye 'ob' nhi hoga
		{
			System.out.println("Another Arithematic Exception Occur ");
		}
		}
	catch(InputMismatchException ob)
	{
		System.out.println("Input Mismatch Exception Occur");
	}
	catch(Exception ob) //hmlog isko bhi catch mai likh denge kyuki agar wo dono exception nhi hua toh kuch or exception k liye 'Exception on'
	                 //or ye last mai likhenge kyuki agar phle likh denge toh first do catch ka fyada kya isse se sb exception handle ho jaega.
	{
		System.out.println("Exception Occur");
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

