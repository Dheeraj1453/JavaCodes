package loveBabbar;
import java.util.Scanner;
public class sqrRoot {
	
	public static int sqrtN(long N) {
		int s = 0;
        int e = (int)N;
        int mid = s + (e-s)/2;
        
        int ans = -1;
        while(s<=e) {
            
            long square = mid*mid;
            
            if(square == N)
                return mid;
            
            if(square < N ){
                ans = mid;
                s = mid+1;
            }
            else
            {
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

	//main
	public static void main(String args[])
	{
		System.out.print("Enter the number for Square Root= ");
		Scanner sc= new Scanner(System.in);
		long n=sc.nextLong();
		System.out.println("Square root of "+n+" is= "+sqrtN(n));
	}
}

