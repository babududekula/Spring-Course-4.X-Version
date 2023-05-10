<%@page import="com.pack.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% com.pack.bean.Student std = (Student)request.getAttribute("student"); %>
Number  :<%= std.getHno() %>
Name    :<%= std.getName() %>
C Mar   :<%= std.getC() %>
C++     :<%= std.getCpp() %>
Java    :<%= std.getJava() %>
</body>
</html>