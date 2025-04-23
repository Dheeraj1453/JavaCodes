package Oopsrelation;
public class Student 
{
int roll;
String name;
float per;
Address add;
public Student(int roll, String name, float per, Address add) 
{
	super();
	this.roll = roll;
	this.name = name;
	this.per = per;
	this.add = add;
}
@Override
public String toString() 
{
	return "\nStudent Roll no:" + roll + "\nName:" + name + "\nPercentage:" + per + "%\n" + add.toString();
}

}
