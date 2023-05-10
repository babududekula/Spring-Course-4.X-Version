<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: red;" align="center"><spring:message code="title1"/></h1>
<center>
<h1>
<table border="1">
<tr>
	<td><spring:message code="uname"/></td>
	<td>${name.uname}</td>
</tr>
<tr>
	<td><spring:message code="upwd"/></td>
	<td>${name.upwd}</td>
</tr>
<tr>
	<td><spring:message code="uage"/></td>
	<td>${name.uage}</td>
</tr>
<tr>
	<td><spring:message code="uemail"/></td>
	<td>${name.uemail}</td>
</tr>
<tr>
	<td><spring:message code="umobile"/></td>
	<td>${name.umobile}</td>
</tr>
</table>
</h1>
</center>
<h1 align="center">
<a href="next">Home Page</a>
</h1>
</body>
</html>