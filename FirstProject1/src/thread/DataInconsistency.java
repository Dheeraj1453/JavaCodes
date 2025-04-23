package thread;
class Dummy 
{	
	 public void greetMessage(String name)
	{
		 synchronized (this)  //jo bhi data use kr rhe hai wo synchronized rhe yani jb hmlog 1 data ko 1 thread mai use kr rhe hai toh dusra thrad usko use nhi kre
		 {
			 for(int i=0;i<3;i++)
			 {
				 System.out.print("Hello from ");
				 try {
					 Thread.sleep(1000);
					 }
				 catch(Exception e){}
				 System.out.println(name);
			
			 }
		 }
	}
}

class TestingThread extends Thread
{
	String name;
	Dummy ob;
	TestingThread(String name,Dummy ob)
	{
		this.name=name;
		this.ob=ob;
	}
	
	public void run()
	{
		ob.greetMessage(name);   //calling dummy class method
	}
}

//Main Class
public class DataInconsistency 
{
	public static void main(String[] args) 
	{
		//Iska koi fix output nhi aaega
		Dummy dob =new Dummy();
		TestingThread ob1 =new TestingThread("James",dob);
		ob1.start();
		
		TestingThread ob2 =new TestingThread("King", dob);
		ob2.start();
		
		TestingThread ob3 =new TestingThread("neena", dob);
		ob3.start();
	
		TestingThread ob4 =new TestingThread("Harleen",dob);
		ob4.start();
		
	}

}
