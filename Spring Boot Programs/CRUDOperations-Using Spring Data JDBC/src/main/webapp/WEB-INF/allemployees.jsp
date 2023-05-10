<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/welcome.jsp"/>
<h1 align="center" style="color: red;">See All Employees Here
<br><br><br>
<table border="2" width="100%" cellpadding="2" height="150%"> 

<tr style="color: black;">
	<th>ENUMBER</th>
	<th>ENAME</th>
	<th>EPWD</th>
	<th>EAGE</th>
	<th>EMAIL</th>
	<th>EMOBILE</th>
</tr>  
<c:forEach var="emp" items="${Allemployees}">
<tr>
	<td>${emp.enumber}</td>
	<td>${emp.ename}</td>
	<td>${emp.epwd}</td>
	<td>${emp.eage}</td>
	<td>${emp.email}</td>
	<td>${emp.emobile}</td>
</tr>
</c:forEach>
</table>
</h1>
</body>
</html>