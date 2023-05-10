<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
	font-style: italic;
	font-family: consolas;
	color: red;
	font-size: large;
	font-weight: bold;
}
</style>
</head>
<body>
<h1 style="color:red;" align="center">Welcome To Register Form</h1>
<h2 style="color:blue;" align="center">Registration Form</h2>

<form:form action="welcome" commandName="employee">
<center>
<table>
<tr>
	<td>User Name</td>
	<td><form:input path="ename" placeholder="Enter Name"/></td>
	<td><form:errors path="ename" cssClass="error"/></td>
</tr>
<tr>
	<td>User Password</td>
	<td><form:password path="epwd" placeholder="Enter Password"/></td>
	<td><form:errors path="epwd" cssClass="error"/></td>
</tr>
<tr>
	<td>User Age</td>
	<td><form:input path="eage" placeholder="Enter Age"/></td>
	<td><form:errors path="eage" cssClass="error"/></td>
</tr>
<tr>
	<td>User Email ID</td>
	<td><form:input path="eemail" placeholder="Enter Email Id"/></td>
	<td><form:errors path="eemail" cssClass="error"/></td>
</tr>
<tr>
	<td>User Mobile Number</td>
	<td><form:input path="emobile" placeholder="Enter Mobile Number"/></td>
	<td><form:errors path="emobile" cssClass="error"/></td>
</tr>
<tr>
	<td>User DateOfBirth</td>
	<td><form:input path="edob" placeholder="Enter DOB"/></td>
	<td><form:errors path="edob" cssClass="error"/></td>
</tr>
<tr>
	<td><input type="submit" value="Register"/></td>
</tr>
</table>
</center>
</form:form>
</body>
</html>