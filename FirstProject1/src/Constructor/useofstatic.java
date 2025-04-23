package Constructor;
class student
{
int rollno;
String name;
static String college="IIT Mumbai";  /*jo hmlog ka sbhi object mai same rhega
                                      *usko hmlog static le lete hai kyuki
                                      *college ko agar hmlog baar baar call krke
                                      *same value assign krenge toh wo utna utna space
                                      *sbhi obje mai lega isliye isko common bna lete h*/

//Constructor bnane ka bhi shortcut key:- alt+shift+s

public student(int rollno, String name) //Constructor
{
	this.rollno = rollno;
	this.name = name;
} 
void printdata()
{
	System.out.println(this.rollno+" "+this.name+" "+student.college);
}
}

public class useofstatic
{
			public static void main(String []args)
			{
				student ob1= new student(01,"Dheeraj");
				student ob2= new student(02,"Abhinit");
				student ob3= new student(03,"Yash");
				student ob4= new student(04,"Harsh");
				ob1.printdata();
				student.college="IIT Madras";   /*yaha agar ye change krenge toh wo sbke liye
                                                 *badal dega kyuki ye static hai or sbme common hai*/
				ob2.printdata();
				student.college="IIT Kharakhpur";
				ob3.printdata();
				ob4.printdata();
		
			}
	}

