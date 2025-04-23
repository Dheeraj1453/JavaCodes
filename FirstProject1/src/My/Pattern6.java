package My;

public class Pattern6 {
public static void main(String args[])
{
	 int i, j;
     for (i=1; i<=5; i++)
     {
         // Print trailing spaces
         for (j=1; j<=5-i; j++)
             System.out.print(" ");
           
         // Print stars after spaces
         // Print stars for each solid rows
         if (i==1 || i==5)
             for (j=1; j<=5; j++)
                 System.out.print("*");
               
         // stars for hollow rows
         else
             for (j=1; j<=5; j++)
                 if (j==1 || j==5)
                     System.out.print("*");
                 else
                     System.out.print(" ");
         // Move to the next line/row
         System.out.println();
}
}}
