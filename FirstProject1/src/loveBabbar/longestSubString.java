package loveBabbar;
import java.util.*;
public class longestSubString {

	public static void main(String[] args) {
    int count=0;
    String a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any String: ");
	String s= sc.next();
	for(int i=0;i<s.length();i++)
	{
	 System.out.println(s.substring(i, i+1));
	}

	}
}
