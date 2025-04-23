package NPTEL;
class Circle
{
	double x,y,r;
	double circumference()   //method in a class, it has a return value 
	{
		return 2*3.14159*r;
	}
	double area()      //method in a class 
	{
		return (22/7)*r*r;
	}}
//Main Class
class demo1{
public static void main(String args[])  //This line should always present in main class
{
Circle c= new Circle();  //Creating an object
c.x=0.0;
c.y=0.0;
c.r=5.0;
System.out.println("Circumference= "+c.circumference());
System.out.println("Area= "+c.area());
}
}
