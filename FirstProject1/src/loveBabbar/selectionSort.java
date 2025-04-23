package loveBabbar;
import java.util.*;

public class selectionSort 
{
	static void sort(int a[])
	    {
	        int n = a.length;
	        // One by one move boundary of unsorted subarray
	        for (int i = 0; i < n - 1; i++) 
	        {
	            int min_idx = i;
	          
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[j] < a[min_idx])
	                    min_idx = j;
	            }
                //Swapping
	            int temp = a[min_idx];
	            a[min_idx] = a[i];
	            a[i] = temp;
	        }
	    }

//main
    public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        // Take SIZE of 1D Array from the USER
	        System.out.print(" Enter SIZE of 1D Array: ");
	        int n = sc.nextInt();
	        // Creating Array of Required SIZE
	        int [] arr = new int[n];
	        // Fill the Array by taking inputs from the USER
	        System.out.print(" Enter " + n + " Elements: ");
	        for(int i=0; i<arr.length; i++)
	            arr[i] = sc.nextInt();
	        // Display the Input Array Before Sorting
	        System.out.println(" Array Before Sorting is: " + Arrays.toString(arr));
	        // Apply Selection Sort
	        sort(arr);
	        // Display resultant Array (i.e Sorted Array) After Sorting
	        System.out.println(" Array After Sorting is: " + Arrays.toString(arr));
	    }
	}

