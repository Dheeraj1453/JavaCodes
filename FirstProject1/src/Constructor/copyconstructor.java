package Constructor;
class copyconstructor 
{
int eid;
String name;
float salary;
public copyconstructor(int eid,String name,float salary)
{
	this.eid=eid;
	this.name=name;
	this.salary=salary;
}
public copyconstructor(copyconstructor ob) //here we can see we copy 1st constructor to this constructor
{
	this.eid=ob.eid;
	this.name=ob.name;
	this.salary=ob.salary;
	}
public void getdata()
{
	 System.out.printf("Employee ID:%d Name of Employee:%s Salary:%.2f\n",eid,name,salary);
}
}
