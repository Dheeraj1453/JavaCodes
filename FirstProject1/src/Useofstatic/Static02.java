package Useofstatic;
import java.util.Scanner;
class product 
{ 
	int pid;
	static String brand;    //static variable that is common for all
    String name;
    /*Agar hmlog bhul na jae call krna or Brand compulsulor ho toh uss code ko static k
     *andar likhenge kyuki static ko call krne ka zrurat nhi*/

    static   /*Agar static same class mai likhenge toh 'main' se phle static chlega 
             *agar static or main dono alag class mai hai toh phle 'main' chelga*/
  {
	System.out.println("Enter Your Brand Name:");
	Scanner sc =new Scanner(System.in);
	product.setBrand(sc.nextLine());
//Static 1 program mai 1 hi bnega
  }
    static void setBrand(String brand)  //static method
    {
    	product.brand=brand;    //static variable ko uske class se btaenge jaise this. ko krte hai
    }
    static void printname()   //static method
    {
    	System.out.println("You have selected "+brand+" brand");
    }
}
public class Static02
{
	public static void main(String args[])
	{
		
		product.printname();
}}
