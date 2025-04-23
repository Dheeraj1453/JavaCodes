package My;
import java.util.Scanner;
public class arrayinput {
	public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    int i;
    int arr[]=new int[5];    //User se jb array mangna hoga tb aese krenge
    System.out.println("Enter the number in 1st Array:");
    for(i=0;i<5;i++)
    {
    	arr[i]=sc.nextInt();
    }
    for(i=0;i<5;i++)
    {
    	System.out.print(arr[i]+" ");
    }
    System.out.println();
    //for mai baar baar i ka value change krne acha arr.length use kr lenge
    int my[]=new int[4];
    System.out.println("Enter nimber in 2nd array:");
    for(i=0;i<my.length;i++)  //my.length array ka length khud pta kr lega
    {
    	my[i]=sc.nextInt();
    }
    for(i=0;i<my.length;i++)
    {
    	System.out.print(my[i]+" ");
    }
    System.out.println();
    //aab agar hmlog ko pura dynamic program bna na yani user se hi puch lenge usko kitna ka aaray chahiye
    System.out.println("Enter size of 3rd Array you want");
    int l= sc.nextInt();
    System.out.println("Enter "+l+" number in Array:");
    int a[]=new int[l];
    for(i=0;i<l;i++)
    {
    	a[i]=sc.nextInt();
    }
    for(i=0;i<l;i++)
    {
    	System.out.print(a[i]+" ");
    }
	}
}
