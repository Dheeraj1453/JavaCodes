package Dbms;
//import java.sql.*;     ye impoert nhi krke dusre libraries bhi kr skte hai but isme sb aata hai
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;
public class DBCconnectivity1
{
	//2nd method to insert data in Database
	public static void main(String[] args) 
	{
	try
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");   //isse hmlog sql library k Driver class ko use krenge(jo driver mai library chahiye usko isme likh denge)
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wtf","root","362436");  //it form a bridge b/w eclipse and database
	    System.out.println("Databse Connection Established");
	    Statement stmt = conn.createStatement();
	    
	    int eid;
	    String name,email,address;
	    float salary;
	    
	    System.out.println("Insert Employees Details:-");
	    System.out.println("Enter Eid:");
	    eid=sc.nextInt();
	    System.out.println("Enter Name:");
	    sc.nextLine();  // to clear buffer
	    name=sc.nextLine();
	    System.out.println("Enter Salary:");
	    salary=sc.nextFloat();
	    System.out.println("Enter Email_Id:");
	    email=sc.next();
	    sc.nextLine();
	    System.out.println("Enter Address:");
	    address=sc.nextLine();
	    
	    String insertQry="insert into Employees values("+eid+",'"+name+"',"+salary+",'"+email+"','"+address+"')";
	    stmt.execute(insertQry); //it excute the given query in database(insertqry jo hai wo iske andar likh skte hai)
	    conn.close(); //connection ka obj close krne k liye
	}
    catch(Exception e)
	{
    	System.out.println(e.getMessage());
	}
	}

}
