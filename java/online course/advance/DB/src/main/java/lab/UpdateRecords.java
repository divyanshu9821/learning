package lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecords {
	public static void print(PreparedStatement smt) throws SQLException {
		ResultSet rst = smt.executeQuery();
		
		while(rst.next()) {
			System.out.println("sid "+rst.getInt("sid"));
			System.out.println("sname "+rst.getString("sname"));
			System.out.println("sgrade "+rst.getDouble("sgrade"));
		}
	}
	
	public static Connection dbconnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/"; // url of the database hosted on localhost
		String db = "demo"; // name of the database
		String usr = "root"; // user of the database
		String pass = "MYSQL@anshu_09"; // password for the usr to access database
		return DriverManager.getConnection(url + db, usr, pass);
		
	}
	
	public static void main(String[] args) {
		
		// using try with resource block as it automatically release the resource after
		// the program's execution ended
		try (Connection con = dbconnection(); Scanner sc = new Scanner(System.in);) {
			
			
			String query0 = "select * from student where sid = ?";
			
			// PreparedStatement interface provides methods for handling the parameterized query	
			PreparedStatement smt0 = con.prepareStatement(query0);// query to print the update value
			
			System.out.print("Enter id: ");
			
			int id = sc.nextInt(); // id input from user
			
			
			System.out.print("Enter choice('0' for name or '1' for grade updation): ");
			int choice = sc.nextInt(); // user choice to update name or grade 
			
			String query="";
			PreparedStatement smt;
			switch (choice) {
			case 0:
				query = "update student set sname = ? where sid = ?"; // query to insert tuple into table
				smt = con.prepareStatement(query);// query to update value in table
				
				System.out.print("Enter Name: ");
				String name = sc.next(); // input name
				
				smt.setString(1,name); // passing name in query
				
				break;
			
			case 1:
				query = "update student set sgrade = ? where sid = ?"; // query to insert tuple into table
				smt = con.prepareStatement(query);// query to update value in table
				
				System.out.print("Enter grade: ");
				Double grade = sc.nextDouble(); // input grade
				
				smt.setDouble(1,grade); // passing grade in query
				
				break;
			
			default: {
				System.out.println("Invalid field choice");
				return;
			}
			}
			
			
			smt.setInt(2,id);// setter method to set id in parameterized query
			
			smt0.setInt(1,id); // passing id in select query
			
			// printing the tuple before updation
			System.out.println("Before updation");
			print(smt0);
			
			// executing update query to database
			int status = smt.executeUpdate(); // method to execute the query in database returns the integer value
			
			if (status == 1)
				System.out.println("\nQuery OK, 1 row affected (0.00 sec)");
			
			// printing the tuple after updation
			System.out.println("\nAfter updation");
			print(smt0);
		
		} catch (SQLException e) { // execute in case of exception
			
			System.out.println(e);
		}
	}
}

/*

input:

Enter id: 1
Enter choice('0' for name or '1' for grade updation): 0
Enter Name: nik


output:

Before updation
sid 1
sname 'rohan'
sgrade 9.0

Query OK, 1 row affected (0.00 sec)

After updation
sid 1
sname 'nik'
sgrade 9.0
 
*/
