package Dbms;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class DBC {
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wtf","root","362436");
			System.out.println("database connection established");
			Statement stmt = conn.createStatement();
			
			InsertRecord(sc,conn,stmt);  //calling InsertRecord
			//DeleteRecord(sc,conn,stmt);   //calling DeleteRecord
			//UpdateRecord(sc,conn,stmt);  //calling UpdateRecord
			ViewRecord(conn,stmt);  //calling ViewRecord
			conn.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
 
	//Insert record in Dtatbase 
	public static void InsertRecord(Scanner sc, Connection conn, Statement stmt) throws SQLException {
		int eid;
		String name,email,address;
		float salary;
		System.out.println("Insert employee details");
		System.out.println("Enter eid ");
		eid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name ");
		name=sc.nextLine();
		System.out.println("Enter salary ");
		salary=sc.nextFloat();
		System.out.println("Enter email ");
		email=sc.next();
		sc.nextLine();
		System.out.println("Enter address ");
		address=sc.nextLine();				
		String insertQry="insert into employees values("+eid+",'"+name+"',"+salary+",'"+email+"','"+address+"')";
		//System.out.println(insertQry);    this is used to check the query
		stmt.execute(insertQry);
		
	}
	
	//Update record in Database
	public static void UpdateRecord(Scanner sc, Connection conn, Statement stmt) throws SQLException {
		int eid;
		String email,address;
		System.out.println("Insert employee eid u want to update");
		System.out.println("Enter eid ");
		eid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter email ");
		email=sc.next();
		sc.nextLine();
		System.out.println("Enter address ");
		address=sc.nextLine();				
		String updateQuery="update employees set email='"+email+"',address='"+address+"' where eid="+eid;
		//System.out.println(updateQuery); //print the query
	    stmt.execute(updateQuery);
		
	}
	
	//Delete record in database
	public static void DeleteRecord(Scanner sc, Connection conn, Statement stmt) throws SQLException {
		int eid;
		String email,address;
		System.out.println("Insert employee eid u want to remove from database");
		System.out.println("Enter eid ");
		eid=sc.nextInt();	
		String deleteQuery="delete from  employees where eid="+eid;
		//System.out.println(deleteQuery);  print the delete query
		stmt.execute(deleteQuery);
		
	}
	
	//View data of Databse
	public static void ViewRecord(Connection conn, Statement stmt) throws SQLException {			
	
		String selectQuery="select * from  employees";
		//System.out.println(selectQuery);   print the query to show data
		ResultSet rs=stmt.executeQuery(selectQuery);
		System.out.printf("Eid\tName\tSalary\tEmail\tAddress");
		while(rs.next())
		{
System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
		}		
	}

}
