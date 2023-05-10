<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form {
	background-color: orange;
	align-content: center
	width: 200px;
	height: 300px;
	border-style: blue;
	padding: 20px;
}
</style>
</head>

<body>
<h1 align="center" style="color: maroon;"><u>Login Application</u></h1>
<form action="page" method="post">
<table align="center">
<tr>
	<td>User Name </td>
	<td><input type="text" name="uname" style="background: red;"/></td>
</tr>
<tr>
	<td>User Password </td>
	<td><input type="password" name="upwd" style="background: red;"/></td>
</tr>
<tr>
	<td><input type="submit" value="LOGIN" style="background: lime;"/>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href = "registration" style="color: black;">REGISTRATION</a></td>
</tr>
</table>
</form>

</body>
</html>