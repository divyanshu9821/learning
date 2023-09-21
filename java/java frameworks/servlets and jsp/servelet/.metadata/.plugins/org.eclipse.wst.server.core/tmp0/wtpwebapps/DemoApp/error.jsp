<%--
	this is an error page called in add.jsp
	if add.jsp page got an error that will be redirected to this page
	
	isErrorPage="true" require to use 'exception' object
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgColor="red">
	<%= exception.getMessage() %>
</body>
</html>