package classes;
/*agar hmlog main class mai hi 1 local class bna lenge toh wo method local class
 * kehlata hai.
 */
public class methodlocal
{
	class innerclass  //method local inner class
	{
		static void sum(int p,int q)  //static method
		{
			System.out.println("Sum="+(p+q));
		}
	}
public void sum(int i,int j)
{
	System.out.println("Sum="+(i+j));
}
public static void main(String args[])
{
	methodlocal ob= new methodlocal();
	ob.sum(12, 98);
	System.out.println("Some code");
	ob.sum(45,16);
	System.out.println("Some code");
	ob.sum(50, 88);
	System.out.println("Some code");
	ob.sum(120, 198);
	System.out.println("Some code");
	System.out.println();

	innerclass.sum(45, 991); //static method ko class k name se call kr skte hai
	innerclass.sum(645, 891);
}
}
