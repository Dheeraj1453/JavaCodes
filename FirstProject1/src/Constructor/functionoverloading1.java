package Constructor;
public class functionoverloading1 
{
void print()
{
	System.out.println("No Argument");
}
void print(int i, String n)
{
	System.out.println("1st is Integer 2nd is String");
}
void print(String n, int i)  //ye function mai Argument same hai but sequence alag hai
{
	System.out.println("1st is String 2nd is Integer");
}
void print(float a,int b)
{
	System.out.println("1st is float 2nd is Integer");
}
void print(int a,int b)
{
	System.out.println("1st is Integer 2nd is Integer");
}

void print(char i)
{
	System.out.println("Char Argument");
}

public static void main(String args[])
{
	functionoverloading1 ob= new functionoverloading1();
     ob.print();  //function with no argument 
     ob.print(1,"Dheeraj");  //function 1st have integer 2nd is string
     ob.print("Dheeraj",1);  //function 1st have string 2nd is integer
     ob.print(12f,12);   /*Agar hmlog 12,12 value de denge toh toh compiler confuse
                          *ho jaega ki int,int wle ko call kr rhe hai ya 
                          *float,int wle ko isliye float value k sth f use krenge*/
     ob.print('M');
     ob.print(45,18);
}
}
