package My;
public class Array {
	public static void main(String args []) 
	{
		/*1st method Array initialize krne ka*/
		
		int []rollno;   //Array ko declare kiye
		rollno= new int[3];  //Array ka size java mai aese hi diya jata hai
		rollno[0]=10;  //Array mai value assign
		rollno[1]=14;
		rollno[2]=19;
		for(int i=0;i<3;i++)
		{
			System.out.print(rollno[i]+" ");
		}
		System.out.println();
		//2nd method Initialize krne ka
		int []seq=new int[3];   //isme array ka size or array declare 1 mai hi kr diye
		seq[0]=18;
		seq[1]=45;
		seq[2]=7;
		for(int i=0;i<3;i++)
		{
			System.out.print(seq[i]+" ");
		}
		System.out.println();
		//3rd Method Initialize krne ka
		int []my=new int[] {1,2,3,4,5,6,7,8}; // hmlog direct array aese bhi likh skte hai agar given ho
		for(int i=0;i<8;i++)
		{
			System.out.print(my[i]+" ");
		}
		System.out.println();
		//4th method initialize krne ka
		int arr[]= {10,20,45,67,21,77};  //hmlog direct value bhi likh skte hai array mai usme size likhne ka zrurat nhi
		for(int i=0;i<6;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
