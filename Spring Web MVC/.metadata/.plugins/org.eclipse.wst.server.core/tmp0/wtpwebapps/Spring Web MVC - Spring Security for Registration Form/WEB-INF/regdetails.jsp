<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="white">
<form>
<h1 align="center">
Registration Details Of User
<br><br>
<table border="1" align="center" style="color:black">
<tr>
	<td>User Name</td>
	<td>${name.uname}</td>
</tr>
<tr>
	<td>User Password</td>
	<td>${name.upwd}</td>
</tr>
<%-- <tr>
	<td>User Age</td>
	<td>${name.age}</td>
</tr>
<tr>
	<td>User Mail</td>
	<td>${name.uemial}</td>
</tr>
<tr>
	<td>User Mobile</td>
	<td>${name.umobile}</td> --%>
</tr>
</table>
</h1>
</form>
<h1 align="center"><a href="home"/>Home Page</h1>
</body>
</html>