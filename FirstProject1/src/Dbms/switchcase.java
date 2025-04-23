package Dbms;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class switchcase 
{
	private static String ch;

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wtf","root","362436");
			System.out.println("database connection established");
			Statement stmt = conn.createStatement();
			
			//Switch case
			while(true) 
			{
				int choice;
			System.out.println("What You want?\n1)Insert\n2)Update\n3)Delete\n4)View all\n5)Exit");	
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:InsertRecord(sc,stmt); break;
			case 2:UpdateRecord(sc,stmt); break;
			case 3:DeleteRecord(sc,stmt); break;
			case 4:ViewRecord(stmt); break;
		    default:System.out.println("Invalid Choice");
		    break;
			}
		    System.out.println("Do You want to Continue? y/n");
			ch=sc.next();
		    if(ch.equals("n"))
		    	break;
			}	
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
 
	//Insert record in Database 
	public static void InsertRecord(Scanner sc, Statement stmt) throws SQLException {
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
	public static void UpdateRecord(Scanner sc, Statement stmt) throws SQLException {
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
	public static void DeleteRecord(Scanner sc, Statement stmt) throws SQLException {
		int eid;
		String email,address;
		System.out.println("Insert employee eid u want to remove from database");
		System.out.println("Enter eid ");
		eid=sc.nextInt();	
		String deleteQuery="delete from  employees where eid="+eid;
		//System.out.println(deleteQuery);  print the delete query
		stmt.execute(deleteQuery);
		
	}
	
	//View data of Database
	public static void ViewRecord(Statement stmt) throws SQLException {			
	
		String selectQuery="select * from  employees";
		//System.out.println(selectQuery);   print the query to show data
		ResultSet rs=stmt.executeQuery(selectQuery);
		System.out.printf("Eid  Name   Salary\tEmail\t\tAddress\n-------------------------------------------------\n");
		while(rs.next())
		{
System.out.printf("%d %6s %.2f %s %s\n",rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getString(4),rs.getString(5));
		}		
	}

}
