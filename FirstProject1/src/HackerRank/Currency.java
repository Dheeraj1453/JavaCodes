package HackerRank;
	import java.util.*;
	import java.text.*;

	public class Currency{
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        //Numeber Format ka use hmlog number ko currency k term mai use krne k liye likhte hai
	        //agar hmlog ko usme currency sign lagana hai toh hmlog getCurrencyInstance(Locale.country) ka use krenge
	        
	        String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
	        String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
	        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
	        String india= NumberFormat.getCurrencyInstance(new Locale("hi","IN")).format(payment);
	        		
	       System.out.println("US: " + us);
	       System.out.println("India: " + india);
	       System.out.println("China: " + china);
	       System.out.println("France: " + france);
	       
	    }
	}

