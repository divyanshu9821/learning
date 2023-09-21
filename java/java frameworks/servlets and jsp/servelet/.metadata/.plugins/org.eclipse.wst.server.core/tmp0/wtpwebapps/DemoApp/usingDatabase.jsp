<!-- 
-----------------------------Step to use JDBC-----------------------------

1:import the package java.sql.*

2:load and register driver(every database has its own driver)
	copy the connector jar into the lib
	add Class.forName(com.mysql.jdbc.Driver); // specially for mysql
	
3:use Connection object to connect to database;

4:use Statement object to issue statements;
	.executeQuery(); // this is to issue query it will be stored into the resultSet object
	.executeUpdate(); // this is to update into the table
	
ResultSet object is to store the out of the query
	.next() //to go the next row
	.getString("<col_name>"); // to the string from the <col_name>
	.getInt(...); and soon for particular datatype

 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- step 1 -->
<%@ page import="java.sql.*" errorPage="/error.jsp" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String databaseURL = "jdbc:mysql://localhost:3306/students";
		String usr = "root";
		String pswd = "mysql";
		String sqlQuery = "select *from details";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(databaseURL,usr,pswd);// connect to database
		Statement smt = conn.createStatement(); // to issue statements to database
		ResultSet rst = smt.executeQuery(sqlQuery); // to get the data from the database
		rst.next();// initially the rst point to the row above the first row in database so to point to the first row of table
	%>
	
	Name:<%= rst.getString("Name") %>
	Class:<%= rst.getInt("Class") %>
</body>
</html>