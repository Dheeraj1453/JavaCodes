package Arraylist;
import java.util.ArrayList;
import java.util.ListIterator;
public class third 
{
	public static void main(String args[])
	{
		ArrayList <String>names= new <String>ArrayList();
		{
			names.add("james");
			names.add("neena");
			names.add("blake");
			names.add("king");
			names.add("smith");
			
			for(String st:names) //yaha Arraylist mai hmlog String define kr chuke hai toh For mai aab Object likhne ka zrurat nhi
			{
				System.out.println(st);
			}
			 
			//here we create ListIterator obj to use Iterator Functions
			ListIterator<String> itr= names.listIterator();
			System.out.println("\nBy Using hasNext Iterator:-");
			while(itr.hasNext()) //hasNext() is used to print the data in up to bottom
			{
				String n =itr.next();
				System.out.println(n);
			}
			
			System.out.println("\nBy Using hasPrevious Iterator:-");
			while(itr.hasPrevious()) //hasPrevious() is used to print the data in bottom to up
			{
				String n =itr.previous();
				System.out.println(n);
				itr.remove(); //it is used to clear all data in ArrayList
				
			}
			System.out.println("By Using Iterator Remove:-\n"+names);
			
		}}
}