package loveBabbar;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an Array: ");
		int n= sc.nextInt();
		int[] arr= new int[n];
		int[] qrr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Index from where you want to reverse: ");
		int m= sc.nextInt();
		
		//Before Reverese	
	     System.out.println(" Array Before Reverse is: " + Arrays.toString(arr));
	    
	    //After Reverse
	     int q=1;
	     for(int i=0;i<n;i++)
	     {
	    	 if(i>m)
	    	 {
	    		 qrr[i]=(arr[n-q]);
	    	     q++;
	    	 }
	    	 else
	    		 qrr[i]=(arr[i]);
	     }
	    System.out.println("Array After Reverse: "+Arrays.toString(qrr));
 	}
}
