package Datahiding;

class setget1  
{
private int Eid;
private String name;
private float salary;
private char G;

/* aab eclipse mai 1 key hai jisse automatic sbhi k liye setget bn jaenge
 * key:- Alt+shift+s */

public int getEid() {
	return Eid;
}
public void setEid(int eid) {
	Eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public char getG() {
	return G;
}
public void setG(char g) {
	G = g;
} 

}
