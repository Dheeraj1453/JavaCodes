package HackerRank;
import java.util.*;
import java.io.*;

class series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=0;
            
            for(int j=0;j<n;j++)
            {
              sum=(int) (sum+(a+(Math.pow(2,j)*b)));
              System.out.print(sum+" "); 
              a=0;
            }
            System.out.println();
        }
        in.close();
    }
}