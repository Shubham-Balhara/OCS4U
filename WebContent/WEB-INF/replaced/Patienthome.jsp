<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:import url="../views/base.jsp" />
<h3>This is Patient Home Page</h3>
<a href="../main/logout">Logout</a> | 
<a href="../appointment/start">Book Appointment</a> | 
<a href="../patient/apOfP">View Appointments of Patient</a> |
<a href="../main/update">Update Password</a>
</body>
</html>