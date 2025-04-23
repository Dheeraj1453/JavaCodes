package ExceptionHandling;
class BelowAgeException extends RuntimeException  //defining user Exception
{
	String msg;
	public BelowAgeException(String msg) {
			this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}
}


class AboveAgeException extends RuntimeException  //defining user Exception
{
	
	String msg;
	public AboveAgeException(String msg) 
	{
			this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}
	
}

//Main class
public class Userdefined 
{
		public static void hire(int age)
	{
		try {
		if(age<18) {
			throw new BelowAgeException("u are below age");
		}
		else if (age>50)
		{
			throw new AboveAgeException("u are above age");
		}
		else
		{
			System.out.println("please submit your cv");
		}}
		catch(BelowAgeException ob)  //user define exception
		{
			System.out.println(ob);
		}
		catch(AboveAgeException ob)   //user define exception
		{
			System.out.println(ob);
		}
	}	

//Main Method
	public static void main(String[] args) 
	{
		System.out.println("Enter your Age:");
		hire(new java.util.Scanner(System.in).nextInt());


	}

}
