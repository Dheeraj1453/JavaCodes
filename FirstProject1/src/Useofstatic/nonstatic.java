package Useofstatic;

public class nonstatic 
{
	
{
//ye nonstatic ka syntax hai or ye hmesha call hoga jbhi bhi object create hoga
System.out.println("Object Created");
}
public nonstatic() // 1st Constructor
{
	System.out.println("Default Constructor");
}
public nonstatic(int i)  //2nd Constructor
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

