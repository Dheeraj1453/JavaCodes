package thread;
/*thread.join() dekhta hai ki data 1)synchronized ho and 2)sequence mai chale.
 * ye jiske body mai likha hoga usko wo waiting state mai dal dega or dusra thread
 * ko chance dega. Agar uske andar time limit hai toh uske liye utna der wait krega 
 * agar utne der mai dusra thread execute kr jaega toh thk nhi toh waps ye thread chlega
 */
class ThredJoin extends Thread
{
	public void run()
	{
		try {
		Threadjoin.th.join(2000);  //2sec k liye wait krega main ko chlne dene k liye
		}
		catch(Exception e) {}
		
		for(int i=0;i<5;i++)
		{
		System.out.println("hello from child thread");
		try 
		{
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		}
	}
}

//Main class
public class Threadjoin {
     public static Thread th=Thread.currentThread();
	public static void main(String[] args) {
		
		ThredJoin th =new ThredJoin();
		th.start();
	    try {
	    	 th.join(2000);  //2 sec k liye wait krega child ko chlne dene k liye 
	    	 /*suppose yaha th.join() or koi time limit nhi hota toh main thread tbtk
	    	  * wait krta jbtk sara child thread run nhi ho jata.
	    	  */
		} catch (Exception e) {}
		for(int i=0;i<5;i++)
		{
		System.out.println("hello from main thread");
		try {
			Thread.sleep(1000);
			}
		catch(Exception e) {}
		}
	}
}

