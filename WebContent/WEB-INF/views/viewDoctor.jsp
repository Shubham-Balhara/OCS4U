<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor details</title>
</head>
<body>
	<h3 align="center">=====doctor details =====</h3>
	<hr>
	<c:out value="${e.doctorName}" /><br/>
	<c:out value="${e.doctorId}" /><br/>
	<c:out value="${e.specialization}" /><br/>
	<c:out value="${e.yearsOfExperience}" /><br/>
	<c:out value="${e.mobileNumber}" /><br/>
	<c:out value="${e.dateOfBirth}" /><br/>
	<c:out value="${e.dateOfJoining}" /><br/>
	<c:out value="${e.gender}" /><br/>
	<c:out value="${e.street}" /><br/>
	<c:out value="${e.location}" /><br/>
	<c:out value="${e.city}" /><br/>
	<c:out value="${e.state}" /><br/>
	<c:out value="${e.pincode}" /><br/>
	<c:out value="${e.mobileNumber}" /><br/>
	<c:out value="${e.emailId}" /><br/>
<hr>
<a href="../updateDoctor/${e.doctorId}">Update Doctor details</a> | 
<a href="../deleteDoctor/${e.doctorId}">delete Doctor</a>
</body>
</html>