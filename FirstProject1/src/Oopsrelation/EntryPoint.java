package Oopsrelation;
public class EntryPoint
{
public static void main(String args[])
{
	Address ob= new Address("Sector 18","Noida","Delhi","2110101");
	System.out.println(ob); /*ye hmlog ko address dega but hmlog ko Ob value chahiye
	                        *isliye tostring() address mai bnaenge toh value dega*/

	Address ob1= new Address("Mithapur","Patna","Bihar","800001");
   
	//Employee class Obj
	Employee e= new Employee(101,"Dheeraj",1500000f,ob1); //yaha address ka sb field bnane se acha direct obj ko hi rakh denge jaise isme ob1
   System.out.println(e);
   
   //Student class Obj
   Address ob2= new Address("Andheri Gali","Bindekhalpur","Haseena Nagar","907851");
    Student s= new Student(69,"Aditwa",65,ob2);
   System.out.println(s);

 /*Address ka data bina object bnae direct bhi kr skte hai hmlog*/
   Employee e1= new Employee(102,"Siddhi",1500f,new Address("Sector-12","Noida","Delhi","154785"));
   System.out.println(e1);
   Student s1= new Student(420,"Nadeem",1,new Address("Gehri Ghati","Pta Nhi","Gumnampur","745896"));
   System.out.println(s1);
}
}
