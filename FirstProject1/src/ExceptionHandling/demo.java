package ExceptionHandling;
import java.util.Scanner;
//call stack ki jo stack mai upper hoga wo clega uske baad uske niche wla

public class demo
{
	static Scanner sc = new Scanner(System.in);
public static void test2()  //static method
{
	System.out.println("Inside Test 2");
	System.out.println("Enter 1st number");
	int i=sc.nextInt();
	System.out.println("Enter 2nd number");
	int j=sc.nextInt();
	System.out.println("Division:"+(i/j));  //aab agar yaha j=0 ho jata hai toh uss case mai yaha exception ho jaega kyuki kyuki hmare pass itna storage
	                                   //hi nhi jo infinite value ko store kr ske isliye jaha exception aya uske baad wla koi statement execute hi nhi krga
	                                 //or output mai btaega ki kon kon line nhi chla exception k baad kyuki wo jaha jaha se call hua waha waha jaakr exception handling
	                               //k liye dhundega or stack se pop krta rhega and at last terminate kr jaega.
	System.out.println("End of Test 2");
}

public static void test1()  //static method
{
	System.out.println("Inside Test 1");
	test2();
	System.out.println("End of Test 1");
}

public static void main(String args[])
{
	System.out.println("Inside Main");
	test1();
	System.out.println("End of Main");
}
/*aab jaisa hi program run hoga toh main stack k andar jaega and 1sr msg print hoga uske baad next line mai test1() call hua yani
 * aab stack mai test1 aa jaega aab test1 ka 1st msg print hoga uske next mai test2() call hogya hai yani aab stack mai test2 aa jaega
 * toh aab test2 k dono msg print honge uske baad test2 pop hojaega toh fir test1 fir main uske baad program terminate
 */
}
