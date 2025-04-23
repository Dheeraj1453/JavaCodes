package Oopsrelation;
public class Address 
{
String area;
String city;
String state;
String pin;
public Address(String area, String city, String state,String pin) 
{
	super();
	this.area=area;
	this.city=city;
	this.state=state;
	this.pin=pin;
}
@Override
public String toString() {
	return "Address:-\narea:"+ area + "\ncity:" + city + "\nstate:" + state + "\npin:" + pin+"\n";
/*iss method se hmlog ko value kisika bhi mil jaega kisi bhi class mai*/
}
}
