<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String s1 = request.getParameter("first");
   String s2 = request.getParameter("second");
   
   int a = Integer.parseInt(s1);
   int b = Integer.parseInt(s2);
%>
<h1 align="center" style="color: Red;">
The Value is Div :
<%= (a/b)%>
</h1>
<h2 align="center">
<a href="classA.jsp">|Home Page|</a>
</h2>
</body>
</html>