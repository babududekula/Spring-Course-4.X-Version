<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"><u>Employee Details</u></h1>
<h1 align="center" style="color:maroon;">
<table border="2">
<tr>
	<td>Employee Number</td>
	<td>${name.enumber}</td>
</tr>
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
	<td>Employee Mail</td>
	<td>${name.email}</td>
</tr>
<tr>
	<td>Employee Mobile</td>
	<td>${name.emobile}</td>
</tr>
</table>
</h1>
</body>
</html>