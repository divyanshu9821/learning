package com.divyanshu.web.dao;
import java.sql.*;
import com.divyanshu.web.model.Alien;

// each table in database have its own dao class
// that can perfrom CRUD(create delete update delete)
public class AlienDao {
	public Alien getAlien(int aid) {
		Alien a1 = new Alien();
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/students";
			String userName = "root";
			String passWord = "mysql";
			String query = "select *from details where sid="+aid;
			
			Class.forName(driver); //load driver
			Connection conn = DriverManager.getConnection(url,userName,passWord); // get connected to database
			Statement smt = conn.createStatement(); // create statement object
			ResultSet rst = smt.executeQuery(query); // create resultSet object and store the output from the executed query
			if(rst.next()) {
				a1.setAid(rst.getInt("sid"));
				a1.setAname(rst.getString("Name"));
				a1.setTech(Integer.toString(rst.getInt("Class")));
				
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		
		
//		a1.setAid(101);
//		a1.setAname("divyanshu");
//		a1.setTech("java");
		return a1;
	}
}