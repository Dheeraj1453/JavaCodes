package My;
public class array2d {
	public static void main(String args[]) {
		int arr[][]=new int[3][3]; //initializing 2d array
		int a[]= {10,20,30};
		arr[0]= a;  // hmlog 1 new array a bnakr usme value dalkr usko 2d array mai initialize bhi kr skte hai aese  
		arr[1]= new int[] {40,50,60};  //arr[1] ka mtlb 1st row mai {40,50,60} value aaega
		arr[2]= new int[] {70,80,90};  //same arr[1] jaisa agar hmlod sbke liye 1 value initialize krenge jaise a[0][0]={10} a[0][1]={20} aese bhut time lgega 
	// aese hmlog 1 line mai hi initialize kr lenge
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	int my[][]= {{1,2,3},{4,5,6}};
	//my[0]= new int[] {1,2,3};
	//my[1]= new int[] {4,5,6};
	for(int p=0;p<my.length;p++)
	{
		for(int q=0;q<=my.length;q++)
		{
			System.out.print(my[p][q]+" ");
		}
		System.out.println();
	}
	
	}
}
