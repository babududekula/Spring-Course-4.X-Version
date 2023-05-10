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
<h1 align="center">Welcome To Update Page</h1>
<form method="post" action="update">
<table align="center" border="1" style="color: white;">
<tr>
	<td>User Number</td>
	<td>${name.enumber}<input type="hidden" name="enumber" value="${name.enumber}"/></td>
</tr>
<tr>
	<td>User Name</td>
	<td><input type="text" name="ename" value="${name.ename}"/></td>
</tr>
<tr>
	<td>User Password</td>
	<td><input type="password" name="epwd" value="${name.epwd}"/></td>
</tr>
<tr>
	<td>User Age</td>
	<td><input type="text" name="eage" value="${name.eage}"/></td>
</tr>
<tr>
	<td>User Mail</td>
	<td><input type="text" name="email" value="${name.email}"/></td>
</tr>
<tr>
	<td>User Mobile</td>
	<td><input type="text" name="emobile" value="${name.emobile}"/></td>
</tr>
</table>
<table align="center">
<tr>
	<td><input type="submit" value="UPDATE"/></td>
	<td><input type="reset" value="RESET"/></td>
</tr>
</table>
</form>
</body>
</html>