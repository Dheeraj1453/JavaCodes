package Oopsrelation;
public class Customer 
{
   int cust_id; 
   String name; 
   long contact;
   Address add; //Aggregrating Address class 
   Product p;   //Aggregrating Product class
public Customer(int cust_id, String name, long contact, Address add, Product p) {
	super();
	this.cust_id = cust_id;
	this.name = name;
	this.contact = contact;
	this.add = add;
	this.p = p;
}
@Override
public String toString() 
{
	return "Customer_Id:" + cust_id + "\nName:" + name + "\nContact No:" + contact + "\n" + add.toString() +"\nProduct that Purchased:-" + p.toString();
			
}
}
