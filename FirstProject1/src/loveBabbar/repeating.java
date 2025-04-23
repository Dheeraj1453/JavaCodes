package loveBabbar;
import java.util.Arrays;
import java.util.Scanner;

public class repeating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an Array: ");
		int n= sc.nextInt();
		int num=0,c=0;
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	       
	     for(int i=0;i<n;i++)
	       {
	        for(int j=i+1;j<n;j++)
	        {
	        	System.out.println(arr[i]);
	            if(arr[i]==arr[j]) {
	            c++;
	            }
	        }
	        if(c==0||i==(n-1)){
	        num+=arr[i];
	        break;
	        }
	       } 
	       System.out.println("Your Array: "+Arrays.toString(arr));
	       System.out.println("Non Repeating number is: "+num);
		
    }
}
