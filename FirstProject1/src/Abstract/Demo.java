package Abstract;
/*Agar kisi bhi class mai koi method incomplete ya define nhi ho wo abstact class 
 * hote hai. Abstract class ka Object nhi bn skta. Abstact class hmlog isliye bnate hai
 * ki koi bhi isko apne class mai inherit krke usko apne convinent define krle.
 */

abstract class Bird  //Agar koi class undefine method rkhta hai toh usme 'abstract' likhenge
{
	public void speak()
	{
		System.out.println("I can Speak");
	}
	abstract void fly();  //Abstract method kyuki koi bird fly kr skta hai koi nhi kr skta
}

class penguin extends Bird
{
	public void fly()
	{
		System.out.println("I cannot Fly");
	}
}

class parrot extends Bird
{
	public void fly()
	{
		System.out.println("I can Fly");
	}
}

//main class
public class Demo 
{
public static void main(String args[])
{
	//yaha hmlog abstract class ka obj nhi bna skte kyuki wo incomplete hai
	penguin ob1= new penguin();
	parrot ob2= new parrot();
	System.out.println("Hey! I'm Penguin");
	ob1.speak();
	ob1.fly(); //penguin mai apna fly method define kiya
	System.out.println();
	System.out.println("Hey! I'm Parrot");
	ob2.speak();
	ob2.fly();  //wahi same method ko parrot ne apne tarika se
	System.out.println();
	
	//Abstract class ka obj nhi bna skte but uska reference lekr kisi or k obj create kr skte hai
	Bird ob= new penguin();  //'Dynamic Binding/Run time Polymorphism'
	ob.fly();
	ob=new parrot();   //'Dynamic Binding/Run time Polymorphism'
	ob.speak();
	ob.fly();
}
}
