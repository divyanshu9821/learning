package lab;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InsertRecord {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/"; // url of the database hosted on localhost
		String db = "demo"; // name of the database
		String usr = "root"; // user of the database
		String pass = "**..."; // password for the usr to access database(intentionally hidden by author of this source code which means me)
		String query = "insert into student(sid, sname, sgrade) values(?,?,?)"; // query to insert tuple into table
		
		// using try with resource block as it automatically release the resource after the program's execution ended
		try (Connection con = DriverManager.getConnection(url+db,usr,pass);Scanner sc = new Scanner(System.in);){
			
			// PreparedStatement interface provides methods for handling the parameterized query
			PreparedStatement smt = con.prepareStatement(query);
			
			// input from user
			int id = sc.nextInt();
			String name = sc.next();
			Double grade = sc.nextDouble();
			
			// PreparedStatement interface provides setter methods
			smt.setInt(1,id); // setInt(<query parameter index>,<value>);
			smt.setString(2,name); // same as above
			smt.setDouble(3,grade); // same as above
			int status = smt.executeUpdate(); // method to execute the query in database returns the integer value
			if(status == 1)
				System.out.println("Query OK, 1 row affected (0.00 sec)");
		} catch (SQLException e) { // execute in case of exception
			System.out.println(e);
		}
	}
}


/*
mysql> desc student;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| sid    | int         | NO   | PRI | NULL    |       |
| sname  | varchar(20) | YES  |     | NULL    |       |
| sgrade | double(3,1) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
3 rows in set (0.02 sec)


input:

1
Divyanshu
10.0

output:

Query OK, 1 row affected (0.00 sec)

*/
