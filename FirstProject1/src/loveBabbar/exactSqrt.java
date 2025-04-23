package loveBabbar;
import java.util.*;

public class exactSqrt {
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
            else{
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }
	
	public static String morePrecision(long n, int precision, int tempSol) {
	    
	    double factor = 1;
	    double ans = tempSol;
	    String a;

	    for(int i=0; i<precision; i++) {
	        factor = factor/10;
	        
	        for(double j=ans; j*j<n; j= j+factor ){
	            ans = j;
	        }
	    }
	    a = String.format("%.3f",ans);
	    return a;
	}

	//main
	public static void main(String args[])
	{
		System.out.print("Enter the number for Square Root= ");
		Scanner sc= new Scanner(System.in);
		long n=sc.nextLong();
		int temp = sqrtN(n);
		System.out.println("Square root of "+n+" is= "+morePrecision(n,3,temp));
	}


}
