<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<table width="100%" height="650">
<tr height="20%">
	<td colspan="2" align="center" bgcolor="maroon">
	<tiles:insertAttribute name="header"/>
	</td>
</tr>
<tr height="65%">
	<td width="20%" align="center" bgcolor="yellow">
	<tiles:insertAttribute name="menu"/>
	</td>
	<td width="80%" align="center" bgcolor="pink">	
	<tiles:insertAttribute name="body"/>
	</td>
</tr>
<tr height="15%">
	<td colspan="2" align="center" bgcolor="red">
	<tiles:insertAttribute name="footer"/>
	</td>
</tr>
</table>
</form>
</body>
</html>