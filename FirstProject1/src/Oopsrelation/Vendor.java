package Oopsrelation;
public class Vendor 
{
	 int ven_id; 
	   String name; 
	   long contact;
	   Product p; //Aggregrating Product class
	public Vendor(int ven_id, String name, long contact, Product p) {
		super();
		this.ven_id = ven_id;
		this.name = name;
		this.contact = contact;
		this.p = p;
	}
	@Override
	public String toString() 
	{
		return "\nProduct purchase From:-\nVendor_id=" + ven_id + "\nShop Name:" + name + "\nContact No:" + contact +"\nProduct that Sell:-" + p.toString();
	}
	   
}
