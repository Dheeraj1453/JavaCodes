package Useofstatic;
public class static2 
{
int nonstat;
static int stat=1;  //static variable sbke liye common
public static2()
{
	nonstat=1;
}
public void inc()
{
	nonstat++;
	stat++;
}
public void dec()
{
	nonstat--;
	stat--;
}
public void print()
{
	System.out.println("Stat="+stat+" Non stat="+nonstat);
}
public static void main(String args[])
{
	//ye code khudse dekhkr Output btane wla hai
	static2 ob1= new static2();
	static2 ob2= new static2();
	ob1.inc();
	ob2.inc();
	ob1.print();
    ob2.print();

    //iske aage bhi khudse output btana hai 
    ob1.dec();
    ob1.dec();
    ob2.inc();
    ob1.print();
    ob2.print();
}
}
