package My;
import java.util.*;

public class prime{
    public static boolean isPrime(int n) {
        for(int i=2; i<n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        int takeNumber = scanner.nextInt();
        int a = 0;

        for(int i=2; i<takeNumber; i++) {
            if(isPrime(i)) {
                a = a+i;
            }
        }

        System.out.println(a);    //And here you fucked up Mr. Dheeraj Kumar Jha😒
    }
}