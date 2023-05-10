<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: red;" align="center"><spring:message code="title"/></h1>
<h2 style="color: green;" align="center"><spring:message code="title1"/></h2>
<form:form action="reg" method="POST" commandName="user">
<center>
<table>
<tr>
	<td><spring:message code="uname"/></td>
	<td><form:input path="uname"/></td>
</tr>
<tr>
	<td><spring:message code="upwd"/></td>
	<td><form:password path="upwd"/></td>
</tr>
<tr>
	<td><spring:message code="uage"/></td>
	<td><form:input path="uage"/></td>
</tr>
<tr>
	<td><spring:message code="uemail"/></td>
	<td><form:input path="uemail"/></td>
</tr>
<tr>
	<td><spring:message code="umobile"/></td>
	<td><form:input path="umobile"/></td>
</tr>
<tr>
	<td><input type="submit" value="Register"/></td>
</tr>
</table>
</center>
</form:form>
</body>
</html>