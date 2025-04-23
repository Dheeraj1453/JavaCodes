package NPTEL;
import java.util.Scanner;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

//main code
class FlyingFish implements Flyable,Swimmable
{
	private String name;
	 public FlyingFish(String n)
	 {
		name=n; 
	 }
	 
	 public void fly()
	 {
		 System.out.println("John can glide through the air");
	 }
	 
	public void swim()
	{
		System.out.println("John can Swim");
	}
}

//main class
public class nptel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the name of the fish: ");
        String fishName = scanner.nextLine();

        FlyingFish flyingFish = new FlyingFish(fishName);

        // Test the FlyingFish class
        flyingFish.fly();
        flyingFish.swim();

        scanner.close();
    }
}