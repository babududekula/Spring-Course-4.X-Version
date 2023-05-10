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
<h1 align="center">Qualification</h1>
<form:form method="post" commandName="user">
<center>
<table>
<tr>
	<td>User Qualification</td>
	<td><form:input path="uqual"/></td>
</tr>
<tr>
	<td>User Designation</td>
	<td><form:input path="udes"/></td>
</tr>
<tr>
	<td colspan="2">
		<input type="submit" name="_target0" value="Previous">
		<input type="submit" name="_target2" value="Next"/>
		<input type="submit" name="_cancel" value="Cancel">
	</td>
</tr>
</table>
</center>
</form:form>
</body>
</html>