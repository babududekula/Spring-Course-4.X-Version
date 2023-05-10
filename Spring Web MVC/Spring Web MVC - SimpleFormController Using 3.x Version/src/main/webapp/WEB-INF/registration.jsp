<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:red;" align="center" >Welcome To Registration Form</h2>
<h3 align="center" style= "color:green;">Registration Form</h3>
<form:form action="reg" method="POST" commandName="user">
<center>
<table>
<tr>
	<td>User Name</td>
	<td><form:input path="uname" size="20" placeholder="Enter Name"/></td><br>
</tr>
<tr>
	<td>User pword</td>
	<td><form:password path="upwd" size="20"  showPassword="false" placeholder="Enter Password"/></td><br>
</tr>
<tr>
	<td>Are You Married</td>
	<td><form:checkbox path="metitalstatus1"/></td><br>
</tr>
<tr>
	<td>Are You Single</td>
	<td><form:checkbox path="meritalstatus2" value="single"/></td><br>
</tr>

<tr>
	<td>User Qualification</td>
	<td>
		<form:checkbox path="uqual1" value="Bsc"/>BSC
		<form:checkbox path="uqual1" value="Btech"/>BTech
		<form:checkbox path="uqual1" value="Mca"/>MCA
		<form:checkbox path="uqual1" value="Degree"/>Degree
	</td>
</tr>
<tr>
	<td>Qualification</td>
	<td><form:checkboxes path="uqual2" items="${list}"/></td>
</tr>
<tr>
	<td>Gender</td>
	<td>
	<form:radiobutton path="ugender" value="Male"/>Male
	<form:radiobutton path="ugender" value="Female"/>Female
	</td>
</tr>
<tr>
	<td>User Work Location</td>
	<td><form:radiobuttons path="ulocation" items="${Locations}"/></td>
</tr>
<tr>
	<td>User Skills</td>
	<td>
		<form:select path="uskills" multiple="true">
			<form:option value="c++">C++</form:option>
			<form:option value="Java">Java</form:option>
			<form:option value=".Net">.Net</form:option>
			<form:option value="Python">Python</form:option>
		</form:select>
	</td>
</tr>
<tr>
	<td>User Hobbies</td>
	<td><form:select path="uhobby" items="${uhobby}" multiple="true"/></td>
</tr>
<tr>
	<td>UProffession</td>
	<td>
		<form:select path="uprofession" multiple="false">
			<form:options items="${list2}" />
		</form:select>
	</td>
</tr>
<tr>
	<td>Address</td>
	<td><form:textarea path="uaddress"/></td>
</tr>
<tr>
	<td><input type="submit" value="Register"/></td>
</tr>
</table>
</center>
</form:form>
</body>
</html>