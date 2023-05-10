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
<h1 align="center">Registration Details</h1>
<form:form method="post" action="reg" commandName="student">
<center>
<table>
<tr>
	<td>User Name</td>
	<td><form:input path="sname" placeholder="Enter Name"/></td>
</tr>
<tr>
	<td>User Password</td>
	<td><form:password path="spwd" placeholder="Enter Password"/></td>
</tr>
<tr>
	<td>User Age</td>
	<td><form:input path="sage" placeholder="Enter Age"/></td>
</tr>
<tr>
	<td>User Marks</td>
	<td><form:input path="smarks" placeholder="Enter Marks"/></td>
</tr>
<tr>
	<td>User Mail</td>
	<td><form:input path="semail" placeholder="Enter Mail"/></td>
</tr>
<tr>
	<td>User Mobile</td>
	<td><form:input path="emobile" placeholder="Enter Mobile"/></td>
</tr>
<tr>
	<td><input type="submit" value="SUBMIT"/></td>
</tr>
</table>
</center>
</form:form>
</body>
</html>