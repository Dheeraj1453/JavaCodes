package Useofstatic;
import java.util.Scanner;
class company 
{ 
	int pid;
	static String brand;    //static variable that is common for all
    String name;    

    static void setBrand(String brand)  //static method
    {
    	company.brand=brand;    //static variable ko uske class se btaenge jaise this. ko krte hai
    }
    static void printname()   //static method
    {
    	System.out.println("You have selected "+brand+" brand");
    }
}
public class StaticDemo
{
	public static void main(String args[])
	{
		System.out.println("Enter Your Brand Name:");
		Scanner sc =new Scanner(System.in);
		company.setBrand(sc.nextLine());   //static method ko call uske class se krenge and argument mai jo value wo store krega
		company.printname();
	
	/*Agar hmlog yaha setBrand ko call krna bhul jae lkin brand name compulsory ho
	 * toh isko hmlog static k andar hi likhenge Ex:- static02 mai likhe hai
	 */
	}
}
