package Inheritance;
class GrandParent
{
	public GrandParent()
	{
		System.out.println("Hey! I'm GrandParent Constructor");
	}
	public void set()
	{
		System.out.println("Hey! I'm GrandParent Method");
	}
}

class Parent extends GrandParent   //Inherit GrandParent
{
	public Parent()
	{
		System.out.println("Hey I'm Parent Constructor");
	}
}

class Son extends Parent   //Inherit Parent that inherit Grandparent(Son cosist both properties)
{
	public Son()
	{
		System.out.println("Hey I'm Son constructor");
	}
}

//Main class
public class Multilevel 
{
public static void main(String args[])
{
	Son ob = new Son();   //Calling Default constructor 
	
  /*yaha son constructor ko call krenge toh dono Grandparent and parent ka constructor call hoga 
   * kyuki Grandparent class hai tbhi parent class hai and Parent hai tbhi Son hai isliye phle wo dono
   * call honge tbhi son hoga*/
	System.out.println();
    new Parent();    //no need to create variable kyuki 1 baar hi use krna tha
    System.out.println();
    ob.set();  //kyuki inherit hai toh hmlog son se bhi GrandParent k method ko call kr skte hais

}
}
