package classes;
/*class k agar hmlog 1 or class bnaenge toh wo hmlog ka 
 * Nested class kehlata hai. There are four types of Nested class
 * 1)Inner class 2)Method local inner class 3)Anonymous inner class 4)Static Nested class
 */
class regouterclass  //outer class
{
	public static void staticmethod()  //Static method isko call krne k liye obj bnane ka zrurat nhi class k name se bhi call kr skte hai
	{
		System.out.println("Hey! I'm Static Method of outer class");
	}
	public void nonstaticmethod()  //Non-Static method isko call krne k liye obj create krna parega
	{
		System.out.println("Hey! I'm Non-static Method of outer class");
	}

	class reginnerclass  //inner class
	{
		public static void staticmethod()  //Static method isko call krne k liye obj bnane ka zrurat nhi class k name se bhi call kr skte hai
		{
			System.out.println("Hey! I'm Static Method of inner class");
		}
		public void nonstaticmethod()  //Non-Static method isko call krne k liye obj create krna parega
		{
			System.out.println("Hey! I'm Non-static Method of inner class");
			
		}
	}
}

//Main class
public class Innerclass 
{
public static void main(String args[])
{
	regouterclass ob= new regouterclass(); //ye obj se hmlog outer class k method call kr paenge inner k nhi
    ob.nonstaticmethod();
    regouterclass.staticmethod(); //static method ko call krne k liye class ka name hi use hota hai

/*aab reginner k method ko call krne k liye outerclass k obj se krna parega 
 */
    System.out.println();
    regouterclass.reginnerclass in = ob.new reginnerclass();  //aese hmlog innerclass ka obj bnaenge
    in.nonstaticmethod();  //calling non static method of inner class
    regouterclass.reginnerclass.staticmethod();  //static methd hmlog class k name use krke krte hai  
    in.staticmethod();  //aese bhi static method ko call kr hi skte hai
    System.out.println();
    
//aab bina outerclass ka alag se obj bnakr ussi mai one-time kaise bnaenge
    regouterclass.reginnerclass ob1= new regouterclass().new reginnerclass(); 
    ob1.nonstaticmethod();
    System.out.println();   
 
    //aab 1 baar k liye ussi time hmlog create kr lenge variable uska nhi bnaenge
    new regouterclass().new reginnerclass().nonstaticmethod();
}
}
