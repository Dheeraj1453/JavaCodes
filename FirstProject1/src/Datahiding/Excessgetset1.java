package Datahiding;

public class Excessgetset1
{
	public static void main(String args[])
	{
		setget1 p1= new setget1();  //Obj1 of product
		setget1 p2= new setget1();  //Obj2 of product
		setget1 p3= new setget1();  //Obj3 of product
		p1.setEid(420);
		System.out.println(p1.getEid());
		p2.setName("Aditya");
		System.out.println(p2.getName());
		p3.setG('B');
		System.out.println(p3.getG());
		p3.setSalary(69);
		System.out.println(p3.getSalary());
}}
