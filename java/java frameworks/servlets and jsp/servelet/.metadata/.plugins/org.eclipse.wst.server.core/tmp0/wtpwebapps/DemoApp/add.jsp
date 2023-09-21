<%--
-----------------------NOTES-----------------------
It is use to add java code into the html directly 
In backend jsp will make a servlet automatically for that
JSP tags
	
	scriptlet //goes inside the service()
		<% %>
		
	declaration //goes outside the service()
		<%! %>
		
	directive
		<%@page attribute="value" attribute="value" .... %> // for ex -  <%@page import="" %> // import packages in java
		<%@include %> // for ex - <%@include file="filename" %>include other files 
		<%@taglib %> // for ex - <%@taglib uri="uri" prefix="blah" %> <blah:usrDefinedTag> // to use external tag
		
	expression //to perform simple task like print without using complete out.prin....
		<%= %> //for ex <%=variable %>   


--%>


<%--
	errorPage="error.jsp" this will call the error.jsp file if error occurs
		this is the other way to handle exception than using 'try catch block'
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="/error.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	
	<%--

		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		int c = a + b;
		out.println(c);
	
	
	--%>
	
	
	<!-- Expression language -->
	ADD:${param.num1+param.num2}

</body>
</html>