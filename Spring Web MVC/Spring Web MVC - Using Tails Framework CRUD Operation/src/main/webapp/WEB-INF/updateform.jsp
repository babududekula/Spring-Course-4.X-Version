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
<h1 align="center" style="color:red;">Welcome To SearchForm</h1>

<form:form method="post" action="updateform" commandName="employee">
<center>
<table>
<tr>
	<td>Employee Number</td>
	<td><form:input path="enumber"/></td>
</tr>
<tr>
	<td><input type="submit" value="editForm"/></td>
</tr>
</table>
</center>
</form:form>

</body>
</html>