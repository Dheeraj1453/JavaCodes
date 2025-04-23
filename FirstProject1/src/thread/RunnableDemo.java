package thread;
class ThreadClass2 implements Runnable   //if we have to use thread interface then we use 'Implement Runnable'
{                                       //agar hmlog ko 2 thread ka property use krna hota toh usko hmlog inherit nhi kr 
	                                    //Skte the aese case mai interface 'Runnable' ka use krenge.
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello from test method executed by thread "+Thread.currentThread().getName());
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
		}
	}
}

//Main Class
public class RunnableDemo 
{
	public static void main(String[] args) 
	{
		ThreadClass2 ob =new ThreadClass2();
		Thread t=new Thread(ob);
		t.start();		
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello from main method executed by thread "+Thread.currentThread().getName());
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
		}

	}

}
