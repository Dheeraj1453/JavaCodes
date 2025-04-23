package My;
import java.util.Scanner;
public class searching {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int i;
		System.out.println("Enter size of Array you want");
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
	    System.out.println();
	    System.out.println("Which number you have to Search=");
	    int n= sc.nextInt();
	    boolean f= false;
	    for(i=0;i<l;i++)
	    {
	    	if(a[i]==n)
	    	{
	    		System.out.println("Number Found at\t"+(i+1));
	    		f=true;
	    		break;
	    	}}
	    	if(f==false)
	    	{
	    		System.out.println("Number not Found!");
	    	}
	    }
	}

