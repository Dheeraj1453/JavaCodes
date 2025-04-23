package Oopsrelation;
public class Flipkart 
{
public static void main (String args[])
{
	Address ob= new Address("Sector 18","Noida","UP","2110501"); //customer add

	//Product details
	Product ob1= new Product(521,"Laptop",50000,"Asus","2 Years");
	Customer c = new Customer(1293,"Dheeraj",987654321l,ob,ob1);
	System.out.println(c);
	Vendor v =new Vendor(509,"Aryan Electronic",987654321l,ob1);
	System.out.println(v);
	System.out.println();

	//We can also add address w/o creating object
	Customer c1 = new Customer(65,"Aditwa",987654321l,new Address("Andheri Gali","Bindekhalpur","Haseena Nagar","907851"),new Product(21,"Lehnga",10000,"Manyawar","1 year"));
	Vendor v1 =new Vendor(213,"Nadeem Lehngawala",987654321l,new Product(21,"Lehnga",10000,"Manyawar","1 year"));
    System.out.println(c1);
    System.out.println(v1);
}
}
