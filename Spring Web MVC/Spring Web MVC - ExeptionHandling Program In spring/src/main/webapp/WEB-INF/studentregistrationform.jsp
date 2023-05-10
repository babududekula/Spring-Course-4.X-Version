<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Student Details</h1>
<br>
<h1  style= "color:red;" align="center">
<table border="1">
<tr>
	<td>Student Name</td>
	<td>${name.sname}</td>
</tr>
<tr>
	<td>Student Password</td>
	<td>${name.spwd}</td>
</tr>
<tr>
	<td>Student Age</td>
	<td>${name.sage}</td>
</tr>
<tr>
	<td>Student Mail Address</td>
	<td>${name.semail}</td>
</tr>
<tr>
	<td>Student Marks</td>
	<td>${name.smarks}</td>
</tr>
<tr>
	<td>Student Mobile Number</td>
	<td>${name.emobile}</td>
</tr>
</table>
</h1>
</body>
</html>