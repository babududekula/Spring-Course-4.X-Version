<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green" text="yellow">
<h1 align="center">
<u>Student Details</u><br>
<form>
<table border="1">
<tr>
	<td>Student id</td>
	<td>${student.sid}</td><br>
</tr>
<tr>
	<td>Student Name</td>
	<td>${student.sname}</td>
</tr>
<tr>
	<td>Student sal</td>
	<td>${student.ssal}</td>
</tr>
<tr>
	<td>Student addr</td>
	<td>${student.saddr}</td>
</tr>
</table>
</form>
</h1>
<h1 style="color:cyan;" align="center">
<a href="searchform">Return To SerachForm</a>
</h1>
</body>
</html>