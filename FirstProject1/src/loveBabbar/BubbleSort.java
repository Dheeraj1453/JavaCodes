package loveBabbar;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
public static void sort(int[] arr) {
	int n=arr.length;	
	for(int i = 1; i<n; i++) {
	        //for round 1 to n-1
	        Boolean swapped = false;
	        
	        for(int j =0; j<n-i; j++) {
	            
	            //process element till n-i th index
	            if(arr[j] > arr[j+1]) {
	                int temp= arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	                swapped = true;
	            }
	            
	        }
	        
	        if(swapped == false) {
	            //already sorted
	            break;
	        }
    }}

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
