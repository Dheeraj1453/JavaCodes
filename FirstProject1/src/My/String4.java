package My;
import java.util.Scanner;
public class String4{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	/*StringBuffer mutable string hota hai jisme string ko change
	 * krne par uska new object nhi bnta wahi obj change hota hai
	 */
	StringBuffer st=new StringBuffer("Welcome");
	st.append(" To"); //append use krte hai string mai modify krne k liye
	st.append(" The");
	st.append(" World");
	st.append(" Of");
	st.append(" Java");
	System.out.println(st);
	
	//Check krenge ki StringBuffer use krne par new obj nhi bnta hai
	StringBuffer st1=new StringBuffer("Hello");
	StringBuffer st2=st1;
	System.out.println(st1+" "+st2);
	st2.append(" World");   //Yaha agar ye Immutable hota toh new Obj bn jana chahiye tha but isme wahi string modify hota hai 
	System.out.println(st1+" "+st2);
	
	//aab StringBuffer ka user input kaise lenge
	System.out.println("Enter Your Name: ");
	StringBuffer sb=new StringBuffer(sc.nextLine());
	System.out.println("Hello Mr."+sb);

    /*StringBuilder bhi hmara immutable hota hai but wo safe nhi jitna secure
     *StringBuilder hota hai. Baki sbkuch stringbuilder lene time wahi krenge
     *jo StringBuffer mai kiye hai*/ 
}
}
