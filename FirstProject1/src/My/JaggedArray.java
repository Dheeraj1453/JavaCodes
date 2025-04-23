package My;
import java.util.Scanner;
public class JaggedArray {
public static void main(String args[]) {
	int i,j;
	int arr[][]= new int[3][]; // isme no. of column different hai har row mai toh uska size hmlog nhi lenge
	arr[0]=new int[] {23,15,98,44,52,12};
	arr[1]=new int[] {20,11};
	arr[2]=new int[] {66,05,03,22};
	for(i=0;i<arr.length;i++)
	{
		for(j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	//aab user hi btaega ki kis row mai kitna column hoga
	Scanner sc= new Scanner(System.in);
	int br[][]= new int[3][];
	for(i=0;i<br.length;i++)
	{
		System.out.println("Enter Student in "+((char)+(i+65))+" section get above 75%:");
		int p=sc.nextInt();
		br[i]=new int[p];
		System.out.println("There Roll no:");
		for(j=0;j<br[i].length;j++)
		{
			br[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<br.length;i++)
	{
		System.out.print("Section "+((char)+(i+65))+": ");
		for(j=0;j<br[i].length;j++)
		{
			System.out.print(br[i][j]+" ");
		}
		System.out.println();
	}
}

}
