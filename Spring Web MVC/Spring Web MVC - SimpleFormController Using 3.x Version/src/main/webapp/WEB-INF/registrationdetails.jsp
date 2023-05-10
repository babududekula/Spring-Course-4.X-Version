<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core_1_1"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" style="color:green;">
Registration Details
<br>
<br>
<table border="1">
<tr>
	<td>User Name</td>
	<td>${name.uname}</td>
</tr>
<tr>
	<td>User Password</td>
	<td>${name.upwd}</td>
</tr>
<tr>
	<td>Are You Married</td>
	<td>${name.metitalstatus1}</td>
</tr>
<tr>
	<td>Are You Single</td>
	<td>${name.meritalstatus2}</td>
</tr>
<tr>
	<td>Qualification</td>
	<td>
		<c:forEach var="uqua" items="${name.uqual1}">
			<c:out value="${uqua}"/>	
		</c:forEach>
	</td>
</tr>
<tr>
	<td>Qualification</td>
	<td>
		<c:forEach var="qual" items="${name.uqual2}">
			<c:out value="${qual}"/>
		</c:forEach>
	</td>
</tr>
<tr>
	<td>Gender</td>
	<td>${name.ugender}</td>
</tr>
<tr>
	<td>Work Location</td>
	<td>
		${name.ulocation}
	</td>
</tr>
<tr>
	<td>User Skills</td>
	<td>
		<c:forEach var="skills" items="${name.uskills}">
			<c:out value="${skills}"/>
		</c:forEach>
	</td>
</tr>
<tr>
	<td>User Hobbies</td>
	<td>
		<c:forEach var="hobby" items="${name.uhobby}">
			<c:out value="${hobby}"/>
		</c:forEach>
	</td>
</tr>
<tr>
	<td>profession</td>
	<td>
		<c:forEach var="profession" items="${name.uprofession}">
			<c:out value="${profession}"/>
		</c:forEach>
	</td>
</tr>
<tr>
	<td>Address</td>
	<td>${name.uaddress}</td>
</tr>
</table>
</h1>
</body>
<h1 align="center">
<a href="reg">Registration Form</a>
</h1>
</html>