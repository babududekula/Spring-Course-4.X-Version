<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/welcome.jsp"/>
<h1 align="center">Welcome To Employee Details</h1>
<h1 align="center" style="color: silver;">
<table align="center" border="1">
<tr>
	<td>User Number</td>
	<td>${name.enumber}</td>
</tr>
<tr>
	<td>User Name</td>
	<td>${name.ename}</td>
</tr>
<tr>
	<td>User Password</td>
	<td>${name.epwd}</td>
</tr>
<tr>
	<td>User Age</td>
	<td>${name.eage}</td>
</tr>
<tr>
	<td>User Mail</td>
	<td>${name.email}</td>
</tr>
<tr>
	<td>User Mobile</td>
	<td>${name.emobile}</td>
</tr>
</table>
</h1>

</body>
</html>