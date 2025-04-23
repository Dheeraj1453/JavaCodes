package pack2;
import pack1.A;  //ye hmlog dusra package ka property use krne k liye krte hai
public class D extends A
{
	public static void main(String rags[])
	{
     A ob=new A();
     D ob1= new D();  //Hmlog ko protected use krne k liye phle ussi class ka obj bnana parega
     
     System.out.println("Before Change: ");
     System.out.println(ob.Public);
     System.out.println(ob1.PROTECTED);
  
     ob.Public="You can Excess Public member In D";
     ob1.PROTECTED="You can Excess Protected member In D";
     
     /*Hmlog outside package Class A k method ko use nhi kr skte*/
     
     System.out.println("After Change: ");
     System.out.println(ob.Public);
     System.out.println(ob1.PROTECTED);
	}
}

