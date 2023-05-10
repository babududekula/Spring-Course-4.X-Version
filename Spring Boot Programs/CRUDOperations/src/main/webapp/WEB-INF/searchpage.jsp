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
<br><br><br>
<h1 align="center" style="color: red;">Welcome To Search Form</h1>
<br>
<form method="post" action="search">
<table align="center">
<tr>
	<td>User Number</td>
	<td><input type="text" name="enumber"/></td>
</tr>
<tr>
	<td><input type="submit" value="SEARCH"/></td>
</tr>
</table>
</form>
</body>
</html>