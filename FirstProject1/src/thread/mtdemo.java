package thread;
import java.util.Iterator;
class ThreadClass extends Thread     //to use thread propety we use 'extends Thread'
{
	public void run()    //1st Thread
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello from test method executed by thread "+Thread.currentThread().getName());
			try {Thread.sleep(1000);
			Thread.yield();
			} 
			catch (InterruptedException e) {}
		}
	}
}

public class mtdemo
{
	public static void main(String[] args) 
	{		
		ThreadClass ob =new ThreadClass();
		ob.start();		
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello from main method executed by thread "+Thread.currentThread().getName());
			try {
			Thread.sleep(1000);
			
			}			
			catch (InterruptedException e) {}
		}
	}
}
