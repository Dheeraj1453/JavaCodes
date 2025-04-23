package ExceptionHandling;

public class nptel {
	static int fun(int x, int y)
	{
		try {
			int a= x/y;
			return a;
		}
		catch (Exception e)
		{
			System.out.println("Cannot Divisible by zero");
		}
		return 0;
	}

	public static void main(String[] args) {
		int a,b,r;
	
		try {
			System.out.println("Enter Value of a=");
			a=Integer.parseInt(args[0]);
			System.out.println("Enter Value of a=");
			b=Integer.parseInt(args[1]);
		r=fun(a,b);
		System.out.println("Result="+r);
	}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
		}
	}

}
