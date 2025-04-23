package thread;
class ThredPrior extends Thread
{
	public void run()
	{		
		for(int i=0;i<5;i++)
		{
		System.out.println("hello from child thread");
		try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

//Main Class
/*Aab k windows mai contex switch itna fast hota hai ki hmlog priority pta nhi clega
 * but we have to know ki 1)High Priority:-5   2)Low Priority:-1
 */
public class ThreadPriority 
{
	public static void main(String[] args) {
		Thread.currentThread().setPriority(1);   
		ThredPrior th =new ThredPrior();
		th.setPriority(5);
		th.start();
		System.out.println("Priority of parent thread="+Thread.currentThread().getPriority());
		System.out.println("Priority of child thread="+th.getPriority());
	    try {
	    	 th.join(2000);    
		} catch (Exception e) {}
		for(int i=0;i<5;i++)
		{
		System.out.println("hello from main thread");
		try {Thread.sleep(1000);}catch(Exception e) {}
		}
	

	}

}
