package classes;
//import java.util.Scanner;
public class Annonymous 
{
public static void main(String args[])
{
	System.out.println("Enter any number:");
   //Scanner sc = new Scanner (System.in);
   /*Agar hmlog ko 1 hi variable k liye data input chahiye toh hmlog import and scanner ye sb alag
    * alag nhi bnaenge usse mai bna lenge jaise hmlog ko 1 hi obj k liye chahiye hota tha toh uska 
    *variable nhi bnate the waise hi isko hmlog anonymous obj creation bolenge
   */
   int i = new java.util.Scanner(System.in).nextInt();
   System.out.println("Your number:"+i);
}
}
