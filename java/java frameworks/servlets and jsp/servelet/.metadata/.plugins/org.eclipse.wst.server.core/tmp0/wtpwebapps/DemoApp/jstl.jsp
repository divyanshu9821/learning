<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="jj" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sq" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jj:out value="hello world" /><br>
	
	<jj:set var="greet" value="good to see you"/>
	Length-${fn:length(greet)}
	
	<jj:forEach  items="${fn:split(greet,' ')}" var="s" >
		<br> ${s}		
	</jj:forEach>
</body>
</html>