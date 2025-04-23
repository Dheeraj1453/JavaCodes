package Constructor;
public class excesscopyconstructor
{
	public static void main(String args[])
	{
		copyconstructor x1= new copyconstructor(101,"Dheeraj",90000);
		copyconstructor x2= new copyconstructor(x1); //here we can see we copy 1st constructor
		x1.getdata();
		x2.getdata();
		
		/*yes x1 and x2 value same but check krne k liye ki dono alag alag
		 * object hai uske liye hmlog dono ka address check kr lenge*/
	   System.out.println(x1.hashCode()+" "+x2.hashCode());
	}
}

