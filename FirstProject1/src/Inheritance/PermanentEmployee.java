package Inheritance;

public class PermanentEmployee extends Employee   //Hierarical Inheritance:- Employee k 2 child permanentwage and dailywage
{
	private float salary;   //Private access modifier use in this class only
	private float basic;
	private float hra;
	private float da;
	
	public PermanentEmployee(int empid,String name,String email,String address,float basic,float hra,float da)
	{
		super(empid,name,email,address);
		this.hra=hra;
		this.basic=basic;
		this.da=da;
		this.salary = this.basic + this.hra +this.da;
	}

	@Override
	public String toString() {
		
		return "Permanent Employee Details:-\nEid:"+empid+"\nName:"+name+"\nEmail:"+email+"\nsalary:" + salary+"\nAddress:"+address; 
	}
	
	

}
