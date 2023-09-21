<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("userName")==null || session.getAttribute("userPass")==null){
			response.sendRedirect("login.jsp");
		}
	%>
	<a href="videos.jsp">Go to the video page</a>
	
	<form action="LogOut" method="post"><input type="submit" value="Log out"></form>
</body>
</html>