<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Upload Image</h1>
<form action="upload" method="post" enctype="multipart/form-data">
<center>
<table>
<tr>
	<td>File1</td>
	<td><input type="file" name="fileName"/></td>
</tr>
<tr>
	<td>File2</td>
	<td><input type="file" name="fileName"/></td>
</tr>
<tr>
	<td>File3</td>
	<td><input type="file" name="fileName"/></td>
</tr>
<tr>
	<td><input type="submit" value="SUBMIT"/></td>
</tr>
</table>
</center>
</form>
</body>
</html>