<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" style="color: red;"><u>Welcome To Login Page</u></h1>
<form action="login" method="post">
<h1>
<table align="center" style="background: pink;">
<tr>
	<td>User Name</td>
	<td><input type="text" name="uname" placeholder="username"/></td>
</tr>
<tr>
	<td>User Password</td>
	<td><input type="password" name="upwd" placeholder="password"/></td>
</tr>
<tr>
	<td><input type="submit" value="Login" style="background: green;"/></td>
</tr>
</table>
</h1>
</form>
</body>
</html>