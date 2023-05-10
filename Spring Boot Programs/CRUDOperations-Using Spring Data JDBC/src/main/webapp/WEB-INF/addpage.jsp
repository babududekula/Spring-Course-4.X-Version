<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/welcome.jsp"/>
<h1 align="center" style="color: black;">Welcome To Add Form</h1>
<form method="post" action="add">
<table align="center">
<tr>
	<td>User Number</td>
	<td><input type="text" name="enumber"/></td>
</tr>
<tr>
	<td>User Name</td>
	<td><input type="text" name="ename"/></td>
</tr>
<tr>
	<td>User Password</td>
	<td><input type="password" name="epwd"/></td>
</tr>
<tr>
	<td>User Age</td>
	<td><input type="text" name="eage"/></td>
</tr>
<tr>
	<td>User Mail</td>
	<td><input type="text" name="email"/></td>
</tr>
<tr>
	<td>User Mobile</td>
	<td><input type="text" name="emobile"/></td>
</tr>
<tr>
	<td><input type="submit" value="ADD"/></td>
</tr>
</table>
</form>
</body>
</html>