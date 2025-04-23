package My;

public class Pattern {
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print("*"); //sirf print likhne par 1 hi line mai print krega ln likhne par line change kr dega
			}
			System.out.println();
		}
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((char)(j+64)); //ASCII code use krne aese print hoga
			}
			System.out.println();
		}
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((char)(i+96)); // A to Z= 65-90 ; a to z= 97-122
			}
			System.out.println();
		}
	}

}
