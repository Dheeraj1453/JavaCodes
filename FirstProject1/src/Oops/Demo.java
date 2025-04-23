package Oops;
class Smartphone  //Class 1
{
	String Brand,color,model,proccessor;
	int imeino;
	double price;
	}
class movie   //Class2
{
	String name,ott,producer,cast;
	float rating;
	int Budget,collection;
}
class Employee    //Class 3
{
	String name,Address,sex,hobby,dob;
	int contact;
}

// main class
public class Demo {
public static void main(String args[])
{
Smartphone ob1= new Smartphone();   //Object1 of class Smartphone	
Smartphone ob2= new Smartphone();   //Object2 of class Smartphone
ob1.Brand="Samsung"; ob1.color="White"; ob1.imeino=5647232;
ob1.model="S23 Ultra"; ob1.proccessor="Snapdragon 8 Gen2";
ob1.price=150000.00;

ob2.Brand="IQOO"; ob2.color="Black"; ob2.imeino=1047472;
ob2.model="Neo 12"; ob2.proccessor="Snapdragon 8 Gen3";
ob2.price=59999.99;
System.out.printf("IMEI No:%d\nBrand:%s\nModel:%s\nColour:%s\nProccesor:%s\nPrice:%.2f\n\n",ob1.imeino,ob1.Brand,ob1.model,ob1.color,ob1.proccessor,ob1.price);
System.out.printf("IMEI No:%d\nBrand:%s\nModel:%s\nColour:%s\nProccesor:%s\nPrice:%.2f\n\n",ob2.imeino,ob2.Brand,ob2.model,ob2.color,ob2.proccessor,ob2.price);

movie obj1= new movie();  //Object1 of class Movie
movie obj2= new movie();  //Object2 of class Movie
obj1.name="Stranger Things"; obj1.ott="NetFlix"; obj1.rating=9.2f;
obj1.cast="Millie Bobby Brown,David Harbour,Finn Wolfhard,Joe Kerry"; 
obj1.producer="Duffer Brothers";
obj1.Budget=270;obj1.collection=8712;

obj2.name="Breaking Bad"; obj2.ott="Hotstar"; obj2.rating=9.6f;
obj2.cast="Bryan Cranston,Aaron Paul,Anna Gaun"; 
obj2.producer="Vince Gilligan";
obj2.Budget=370;obj2.collection=15479;
System.out.printf("Movie Name:%s\nReleased At:%s\nIMDBI Rating:%.1f\nStar Cast:%s\nProducer:%s\nBuget:%dM Dollar\nTotal Collection:%dM Dollar\n\n",obj1.name,obj1.ott,obj1.rating,obj1.cast,obj1.producer,obj1.Budget,obj1.collection);
System.out.printf("Movie Name:%s\nReleased At:%s\nIMDBI Rating:%.1f\nStar Cast:%s\nProducer:%s\nBuget:%dM Dollar\nTotal Collection:%dM Dollar\n\n",obj2.name,obj2.ott,obj2.rating,obj2.cast,obj2.producer,obj2.Budget,obj2.collection);

Employee Ob1=new Employee();   //Object1 of class Employee
Employee Ob2=new Employee();   //Object2 of class Employee
Ob1.name="Sayed Nadeem"; Ob1.dob="15/08/1947";
Ob1.contact=987654321; Ob1.Address="Kali Gali";
Ob1.hobby="Staring Boyz"; Ob1.sex="Research Under Process";

Ob2.name="Aditya Sahay"; Ob2.dob="16/12/1969";
Ob2.contact=987654320; Ob2.Address="Bindekhalpur";
Ob2.hobby="Rubbish Talks"; Ob2.sex="Changing under situation";

System.out.printf("Name:%s\nDate of Birth:%s\nGender:%s\nHobby:%s\nContact No:%d\nAddress:%s\n\n",Ob1.name,Ob1.dob,Ob1.sex,Ob1.hobby,Ob1.contact,Ob1.Address);
System.out.printf("Name:%s\nDate of Birth:%s\nGender:%s\nHobby:%s\nContact No:%d\nAddress:%s",Ob2.name,Ob2.dob,Ob2.sex,Ob2.hobby,Ob2.contact,Ob2.Address);
}
}
