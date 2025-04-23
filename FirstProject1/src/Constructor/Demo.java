package Constructor;

public class Demo 
{	
	  int Eid;
	  String name;
	  float salary;
 public Demo(int Eid,String name,float salary)    //Constructor name should of same name of class and 
{                               // *and it doesn't have any return type*/
	this.Eid=Eid;
	this.name=name;
    this.salary=salary;
}
 public void getdata()
 {
	 System.out.printf("Employee ID:%d Name of Employee:%s Salary:%.2f\n",Eid,name,salary);
 }
 
/* aab agar same object mai change krna hoga toh uske liye hmlog methods 
 * ka use krte hai*/
 
 public void set(int Eid,String name,float salary)
 {
	   this.Eid=Eid;
	   this.name=name;
	   this.salary=salary;
	}
 }