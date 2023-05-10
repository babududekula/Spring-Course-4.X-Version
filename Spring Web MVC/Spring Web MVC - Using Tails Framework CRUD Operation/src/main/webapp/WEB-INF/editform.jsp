<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"><u>Welcome To EditForm</u></h1>
<form:form action="update" method="post" commandName="employee">
<center>
<table>
<tr>
	<td>Employee Number</td>
	<td>${name.enumber}<input type="hidden" value="${name.enumber}"/></td>
</tr>
<tr>
	<td>Employee Name</td>
	<td><input type="text" value="${name.ename}"/></td>
</tr>
<tr>
	<td>Employee Password</td>
	<td><input type="password" value="${name.epwd}"/></td>
</tr>
<tr>
	<td>Employee Age</td>
	<td><input type="text" value="${name.eage}"/></td>
</tr>
<tr>
	<td>Employee Mail</td>
	<td><input type="text" value="${name.email}"/></td>
</tr>
<tr>
	<td>Employee Mobile</td>
	<td><input type="text" value="${name.emobile}"/></td>
</tr>
<tr>
	<td><input type="submit" value="Update"/></td>
</tr>
</table>
</center>
</form:form>
</body>
</html>