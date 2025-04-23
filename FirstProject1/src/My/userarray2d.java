package My;
import java.util.Scanner;
public class userarray2d {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int i,j;
		int a[][]= new int[3][3];
		System.out.println("Insert value in 2D Array:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}}
		for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
		}
		// now 2d array in which user give th dimension of user
		int p,q;
		System.out.println("Enter the number of row of ur Array:");
		p=sc.nextInt();
		System.out.println("Enter the number of column of ur Array:");
		q=sc.nextInt();
		int b[][]= new int[p][q];
		System.out.println("Insert value in 2D Array:");
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				b[i][j]=sc.nextInt();
			}}
		for(i=0;i<p;i++)
			{
				for(j=0;j<q;j++)
				{
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
		}
	}

}
