package Useofstatic;

public class nonstatic1
{
	static //static 1 program mai 1 hi bnega
	{
		//static agar same class mai 'main' k sath likhenge toh phle Static chlega
		System.out.println("Static Block");
	}

	{
//ye nonstatic ka syntax hai hai or ye hmesha call hoga jbhi bhi object create hoga
//non static kitna bhi bn skta hai
		System.out.println("Object Created 1");
 } 
	
	{
	//2nd non-static 
	  System.out.println("Object created 2");	
	}
	
	{
		//3rd non-static
		System.out.println("Object created 3");
	}
	
	public nonstatic1() // 1st Constructor
{
	System.out.println("Default Constructor");
}
public nonstatic1(int i)
{
	System.out.println("Parameterized Constructor");
}
public void test()
{
	System.out.println("Hello From Test");
}
public static void main(String args[])
{
	nonstatic ob1= new nonstatic();  //jitna baar Object create krenge tb tb nonstatic call hoga
	nonstatic ob2= new nonstatic(10);
    ob1.test();
    ob1.test();
    ob1.test();
    ob1.test();
}}

