package ExceptionHandling;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.nio.file.FileSystemNotFoundException;
import java.util.InputMismatchException;

public class throwdemo 
{	
	public static void hire(int age)
	{
		try {
		if(age<18) {
			throw new InputMismatchException("U are a minor");  //throw are used when we have to give our own exception message
		}
		else if (age>50)
		{
			throw new InputMismatchException("U are over age");
		}
		else
		{
			System.out.println("Please submit your cv");
		}}
		catch(InputMismatchException ob)
		{
			System.out.println("Enter Only Age");
		}
		}
		
		
	public static void main(String[] args) {
		System.out.println("Enter your age");
		try {
		hire(new java.util.Scanner(System.in).nextInt());  //Input integer value
		}
		catch(InputMismatchException ob)
		{
			System.out.println(ob.toString());
		}
		
	}

}
