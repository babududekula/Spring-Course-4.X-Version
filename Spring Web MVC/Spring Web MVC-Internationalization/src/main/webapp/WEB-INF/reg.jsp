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
<form:form method="POST" action="login" commandName="user">
<center>
<table>
<tr>
	<td><spring:message code="uname"/></td>
	<td><form:input path="uname"/>
</tr>
<tr>
	<td><spring:message code="upwd"/></td>
	<td><form:password path="upwd"/>
</tr>
<tr>
	<td><spring:message code="uage"/></td>
	<td><form:input path="uage"/>
</tr>
<tr>
	<td><spring:message code="uemail"/></td>
	<td><form:input path="uemail"/>
</tr>
<tr>
	<td><spring:message code="umobile"/></td>
	<td><form:input path="umobile"/>
</tr>
<tr>
	
	<td><input type="submit" value="Submit"/></td>
</tr>
</table>
</center>
</form:form>
</body>
</html>