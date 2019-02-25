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
	<c:out value="${e.doctorName}" />
	<c:out value="${e.doctorId}" />
	<c:out value="${e.specialization}" />
	<c:out value="${e.yearsOfExperience}" />
	<c:out value="${e.mobileNumber}" />
	<c:out value="${e.dateOfBirth}" />
	<c:out value="${e.dateOfJoining}" />
	<c:out value="${e.gender}" />
	<c:out value="${e.street}" />
	<c:out value="${e.location}" />
	<c:out value="${e.city}" />
	<c:out value="${e.state}" />
	<c:out value="${e.pincode}" />
	<c:out value="${e.mobileNumber}" />
	<c:out value="${e.emailId}" />
<hr>
<a href="../admin/updateDoctor/${e.doctorId}">Update Doctor details</a> | 
<a href="../admin/deleteDoctor/${e.doctorId}">delete Doctor</a>
</body>
</html>