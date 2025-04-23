package Inheritance;
public class Dailywage extends Employee   //Inherit krenge Employee koor Dailywage sara properties rkhega Employee ka 
{
    private float salary;   //Private sirf isse class mai access hoga 
    private int nodays;
    private float dailywage;
    Dailywage(int empid,String name,String email,String address,int nodays,float dailywage)
    {
    	super(empid,name,email,address);
    	this.nodays=nodays;
    	this.dailywage=dailywage;
    	this.salary=this.dailywage*this.nodays;  
    }
    @Override
	public String toString() 
    {
		return "\n\nDaily Wage Employee Details:-\nEid:"+empid+"\nName:"+name+"\nEmail:"+email+"\nsalary:" + salary+"\nAddress:"+address; 
	}

}
