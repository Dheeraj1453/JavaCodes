package Methodoveriding;
/*Final keyword:-
 * 1)Agar hmlog kisi class k aage final lga dete hai toh koi bhi 
 * uss class ko inherit nhi kr skta.
 * 2)Agar hmlog kisi method k aage final lga denge toh koi bhi
 * uss method ko override nhi kr skta.
 * 2)Agar hmlog kisi variable k aage final lga denge toh koi
 * uska value change nhi kr paega mtlb wo constant ho jaega
 */

final class A  //final class aab inherit nhi hoskta
{
	final int x=10; //final variable ko change nhi kr skte(Constant bn jaega)
	final void output() //final method ko override nhi kr skte
	{ 
		System.out.println("Hey! I'm Final class");
	}
}

public class finaldemo 
{
 public static void main(String args[])
 {
	 new A().output(); //1 baar call krne k liye variable bnane ka zrurat nhi
     System.out.println(new A().x);
 }
}
