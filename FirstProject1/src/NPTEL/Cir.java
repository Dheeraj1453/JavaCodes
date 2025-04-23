package NPTEL;
import java.util.Scanner;

abstract class Shape {
    public abstract double area();

    public void displayInfo() {
        System.out.println("Shape - Area: " + area());
    }
}

final class Cir extends Shape {
    private double radius;

    //your code
    public Cir(double r)
    {
      radius=r;
    }
    
    @Override
    public double area() 
    {	
    	return Math.PI*radius*radius;
    }
    
 //Main class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        Cir circle = new Cir(radius);
        circle.displayInfo();

        scanner.close();
    }



}