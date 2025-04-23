package pack1;
public class C extends A  /*Agar hmlog extends A denge toh hmlog class C ka obj bnakr
                         *bhi sbhi Class A k value ko call kr paenge*/
{                 
public static void main(String args[])
{
	C ob= new C(); //Yaha hmlog Class C ka bhi object bnaenge firbhi Class A ka value call hoga
	A.Amethod();
	ob.Amethod();
	
	System.out.println("Before Change: ");
	 System.out.println(ob.DEFAULT);
	 System.out.println(ob.Public);
	 System.out.println(ob.PROTECTED);
	 
	 //After access we change the value
	 System.out.println("After Change: ");
	 ob.DEFAULT="You Can Excess Default";
	 ob.Public="You Can Excess Public";
	 ob.PROTECTED="You Can Excess Protected";
    System.out.println(ob.Public);
    System.out.println(ob.DEFAULT);
    System.out.println(ob.PROTECTED);
	
}
}
