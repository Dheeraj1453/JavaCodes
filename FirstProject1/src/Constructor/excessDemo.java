package Constructor;

public class excessDemo 
{
public static void main(String args[])
{
	Demo d1= new Demo(101,"Dheeraj",90000);   //In constructor we set the value inside the bracket 
	Demo d2= new Demo(102,"Anurag",50000);     //there is no need to call a constructor
	Demo d3= new Demo(103,"Siddhi",45000);
	/* Demo(101,"Aryan",44000) aese hmlog update nhi kr skte iske liye hmlog
	 *ko method ka use kena parega*/
	d1.getdata();
	d2.getdata();
	d3.getdata();
	d1.set(106,"Aryan",84000);
	d1.getdata();
}
}
