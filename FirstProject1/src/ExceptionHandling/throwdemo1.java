package ExceptionHandling;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	
	//previous we just use throw to give own exception msg,Now we use this in try Catch
	public class throwdemo1
	{
		static void checkAge(int age) throws FileNotFoundException
		{
					if(age<18)
					{
						throw new FileNotFoundException("You are below 18 years");
					}
					else
					{
						System.out.println("u r allowed to cast ur vote");
					}	
			
			System.out.println("end of code");
		}
		
		//Main Method
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ur Age:");
			int age=sc.nextInt();
			try {
			checkAge(age);
			}
			catch(FileNotFoundException ob)
			{
				System.out.println(ob);
			}

		}

	}
