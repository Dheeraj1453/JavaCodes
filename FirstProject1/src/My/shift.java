package My;
import java.util.Scanner;
public class shift {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Positive number=");
		int num1= sc.nextInt();
		System.out.println("Enter negative number=");
		int num2= sc.nextInt();
		System.out.println("Right Shift of positive="+(num1>>1)); //half kr deta hai positive number ko
		System.out.println("left Shift of positive="+(num1<<1));  //Double kr deta hai postive number ko
		System.out.println("Right Shift of negative="+(num2>>1)); //half kr dega negatibve ko bhi (isme vacant space mai 1 aaega) 
        System.out.println("Left Shift of negative="+(num2<<1)); //Double kr dega	
	    System.out.println("Zero Shift="+(num2>>>1)); // >>> ye wla shift sirf -ve number ka right shift hota hai jb uska vacant space 0 se replace krna ho 
	}

}
