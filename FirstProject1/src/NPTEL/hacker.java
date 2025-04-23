package NPTEL;
import java.util.Scanner;

public class hacker{

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int len=s1.length();
                if(len>10)
                	break;
                while(len<=15)
                {
                    s1=s1+" ";
                    len++;
                }
                if(x<=10)
                System.out.printf("%s0%d0\n",s1,x);
                else if(x>10&&x<=99)
                	 System.out.printf("%s0%d\n",s1,x);
                else
                	System.out.printf("%s%d\n",s1,x);
            }
            System.out.println("================================");

    }
}