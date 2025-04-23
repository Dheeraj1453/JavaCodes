package ExceptionHandling;
/*Jb hmlog ko main class k andar Exception Handle krenge tb hmlog 'throw' kr denge
 * exception ko main mai*/

import java.lang.Exception;
class myexception extends Exception
{
	myexception(String message)
	{
		super(message);
	}
}

public class Throwsexception 
{
public static void main (String args[])
{
	int x=5,y=1000;
	try
	{
		float z=(float)x/(float)y;
		if(z<0.01)
		throw new myexception("Inavlid Entry");   //ye exception ko throw kr dega
	}
	catch(myexception e)
	{
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("It Print Always");
	}
}
}

