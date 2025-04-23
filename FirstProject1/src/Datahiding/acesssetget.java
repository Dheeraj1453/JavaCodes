package Datahiding;
public class acesssetget
{
	public static void main(String args[])
	{
		setget p1= new setget();  //Obj1 of product
		setget p2= new setget();  //Obj2 of product
		setget p3= new setget();  //Obj3 of product
		p1.setname("Shirt");
		System.out.println(p1.getname());
		p2.setprice(1700);
		System.out.println(p2.getprice());
		p3.setpid(100);
		System.out.println(p3.getpid());
		p3.setname("Jogger");
		System.out.println(p3.getname());
	}}
