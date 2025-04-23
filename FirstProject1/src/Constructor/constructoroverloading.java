package Constructor;

class constructoroverloading 
{
	int Eid;
	String name;
	float salary;
public constructoroverloading(int Eid,String name,float salary)
{
	this.Eid=Eid;
	this.name=name;
	this.salary=salary;
}
public constructoroverloading(int Eid,String name)  //2 constructor ka ya toh argument change hoga
{
	this.Eid=Eid;
	this.name=name;
	}
public constructoroverloading(String name,int Eid,float salary)  //ya sequence change hoga jb parameter same ho
{
	this.Eid=Eid;
	this.name=name;
	this.salary=salary;
}
public constructoroverloading()   //Default Constructor 
{
	/*agar hmlog default constructor bna lete hai toh
	 * java hmlog ko java ka default constructor nhi deta*/
}
public void getdata()
{
	 System.out.printf("Employee ID:%d Name of Employee:%s Salary:%.2f\n",Eid,name,salary);
}
}
