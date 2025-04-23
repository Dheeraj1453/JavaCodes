package Arraylist;
import java.util.ArrayList;
public class second 
{
public static void main(String args[])
{
	ArrayList <String>name= new <String>ArrayList(); //kahi koi integer value na add kre iske liye hmlog arraylist ko hi string type define kr denge
	{
		name.add("james");
		name.add("neena");
		name.add("blake");
		name.add("king");
		
		for(Object i: name)  //yaha phle object i bnaenge jo kisi bhi datatype ko store krega
		{
			System.out.println(i.toString().toUpperCase());
		}
		System.out.println(name);
		
		/*Agar hmlog upper Arraylist ka datatype define kr denge toh For mai String ka bhi obj bnaenge toh chlega
		 * for(String i: name)
		 * {
		 * System.out.println(i.toString().toUpperCase());
		 * }    ye bhi tb run krega.
		 */
	}
}
}
