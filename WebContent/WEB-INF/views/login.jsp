<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h3 align="center">Login</h3>
<h4 align="center" style="color: red;">${msg }</h4>
<form action="validate" method="post">
<table>
<!-- <tr><td>UserType:</td><td><select name="userType">
	<option value="Doctor">Doctor</option>
	<option value="Patient" selected="selected">Patient</option>
	<option value="Reporter">Reporter</option>
	<option value="Admin">Admin</option></select>
</td></tr> -->
<tr><td>UserId:</td><td><input type="text" name="userId"></td></tr>
<tr><td>Password:</td><td><input type="password" name="password"></td></tr>
<tr><td><input type="submit" value="Login"></td></tr>
</table>
</form>
<h5><a href="../main/register">Register</a></h5>
</body>
</html>