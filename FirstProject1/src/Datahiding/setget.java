package Datahiding;
/*aab hmlog jb 1 hi value dalna ho toh uss case mai hmlog ko sbke liye
 * alag alag set and get bnana hoga 
 */
class setget 
{
	private int pid;
	private String name;
	private int price;
	public void setpid(int pid)
	{
	this.pid=pid;
	}
	public void setname(String name)
	{
	this.name=name;
	}
	public void setprice(int price)
	{
	this.price=price;
	}
	public int getpid()
	{
		return pid;
	}
	public String getname()
	{
		return name;
	}
	public int getprice()
	{
		return price;
	}
	
	
}
