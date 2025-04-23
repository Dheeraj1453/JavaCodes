package Intrface;
/*1 class ka 1 hi inherit class hota hai.
 * 1 class ka kitne bhi interface ho skte hai.
 */
interface iface1  //interface class  
{ 
	public static final int f1=100;
	public void display();
}

interface iface2 //interface class
{
	public static final int f2=200;
	/*yaha par agar same method hai toh wo dusra datatype nhi ho skta yani
	 * 'public int display()' nhi bn skta kyu isko jb hmlog implement krenge
	 * toh iske liye alag method bnana parega tb wo case method overiding nhi hoga kyuki
	 * same class mai hmlog same merhod ko override nhi kr skte  
	 *Tbhi sbhi mai 'public void display' ya 'public int display' use hoga.
	 */
	
	//public int display()  //ye error hoga
	public void display();
}

interface iface3  //interface class
{
	public static final int f3=300;
	public void display();
}

class test implements iface1,iface2,iface3
{

	@Override
	public void display()  // yaha tino k liye alag alag display ,ethod nhi bnaenge 1 hi mai tino ko overide krenge
	{
		System.out.println("Implementation of display method");
	}
	 
	/*public int display()
	 * {
	 * System.out.println("Implementation of display method");
	 * }
	 * ye error hai kyuki same name k 2 method 1 hi class mai override nhi hote
	 */
	
}

public class inter 
{
public static void main(String args[])
{
	test t = new test();
	 System.out.println(t.f1);
	 System.out.println(t.f2);
	 System.out.println(t.f3);
    t.display();
}
}
