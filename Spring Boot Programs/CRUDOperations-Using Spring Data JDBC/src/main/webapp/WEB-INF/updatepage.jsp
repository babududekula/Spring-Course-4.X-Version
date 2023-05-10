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
<h1 align="center">Welcome To Update Form</h1>
<form action="editform" method="post">
<table align="center">
<tr>
	<td>User Number</td>
	<td><input type="text" name="enumber"/></td>
</tr>
<tr>
	<td><input type="submit" value="GetEditForm"/></td>
</tr>
</table>
</form>
</body>
</html>