package loveBabbar;
import java.util.*;

public class rotatarySearch 
{
	
static int getPivot(int arr[]) {

	    int s = 0;
	    int e = arr.length-1;
	    int mid = s + (e-s)/2;

	    while(s<e) {

	        if(arr[mid] >= arr[0])
	        {
	            s = mid+1;
	        }
	        else{
	            e = mid;
	        }
	        mid = s + (e-s)/2;
	    }
	    return s;
	}

static int binarySearch(int[] arr, int s, int e, int key) {

	    int start = s;
	    int end = e;

	    int mid = start + (end-start)/2;

	    while(start <= end) {

	        if(arr[mid] == key) {
	            return mid;
	        }

	        //go to right wala part
	        if(key > arr[mid]) {
	            start = mid + 1;
	        }
	        else{ //key < arr[mid]
	            end = mid - 1;
	        }
	        mid = start + (end-start)/2;
	    }    
	    return -1;
	}
	
//main
public static void main(String args[])
{
	int rotArr[]= {25,38,45,8,10,15};
	System.out.print("Enter the key you want to search= ");
	Scanner sc= new Scanner(System.in);
	int k=sc.nextInt();
	int n= rotArr.length;
	int piv= getPivot(rotArr);
	if(k<rotArr[0])
	{
		System.out.println("Your number is at index= "+binarySearch(rotArr,piv,n-1,k));
	}
	else 
		System.out.println("Your number is at index= "+binarySearch(rotArr,0,piv-1,k));
}
}
