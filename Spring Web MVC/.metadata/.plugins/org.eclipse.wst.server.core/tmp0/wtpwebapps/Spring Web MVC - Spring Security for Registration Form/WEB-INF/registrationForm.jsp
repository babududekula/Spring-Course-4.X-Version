<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:blue;" align="center">Registration Form</h1>
<form:form action="babu" method="post" commandName="user">
<table align="center">
<tr>
	<td>User Name</td>
	<td><form:input path="uname"/></td>
</tr>
<tr>
	<td>User Password</td>
	<td><form:password path="upwd"/></td>
</tr>
<tr>
	
	<td><input type="submit" value="Submit"/></td>
</tr>
</table>
</form:form>
</body>
</html>