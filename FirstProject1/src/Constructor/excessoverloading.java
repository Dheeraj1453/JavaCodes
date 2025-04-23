package Constructor;
// this technique is called Polymorphism
public class excessoverloading 
{
public static void main(String args[])
{
	constructoroverloading c1= new constructoroverloading(101,"Dheeraj",90000);
	constructoroverloading c2= new constructoroverloading(104,"Siddhi");
	constructoroverloading c3= new constructoroverloading("Anurag",109,90000);
	constructoroverloading c4= new constructoroverloading();
	c1.getdata();
	c2.getdata();
	c3.getdata();
	c4.getdata();
}
}
