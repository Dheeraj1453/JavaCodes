package Oops;
class All
{
	String Brand,color,model,proccessor;
	int imeino;
	double price;

//Method 1 for class all	
public void SmartPhone(String Brand,String color,String model,String proccessor,int imeino,double price)
{
	this.Brand=Brand; this.color=color; this.imeino=imeino;
	this.model=model; this.proccessor=proccessor;
	this.price=price;
}

	String name,ott,producer,cast;
	float rating;
	int Budget,collection;

	//Method 2 for class all
	public void movie(String name,String ott,String producer,String cast,float rating,int Budget,int collection)
	{
	this.name=name; this.ott=ott; this.rating=rating;
	this.cast=cast;  this.collection=collection;
	this.producer=producer;
	this.Budget=Budget;
	}

	String Name,Address,sex,hobby,dob;
	int contact;

    //Method 3 for class all
	public void Employee(String Name,String Address,String sex,String hobby,String dob,int contact)
	{
		this.Name=Name; this.dob=dob;
		this.contact=contact; this.Address=Address;
		this.hobby=hobby; this.sex=sex;
	}
	
	//Method to Print SmartPhones
	public void getSmartphones()
	{
		System.out.printf("IMEI No:%d\nBrand:%s\nModel:%s\nColour:%s\nProccesor:%s\nPrice:%.2f\n\n",imeino,Brand,model,color,proccessor,price);
	}

	//Method to Print Movies
	public void getMovie()
	{
	System.out.printf("Movie Name:%s\nReleased At:%s\nIMDBI Rating:%.1f\nStar Cast:%s\nProducer:%s\nBuget:%dM Dollar\nTotal Collection:%dM Dollar\n\n",name,ott,rating,cast,producer,Budget,collection);		
	}

    //Method to Print Employee
	public void getEmployee()
	{
     System.out.printf("Name:%s\nDate of Birth:%s\nGender:%s\nHobby:%s\nContact No:%d\nAddress:%s\n\n",Name,dob,sex,hobby,contact,Address);	
	}
}

// main class
public class Demo1 
{
public static void main(String args[])
{
All ob1= new All();   //Object1 of class Smartphone	
All ob2= new All();   //Object2 of class Smartphone
ob1.SmartPhone("Samsung","White","S23 Ultra","SnapDragon Gen 2",5673421,150000);
ob2.SmartPhone("IQOO","Black","Neo12","SnapDragon Gen 3",9113420,59999.99);
ob1.getSmartphones();
ob2.getSmartphones();

All obj1= new All();  //Object1 of class Movie
All obj2= new All();  //Object2 of class Movie
obj1.movie("Stranger Things","NetFlix","Duffer Brothers","Millie Bobby Brown,David Harbour,Finn Wolfhard,Joe Kerry",9.2f,270,8712);
obj2.movie("Breaking Bad","Hotstar","Vince Gilligan","Bryan Cranston,Aaron Paul,Anna Gaun",9.6f,370,15479);
obj1.getMovie();
obj2.getMovie();

All Ob1=new All();   //Object1 of class Employee
All Ob2=new All();   //Object2 of class Employee
Ob1.Employee("Sayed Nadeem","Kali Gali","Research Under Process","Staring Boyz","15/08/1947",987654321);
Ob2.Employee("Aditya Sahay","Bindekhalpur","Changing under situation","Rubbish Talks","16/12/1969",987654320);
Ob1.getEmployee();
Ob2.getEmployee();
}
}

