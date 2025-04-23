package loveBabbar;

import java.util.Scanner;

public class paranthesis {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String: ");
		String s= sc.nextLine();
	
		 for(int i=0;i<s.length();i++)
	       {
		
	        char ch=s.charAt(i);
	        if(ch=='(')
	        {
	            if(s.contentEquals("()"))
	            System.out.println("Valid");
	            else
	            	 System.out.println("Invalid");
	        }
	}
        
	}}
