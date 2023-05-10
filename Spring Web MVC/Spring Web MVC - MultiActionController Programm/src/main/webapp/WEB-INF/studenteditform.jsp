<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow" text="black">
<h1 align="center">
<u>Student Updation Form</u>
<br><br>
<form action="update" method="post">
<tr>
	<td>Student Id</td>
	<td>:&nbsp&nbsp${student.sid} <input type="hidden" name="sid" value="${student.sid}"/></td><br>
</tr>
<tr>
	<td>Student Name</td>&nbsp&nbsp:
	<td><input type="text" name="sname" value="${student.sname}"/></td><br>
</tr>
<tr>
	<td>Student sal</td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:
	<td><input type="text" name="ssal" value="${student.ssal}"/></td><br>
</tr>
<tr>
	<td>Student saddr</td>&nbsp&nbsp:
	<td><input type="text" name="saddr" value="${student.saddr}"/></td><br>
</tr>
<tr>
	
	<td><input type="submit" value="UPDATE"/></td>
</tr>

</form>
</h1>
</body>
</html>