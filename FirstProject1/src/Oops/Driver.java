package Oops;
// Main class Product ka
public class Driver 
{
	public static void main(String[] args) 
	{
		Product p1=new Product();    //Object1 of Class Product
		Product p2=new Product();    //Object2 of Class Product
		Product p3=new Product();    //Object3 of Class Product
		p1.setDetail(101,"Parle","Biscuit",5,"2024-02-15"); //hmlog method mai value aese hi dalte hai
		p2.setDetail(102,"Parle","Chips",10,"2024-02-20");  
		p3.setDetail(103,"Chings","Maggie",12,"2024-02-16");
		p1.getDetail();   //getDetail wle method ko call kr rhe hai output k liye 
		p2.getDetail();
		p3.getDetail();
	}

}
