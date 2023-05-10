<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String s = request.getParameter("operation"); 
if(s.equals("Addition"))
{
%>
<jsp:forward page="add.jsp"/>
<%}
else if(s.equals("Substration"))
{
%>
<jsp:forward page="sub.jsp"/>
<%}
else if(s.equals("Multiplication"))
{
%>
<jsp:forward page="mul.jsp"/>
<%}
else
{
%>
<jsp:forward page="div.jsp"/>
<%}
%>
</body>
</html>