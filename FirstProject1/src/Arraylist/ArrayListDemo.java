package Arraylist;
import java.util.ArrayList;
public class ArrayListDemo 
{
public static void main(String args[])
{
	/*ArrayList ka features hai ki isme hmlogo ko iska size define krne ki zrurat nhi
	 * hmlog kisi bhi type ka data Arraylist mai store kr skte hai
	 * ArrayList ka indexing 1 se start hota hai
	 * Some features are:-
	 * 1)It store data in sequence
	 * 2)It is Mutable
	 * 3)It is Dynamic
	 * 4)preserve Insertion order
	 * 5)Random access
	 * 6)Contain Duplicate objects
	 */
	ArrayList ob= new ArrayList();
	ob.add(101); //add is a feature in arrayList to add data
	ob.add("James");
	ob.add(5000.00);
	ob.add(56);
	ob.add("Sector 12 Noida");
	System.out.println(ob);
	System.out.println(ob.get(4));  //ob.get() sejo data uss index par hoga wo print krke de dega
    ob.add(2,'M');  //agar ob.add mai hmlog aese index ka sth data denge toh wo uss jagah par wo data bich mai add kr dega
    System.out.println(ob);
    ob.remove(2); //this is used to remove data from that index
    System.out.println(ob);
    ob.clear();  //this is used to clear all data in ArrayList
    System.out.println(ob);
}
}
