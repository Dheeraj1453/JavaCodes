package Oopsrelation;
public class Product 
{
int prod_id;
String name;
float price;
String brand;
String warranty;
public Product(int prod_id, String name, float price, String brand, String warranty) {
	super();
	this.prod_id = prod_id;
	this.name = name;
	this.price = price;
	this.brand = brand;
	this.warranty = warranty;
}
@Override
public String toString() 
{
	return "\nProduct_id:" + prod_id + "\nName of Product:" + name + "\nBrand:" + brand +"\nnPrice:" + price + "\nWarranty:"
			+ warranty;
}

}
