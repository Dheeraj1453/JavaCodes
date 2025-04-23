package Inheritance;
public class Employee 
{
	static String companyname="Wipro";
	protected int empid;    //Protected ko hmlog inherit kr skte hai
	protected String name;
	protected String email;
	protected String address;

	public Employee(int empid,String name,String email,String address)
	{
		this.empid=empid;
		this.name=name;
		this.email=email;
		this.address=address;
	}
	
	public static void companyName() 
	{
		System.out.println("Company Name:"+companyname);
	}
}