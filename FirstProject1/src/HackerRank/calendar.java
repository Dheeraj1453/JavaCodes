package HackerRank;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class result{

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    
    public static String findDay(int month, int day, int year) {
      String []myday= {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
    	Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        int p= cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(p);
        return myday[p-1];
    }

}

public class calendar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        int day = sc.nextInt();

        int year = sc.nextInt();

        String res = result.findDay(month, day, year);
        System.out.println(res);

     }
}

