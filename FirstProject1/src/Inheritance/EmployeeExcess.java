package Inheritance;

public class EmployeeExcess 
{	
		public static void main(String[] args) 
		{
			
			PermanentEmployee e=new PermanentEmployee(101,"james","james@gmail.com","sector -18 noida up",50000,10000,1000);
			System.out.println(e);
			PermanentEmployee.companyName();
			
			Dailywage ob2=new Dailywage(102,"king", "king@gmail.com", "Dwarika -12 delhi delhi", 20, 1000);
	        System.out.println(ob2);
	        Dailywage.companyName();
	        
	       /*jb hmlog ko 1 hi chiz ko call krna ho toh hmlog direct 'new' krke wska object bna
	        * skte hai zruri nhi variable lekr bnae agar 2-3 baar call krna ho tb uska
	        * variable bna lenge jaise upper mai 'e and ob2' bnae hai*/
	        System.out.println("\n"+new PermanentEmployee(108,"Dheeraj","Dheeraj@gmail.com","Malad Mumbai",100000,10000,1000));
	        System.out.println(new Dailywage(105,"Aditwa","Aditwa@gmail.com","Nala Supara",100,100));
				
		}

	}

