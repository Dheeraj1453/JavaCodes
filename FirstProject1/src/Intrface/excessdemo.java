package Intrface;

public class excessdemo 
{
public static void main(String args[])
{
	saving s = new saving();  //creating obj of saving class
	s.displaydeposite();
	s.displaywithdrawal();
	System.out.println("Interest of Saving Account:"+s.compute(100000, 4));
    System.out.println();
    
    Current c = new Current();
    c.displaydeposite();
    c.displaywithdrawal();
    System.out.println("Interest of Current Account:"+c.compute(250000,2));
    System.out.println();
    
    //making obj using reference of demo
    demo d= new saving();  //saving ka obj(method dikhega) reference demo ka liye hai
    System.out.println("Using Reference for Saving:");
    d.displaydeposite();
    d.displaywithdrawal();
    System.out.println();

    d=new Current();  //aesa sirf reference mai kr skte hai dusre obj creation mai nhi
    System.out.println("Using Reference for Current:");
    d.displaydeposite();
    d.displaywithdrawal();
}
}
