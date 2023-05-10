<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" style="color:blue"><u>Welcome To Add Page</u></h1>
<h2 align="center" style="color:red;"><u>ADD Form</u></h2>
<form:form action="addpage" method="post" commandName="employee">
<center>
<table>
<tr>
	<td>Employee Number</td>
	<td><form:input path="enumber"/></td>
</tr>
<tr>
	<td>Employee Name</td>
	<td><form:input path="ename"/></td>	
</tr>
<tr>
	<td>Employee Password</td>
	<td><form:password path="epwd"/></td>
</tr>
<tr>
	<td>Employee Age</td>
	<td><form:input path="eage"/></td>
</tr>
<tr>
	<td>Employee Mail</td>
	<td><form:input path="email"/></td>
</tr>
<tr>
	<td>Employee Mobile</td>
	<td><form:input path="emobile"/></td>
</tr>
<tr>
	<td><input type="submit" value="SUBMIT"/></td>
</tr>
</table>
</center>
</form:form>
</body>
</html>