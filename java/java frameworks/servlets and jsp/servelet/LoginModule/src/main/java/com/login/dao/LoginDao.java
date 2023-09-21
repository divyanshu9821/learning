package com.login.dao;

import java.sql.*;

public class LoginDao {
	public boolean check(String uname, String upass) throws SQLException {
		String sql = "select *from login where uname=? and upass=?";
		String url = "jdbc:mysql://localhost:3306/students";
		String u = "root";
		String p = "mysql";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,u,p);
			PreparedStatement smt = conn.prepareStatement(sql);
			smt.setString(1,uname);
			smt.setString(2,upass);
			ResultSet rst = smt.executeQuery();
			if(rst.next())
				return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}
}
