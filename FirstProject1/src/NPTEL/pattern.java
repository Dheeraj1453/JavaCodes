package NPTEL;
import java.util.Scanner;
public class pattern 
{
	public static void main(String[] args) 
	{
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      //main code
      
      int i,j;
      for(i=0;i<n;i++)
      {
    	  for(j=0;j<n-i;j++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
      for(i=0;i<n-1;i++)
      {
    	  for(j=0;j<=i+1;j++)
    	  {
    		  System.out.print("*");
    	  }
    	  if(i==(n-2))
    		  break;
    	  System.out.println();
    	  }
      
	}

}
