package classes;
class emp
{
	int eid;
	String name;
    department dept; 
	class department 
	{
	  int did;
	  String dname;
	  String location;
	  
  public void get()
  {
	System.out.println(did+" "+dname+" "+location);  
  }
  public void set(int did,String dname,String location)
  {
	  this.did=did;
	  this.dname=dname;
	  this.location=location;
  }
}
	public department setdata(int eid,String name,department object)
	  {
		  this.eid=eid;
		  this.name=name;
		  this.dept=object;
		  return dept;
}
	public void getdata()
	{
		System.out.println(name+" "+eid+" "+dept);
	}}
	
//Main class
public class testinner 
{
public static void main(String args[])
{
	emp ob1= new emp();
	emp.department ob = new emp().new department(); //inner class k depaertment k constructor ko call krenge isse
    ob1.setdata(501,"Aditwa",ob.set(101,"Dheeraj","Delhi"));
    System.out.println(ob1.eid);
    System.out.println(ob1.dept);
    System.out.println(ob1.name);
    ob.get();
    
}
}