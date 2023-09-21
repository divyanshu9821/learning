package com.divyanshu;

import java.sql.*;

public class ShowTableContent {
	
	public static void main(String[] args) throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pass = "MYSQL@anshu_09";
		String query = "select * from student;";
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement smt = con.createStatement();
			ResultSet rst = smt.executeQuery(query);
			while(rst.next()) {
				System.out.println(rst.getInt("sid")+" "+rst.getString("sname"));
			}
			con.close();
		} catch (Exception se) {
			System.out.println(se);
		}
	}

}
