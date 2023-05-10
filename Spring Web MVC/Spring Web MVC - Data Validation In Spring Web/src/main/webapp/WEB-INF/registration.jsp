<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
	color:red;
	font-family:consolas;
	font-size: large;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
<h1 style="color:red;" align="center"><u>Registration Form</u></h1>

<form:form method="post" action="welcome" commandName="employee">
<center>
<table>
<tr>
	<td>Employee name</td>
	<td><form:input path="ename"/></td>
	<td><form:errors path="ename" cssClass="error"/></td>
	<br>
</tr>
<tr>
	<td>Employee Password</td>
	<td><form:password path="epwd"/></td>
	<td><form:errors path="epwd" cssClass="error"/></td><br>
</tr>
<tr>
	<td>Employee Age</td>
	<td><form:input path="eage"/></td>
	<td><form:errors path="eage" cssClass="error"/></td><br>
</tr>
<tr>
	<td>Employee Mail</td>
	<td><form:input path="eemail"/>
	<td><form:errors path="eemail" cssClass="error"/></td></td><br>
</tr>
<tr>
	<td>Employee Mobile</td>
	<td><form:input path="emobile"/></td>
	<td><form:errors path="emobile" cssClass="error"/></td><br>
</tr>
<tr>
	<td><input type="submit" value="Registartion"/></td>
</tr>
</table>
</center>
</form:form>
</body>
</html>