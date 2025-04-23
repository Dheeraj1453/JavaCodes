package methodhiding;
class parent
{
	public static void test()  //Method ko hide kene k liye static ka use krenge iska use niche hai
	{
		System.out.println("Hey! I'm Parent class Method");
	}
}

class child extends parent
{
	public static void test() //use of static for method hiding
	{
		System.out.println("Hey! I'm Child class Method");
	}
}

//Main class
public class demo 
{
public static void main(String args[]) 
{
	parent.test();
	child.test();

	/*Kyuki hmlog 'static' use kiye hai toh agar hmlog 1 ka reference dekr dusre class ka
	 * obj bnaenge bhi(Dynamic Binding) firbhi wo reference wle method ko hi call krega
	 */
	System.out.println();
	parent ob= new child();
	ob.test();  //ye parent wle method ko hi call krega
}
}
