<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" style="color: red;">Welcome To Calculator</h1>
<form action="classB.jsp" method="get">

<table align="center">
<tr>
	<td>First Number</td>
	<td><input type="text" name="first"/></td>
</tr>
<tr>
	<td>Second Number</td>
	<td><input type="text" name="second"/></td>
</tr>
<tr>
	<td><input type="submit" name="operation" value="Addition"/></td>
	<td><input type="submit" name="operation" value="Substration"/></td>
	<td><input type="submit" name="operation" value="Multiplication"/></td>
	<td><input type="submit" name="operation" value="Division"/></td>
</tr>
</table>

</form>
</body>
</html>