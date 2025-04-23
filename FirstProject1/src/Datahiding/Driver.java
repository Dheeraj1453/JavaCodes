package Datahiding;
public class Driver 
{
	public static void main(String args[])
	{
		product p1= new product();  //Obj1 of product
		product p2= new product();  //Obj2 of product
		product p3= new product();  //Obj3 of product
		p1.setProduct(101,"Shirt",999);
		p1.name="Pant";      //hmre product class mai string private nhi hai toh isko hmlog yaha bhi easily access krke modify kr skte hai
	    p2.setProduct(105,"Jacket",1999);
	    p3.setProduct(100,"Jeans",2500);
	    p1.getProduct();
	    p2.getProduct();
	    p3.getProduct();
	}

}
