<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red;" align="center">Welcome To Register details</h1>
<h2 style="color:blue;" align="center">Registration Details</h2>
<form:form commandName="employee">
<center>
<table border="1">
<tr>
	<td>Employee Name</td>
	<td>${name.ename}</td>
</tr>
<tr>
	<td>Employee Password</td>
	<td>${name.epwd}</td>
</tr>
<tr>
	<td>Employee Age</td>
	<td>${name.eage}</td>
</tr>
<tr>
	<td>Employee Email Id</td>
	<td>${name.eemail}</td>
</tr>
<tr>
	<td>Employee Mobile Number</td>
	<td>${name.emobile}</td>
</tr>
<tr>
	<td>Employee DateOfBirth</td>
	<td>${name.edob}</td>
</tr>
</table>
</center>
</form:form>
<h1 style="color:blue;"  align="center">
<a href="welcome">|Register Form|</a>
</h1>
</body>
</html>