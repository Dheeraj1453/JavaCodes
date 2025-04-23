package pack1;  
public class B  /*same package mai hmlog ko import pack krne ka zrurat nhi
                *or naah hi extend class likhne ka*/
{
 public static void main(String args[])
 {
	 A ob=new A();
	 A.Amethod();  //hmlog aese bhi method ko call kr skte hai
	 ob.Amethod();  //aese toh krte hi hai method ko call
	 
	 System.out.println("Before Change");
	 System.out.println(ob.DEFAULT);
	 System.out.println(ob.Public);
	 System.out.println(ob.PROTECTED);
	 
	 //After access we change the value
	 System.out.println("After Change");
	 ob.DEFAULT="You Can Excess Default";
	 ob.Public="You Can Excess Public";
	 ob.PROTECTED="You Can Excess Protected";
     System.out.println(ob.Public);
     System.out.println(ob.DEFAULT);
     System.out.println(ob.PROTECTED);
 }
}
