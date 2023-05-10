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
<h1 align="center">Details</h1>
<form:form method="post" commandName="user">
<center>
<table>
<tr>
	<td>User Email</td>
	<td><form:input path="uemail"/></td>
</tr>
<tr>
	<td>User Number</td>
	<td><form:input path="emobile"/></td>
</tr>
<tr>
	<td colspan="2">
		<input type="submit" name="_target1" value="Previous"/>
		<input type="submit" name="_finish" value="Finish"/>
		<input type="submit" name="_cancel" value="Cancel">
	</td>
</tr>
</table>
</center>
</form:form>
</body>
</html>