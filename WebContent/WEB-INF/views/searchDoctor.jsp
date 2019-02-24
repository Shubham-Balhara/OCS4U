<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">Search Doctor</h3>
<form action="findDoctor" method="post">
<table>
<tr><td><select name="doctorType">
	<option value="A">A</option>
	<option value="B" selected="selected">B</option>
	<option value="C">C</option>
	<option value="D">D</option>
	<option value="E">E</option></select>
	</td><td><input type="submit" value="Search"></td></tr>
</table>
</form>
</body>
</html>