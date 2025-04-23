package Intrface;
/*Interface hmlog ko Multiple Inheritance ka features deta
 * hai java mai. Normal hmlog multiple inherit nhi kr skte inheritance mai.
 * but interface k through hmlog multiple inherit kr skte hai
 */
interface Grandparent
{
	int gpvar=100;  //agar hmlog interface variable mai koi bhi modifier nhi use krenge toh wo default public static final hoga 
}

interface parent1 extends Grandparent //agar interface ko or aage interface bnana hai toh extends krenge usko
{
	public static final int p1=100;
	void display();
}

interface parent2 extends Grandparent //agar interface ko or aage interface bnana hai toh extends krenge usko
{
	int p2=100;  //Agar interface mai hmlog koi bhi keyword nhi likhenge toh wo by default 'public static final' hota hai
	void output();
}

class grandchild implements parent1,parent2  //aese hmlog 2 class ko 1 mai implement krenge using interface
{

	@Override
	public void output() {
		System.out.println("Hey! I'm Parent 1");
	}

	@Override
	public void display() {
		System.out.println("Hey! I'm Parent 2");
			
	}
	
}
//Main class
public class multiple
{
public static void main(String args[])
{
	grandchild gc= new grandchild();
	/*Yaha grandchild tino ka properties(parent1,parent2,grandparent) sbka property
	 * inherit kr skta hai using interface
	 */
	System.out.println(gc.p1);
	System.out.println(gc.p2);
	System.out.println(gc.gpvar);
	gc.display();
	gc.output();
	  
	//by refernce
	Grandparent gp=new grandchild();
	System.out.println(gp.gpvar);  /*hmlog ussi chiz ko call kr skte hai jo uske class mai declare hua ho
	                               *uske alawa kuch nhi jaise yaha hmlog 'gvar' ko hi sirf kr skte hai*/
	parent1 p1=new grandchild();
	System.out.println(p1.gpvar);
	System.out.println(p1.p1); 
	p1.display();
}
}
