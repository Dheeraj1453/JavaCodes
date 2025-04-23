package thread;
import java.util.Random;
/*Synchronized jo hai wo sequence nhi dekhta.
 *synchronized mai hmlog inter thread communication kr skte hai through notify() 
 */

class EvenNumberApplication
{
	int data;
	boolean state=false;
	int counter=0;
	
	synchronized void producer() 
	{
		while(counter<5)
		{
			if(state==true)
			{
				try{
					this.wait();
				}
				catch(Exception e){}
			}
			try {
				Thread.sleep(1000);
			} 
			catch (Exception e) {}
			data=new Random().nextInt(100);
			state=true;
			this.notify();
		}
		
	}
	
	synchronized void consumer() 
	{
		while(counter<5)
		{
			if(state==false)
			{
				try{
					this.wait();
					}
				catch(Exception e){}
			}
			if(data%2==0)
			{
				System.out.println("genetated number is "+data+" and is even");
				counter++;
			}
			else{
				System.out.println("genetated number is "+data+" and is odd");
			}
			state=false;
			this.notify();
		}
		
	}
}

class ITCThread extends Thread
{
	EvenNumberApplication ob;
	String name;
	public ITCThread(EvenNumberApplication ob,String name)
	{
		this.ob=ob;
		this.name=name;
	}
	public void run()
	{
		if(name.equals("producer"))
		{
			ob.producer();
		}
		else if(name.equals("consumer"))
		{
			ob.consumer();
		}
	}
}

//Main Class
public class Threadcomm 
{
	public static void main(String[] args) 
	{
		EvenNumberApplication ob =new EvenNumberApplication();
		ITCThread producer=new ITCThread(ob, "producer");
		ITCThread consumer=new ITCThread(ob, "consumer");
		producer.start();
		consumer.start();

	}

}
