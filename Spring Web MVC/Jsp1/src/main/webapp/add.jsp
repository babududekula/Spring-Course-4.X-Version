<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:orange" align="center">
<%int s1 = Integer.parseInt(request.getParameter("first"));
  int s2 = Integer.parseInt(request.getParameter("second"));
  
  out.println("OutPut :"+(s1+s2));
%>
</h1>
<h1 align="center">
<a href="home.html">Home</a>
</h1>
</body>
</html>