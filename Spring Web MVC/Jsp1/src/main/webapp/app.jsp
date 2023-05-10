<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red" text="black">
<%String s=request.getParameter("operation");
if(s.equalsIgnoreCase("add"))
{%>
	<jsp:forward page="add.jsp"/>
<%} 
else if(s.equalsIgnoreCase("sub"))
{%>
	<jsp:forward page="sub.jsp"/>
<%}
else if(s.equalsIgnoreCase("mul"))
{%>
	<jsp:forward page="mul.jsp"/>
<%}
else
{%>
	<jsp:forward page="div.jsp"/>
<%}%>

</body>
</html>