package thread;
public class Threadsleep 
{
	public static void main(String[] args)throws  InterruptedException {
		for(int i=0;i<5;i++)
		{
			System.out.println("This is slide number "+(i+1));
			Thread.sleep(3000);  //sleep method use to sleep the thread 
		}
	}

}
