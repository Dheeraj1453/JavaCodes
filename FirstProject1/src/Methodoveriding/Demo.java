package Methodoveriding;
/*Agar hmlog kisi class k method ko dusre mai use krenge ya change krenge toh
 * wo Method overriding bolonge*/ 

class father
{
	String name="Father";
	void wakeup()  //method1
	{
		System.out.println("6 am in the morning");
	}
	void returnhome()  //method2
	{
		System.out.println("7pm in the Evening");
	}
}
class elderson extends father
{
	String name="Elderson";
	@Override   //ye likhne se agar overriding mehod mai error hoga toh bta dega
	
	void wakeup()  //method overidding
	{
		System.out.println("9 am in the morning");
	}
	void returnhome()  //method overidding
	{
		System.out.println("11pm in the Night");
	}}

	class youngson extends father
	{
		@Override
		void wakeup()  //method overidding wakeup only
		{
			System.out.println("6 am in the morning");
		}
		void playing()  //youngson method 
		{
			System.out.println("4pm in the Evening");
		}			
	}
	
	//Main Class
public class Demo 
{
public static void main(String args[])
{
    System.out.println("Father Methods");
	father f= new father(); //father se 2 ko call krna hai tbhi iska variable bna lenge
    f.wakeup();
    f.returnhome();
    
    System.out.println("\nElderson Methods");
	elderson e= new elderson(); //elderson se 2 ko call krna hai tbhi iska variable bna lenge
    e.wakeup();
    e.returnhome();

    System.out.println("\nYoungerson Methods");
    youngson y= new youngson();   //Youngerson se 2 ko call krna hai tbhi iska variable bna lenge
    y.wakeup();
    y.returnhome();
    y.playing();  //ye sirf youngerson ka method hai isko koi or call nhi kr skta
    new youngson().playing(); //aese bhi call kr skte hai
    
   /*hmlog refernce se bhi method ko call kr skte hai jisko hmlog 'Dynamic Binding'
    * ya 'Run-time-polymorphism' bolteh hai*/

   father ob = new elderson();  //ye hmlog father ka reference lekr elderson k method ko call kr rhe h(Dynamic Binding or Run-time-polymorphism)
   ob.wakeup();  //latest method jo change hua wahi call hoga(elderson ka method hoga)
   ob.returnhome();  //elderson ka method hoga call
   System.out.println(ob.name);  //reference lene par sirf latest method call hota variable sb father k hi honge elderson k nhi

/*agar father ka method default hai or hmlog usko override
 * krenge toh wo elderson ka method ya toh default hi hoga ya 
 * usse least:-
 * private>default>protected>public 
 */
}
}
