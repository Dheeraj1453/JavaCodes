package thread;
class demo extends Thread
{
	public void run()  //1st thread
	{
		System.out.println("Running");
	}
public static void main(String args[])
{
Thread d = new demo();  //2nd thread
d.start();

System.out.println(Thread.activeCount());
}
}
