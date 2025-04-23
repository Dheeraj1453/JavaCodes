package classes;
/*Agar hmlog ko aesa class jisko hmlog ko bss 1 baar use krna ho 
 * toh uske liye hmlog Inheritance toh class bnakr method ko override kr skte hai 
 * but 1 baar change k liye jo temporary ho uske liye Anonymous class bnaenge or jb kaam nhi aaenge toh hatta denge 
 */
class bigbazzar
{
	void firstTime()
	{
		System.out.println("10% Discount");
	}
	
	void monthly()
	{
		System.out.println("30% Discount");
	}
	
	void weekly()
	{
		System.out.println("50% Discount");
	}
}

/*Aab agar kbhi diwali events mai discount hmlogo ko 10% se badhana hoga toh uske liye hmlog inherit kr skte hai
 * but aab single k liye jo temporarily ho uske liye inherit k jaisa permanent class nhi bnaenge Anonymous class
 * ka use krenge.
 */
public class Anonyclass 
{
public static void main(String args[])
{
	bigbazzar bb= new bigbazzar();
	bb.firstTime();
	bb.monthly();
	bb.weekly();
	System.out.println();
	
	//aab 10% se discount badhana hai
	//Anony class aese bnega:- 1st way
	bigbazzar ny= new bigbazzar() {
		void firstTime()
		{
			System.out.println("20% Discount");
		}
		void monthly()
		{
			System.out.println("40% Discount");
		}
	};  
	bigbazzar bb1 = new bigbazzar()
			{
		     void monthly()
		     {
		    	 System.out.println("55% Discount");
		     }
			};
	ny.firstTime();
	ny.weekly();
	ny.monthly();
	bb1.monthly();
	System.out.println();
	
	//2nd way:-
	new bigbazzar()
	{
		void weekly()
		{
			System.out.println("60% Discount");
		}
	}.weekly();
	
	//agar hmlog ko pta krna hai ki konse class ka obj hai toh usko aese dekh skte hai
	System.out.println();
    System.out.println(bb.getClass().getName());
    System.out.println(ny.getClass().getName());
    System.out.println(bb1.getClass().getName());
}
}
