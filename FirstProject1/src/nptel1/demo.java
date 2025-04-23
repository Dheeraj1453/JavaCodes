package nptel1;

public class demo 
{
	 public static void main(String args[])
	 {
		//Use appropriate Try…catch block to complete the code
		 try{
		   java.util.Scanner r = new java.util.Scanner(System.in);
		   int x = r.nextInt();
		   System.out.print(x*x);
		 }

		 //Catch block to handle Exception
		 catch (Exception e)
		 {
		 System.out.print("Please enter valid data");
		 }
		 
}}
