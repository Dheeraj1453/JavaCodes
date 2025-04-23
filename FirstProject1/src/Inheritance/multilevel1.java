package Inheritance;
class first
{ 
	
	/*Hoskta hai first nd Second dono paramerterized
	 * constructor ho tb third wla kaise call krega? niche dekho*/
	public first(int i)
	{
		System.out.println("Hey! I'm First Constructor");
	}
	}

class Second extends first   //Inherit GrandParent
{
	public Second(int j)
	{
		super(j); /*Super parent k kisi member ko use krne k liye hota hai yaha super(i)
         *First wle k parameterized ko call krega*/

		System.out.println("Hey I'm Second Constructor");
	}
}

class Third extends Second   //Inherit Parent that inherit Grandparent(Son cosist both properties)
{
	public Third()
	{
		this(12);  //ye wla third wle k parameterized ko call krega jb default ko main mai call kiya jaega
		System.out.println("Hey I'm Third Default Constructor");
	}
	public Third(int z)
	{ 
		super(10); /*Super parent k kisi member ko use krne k liye hota hai yaha super(10)
		           *Second wle k parameterized ko call krega*/
		System.out.println("Hey I'm Third Parameterized Constructor");
	}

}

//Main class
public class multilevel1 
{
public static void main(String args[])
{
	 new Third();   //Calling Default constructor  or usme parameterized ko call kr denge toh sb call ho jaega 
	
  /*yaha son constructor ko call krenge toh dono Grandparent and parent ka constructor call hoga 
   * kyuki Grandparent class hai tbhi parent class hai and Parent hai tbhi Son hai isliye phle wo dono
   * call honge tbhi son hoga*/
	System.out.println();
    new Second(5);    //no need to create variable kyuki 1 baar hi use krna tha
    }
}
