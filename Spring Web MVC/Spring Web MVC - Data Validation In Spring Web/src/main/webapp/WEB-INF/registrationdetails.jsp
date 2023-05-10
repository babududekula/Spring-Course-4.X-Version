<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: green;" align="center"><u>Registration Form</u></h1>
<h1>
<table style="color: blue;" align="center" border="1">
<tr>
	<td>User Name</td>
	<td>${name.ename}</td>
</tr>
<tr>
	<td>User Password</td>
	<td>${name.epwd}</td>
</tr>
<tr>
	<td>User age</td>
	<td>${name.eage}</td>
</tr>
<tr>
	<td>User Mail</td>
	<td>${name.eemail}</td>
</tr>
<tr>
	<td>User Mobile</td>
	<td>${name.emobile}</td>
</tr>
</table>
</h1>
<h1 align="center" style="color:black;">
<a href="welcome">Home</a>
</h1>
</body>
</html>