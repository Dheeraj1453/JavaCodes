package Oopsrelation;
public class Employee
{
  int eid;
  String name;
  float salary;
  Address add;  //ye hmlogo ko address ka sara value de dega jo jo Address clas mai hoga

  /*String area;
  String city;
  String state;
  String pin;*/  //itna likhne ka zrurat nhi hmlog ko uske jagah Address add likhenge
  
  public Employee(int eid, String name, float salary, Address add) 
  {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
	this.add =add;
}

@Override
public String toString() {
	return "\nEmployee Id:" + eid + "\nName:" + name + "\nSalary:" + salary +"\n"+ add.toString();
}
}
