package Oops;
class Product 
{
int pid;
String brand;
String name;
float price;
String expiry;
//Method1 for class Product to fetch data
public void setDetail(int pid,String brand,String name,float price,String expiry)
{
	this.pid=pid;   //this method k bahar wle ko indicate kr rha hai
	this.brand=brand;  //agar variable ka naam same ho tb this ka use krenge
	this.name=name;   //jis obj ko use krenge uss time wo bn jaega(Ex:-p1.name bna jaega jb p1 ko call krenge)
	this.price=price;
	this.expiry=expiry;
}
//Method2 for class Product to Print data
public void getDetail()
{
	System.out.printf("Product ID:%d\nName of Product:%s\nBrand:%s\nPrice:%.1f\nExpiry Date:%s\n\n",pid,brand,name,price,expiry);
}
}
