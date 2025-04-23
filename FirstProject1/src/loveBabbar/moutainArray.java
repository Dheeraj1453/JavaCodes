package loveBabbar;

//main class
public class moutainArray {
	public static void main(String args[])
	{
		int mountArr[]= {0,8,8,9,21,26,88,90,44,44,44,26,20,15,5};
		int index = find_pivot(mountArr,15);
		System.out.println("Peak of the mountain at index= "+index);
}

	private static int find_pivot(int[] arr, int i) {
		int s = 0, e = i-1;
		int mid=s+(e-s)/2;
		while (s < e)
		{
			if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1])
	    			return mid;
			else
			if(arr[mid] < arr[mid+1])
     			s=mid+1;
    		else
      			e = mid;
	   
			mid = s+(e-s)/2;
		}
		return s;
	}
}