package ExceptionHandling;
/*check Exception:- Jb kbhi compiler hmlog ko code mai hi bta deta hai  ki exception aaega 
 * toh usko hmlog checked Exception bolenge.
 * 
 * Unchecked Exception:- Similarily,Jb kbhi compiler hmlog ko code mai nhi btaega ki exception aaega 
 * toh usko hmlog unchecked Exception bolenge.
 */

public class checkuncheckexception 
{
	public static void main(String args[])
	{
		
	System.out.println(10/0);  //Unchecked Exception
	int arr[]= {10,20,30,40,50};
	System.out.println(arr[5]);  //Unchecked Exception
	String str="James";
	System.out.println(str.charAt(5));  //Unchecked Exception
	String st=null;
	System.out.println(st.hashCode());   //Checked Exception
	try {
	Thread.sleep(500000);   //checked exception
	}
	catch(InterruptedException e)
	{}
}
}