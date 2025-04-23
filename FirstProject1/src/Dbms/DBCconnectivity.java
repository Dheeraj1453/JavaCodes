package Dbms;
import java.sql.*;     //this use to import all sql libraries
public class DBCconnectivity 
{
	public static void main(String[] args) 
	{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");   //isse hmlog sql library k Driver class ko use krenge(jo driver mai library chahiye usko isme likh denge)
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wtf","root","362436");  //it form a bridge b/w eclipse and database
	    System.out.println("Databse Connection Established");
	    Statement stmt = conn.createStatement();  
	    String insertQry="insert into Employees values(101,'James',70000,'james@gmail.com','Sector-18 Noida')";
	    stmt.execute(insertQry); //it excute the given query in database(insertqry jo hai wo iske andar likh skte hai)
		conn.close(); //connection ka obj close krne k liye
	}
    catch(Exception e)
	{
    	System.out.println(e.getMessage());
	}
	}

}
