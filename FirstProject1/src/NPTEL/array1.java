package NPTEL;
import java.util.*;
public class array1 {
	public static void main(String[] args) {
		int ans=0;
		int arr[]= {8,7,2,5,4,1,3,8,9};
		for(int i=1;i<9;i++)
		{
			ans=ans^i;
		}
		for(int i=0;i<9;i++)
		{
			ans=ans^arr[i];
		}
		System.out.println(ans);
	}

}
