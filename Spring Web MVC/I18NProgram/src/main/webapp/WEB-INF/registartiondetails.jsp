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
<h1 style="color: red;" align="center"><spring:message code="title"/></h1>
<h2 style="color: green;" align="center"><spring:message code="title2"/></h2>
<center>
<table>
<tr>
	<td><spring:message code="uname"/></td>
	<td>${user.uname}</td>
</tr>
<tr>
	<td><spring:message code="upwd"/></td>
	<td>${user.upwd}</td>
</tr>
<tr>
	<td><spring:message code="uage"/></td>
	<td>${user.uage}</td>
</tr>
<tr>
	<td><spring:message code="uemail"/></td>
	<td>${user.uemail}</td>
</tr>
<tr>
	<td><spring:message code="umobile"/></td>
	<td>${user.umobile}</td>
</tr>
</table>
</center>
</body>
</html>