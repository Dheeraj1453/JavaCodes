package My;
import java.util.Scanner;
public class Login {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	String user,pass;
	String us="Dheeraj1453";
	String pas="dheeraj123";
	System.out.print("Enter Username: ");
	user=sc.next();
	System.out.print("Enter Password: ");
	pass=sc.next();
	if(user.equals(us)&&pass.equals(pas))
	{
		System.out.println("Welcome Dheeraj");
	}
	else
	{
		System.out.println("Login Failed Who are you?");
	}
	// 2nd Login code
	String id,key;
	String my="Dheeraj1453";
	String p="dheeraj123";
	System.out.print("Enter FaceBook Username: ");
	id=sc.next();
	System.out.print("Enter FaceBook Password: ");
	key=sc.next();
	if(id.equalsIgnoreCase(my)&&key.equals(p)) /*equalsIgnoreCase ignore the capital small 
		                                         * letter as username name is not case sensitive*/
	{
		System.out.println("Your FacebookID Mr.Dheeraj successfully login");
	}
	else
	{
		System.out.println("Login Failed Who are you?");
	}
	//3rd code
	String u,pss;
	String ID="Dheeraj1453";
	String Pas="dheeraj123";
	System.out.print("Enter Instagram Username: ");
	u=sc.next();
	if(u.equalsIgnoreCase(ID)) //aab agar username sahi hoga tbhi Password puchega nhi toh direct invalid username bolega
	{
		System.out.print("Enter Instagra Password: ");
		pss=sc.next();
		if(pss.equals(Pas))
	{
		System.out.println("Dheeraj Instagram Profile");
	}
		else {
			System.out.println("Invalid Instagram Password");
		}}
	else
	{
		System.out.println("Invalid Username");
	}
	}
}
