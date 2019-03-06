<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link href='https://fonts.googleapis.com/css?family=Satisfy' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="{% static 'music/style.css' %}"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Print report</title>
</head>
<body>
<div id="report">
<h2 align="center" style="margin-top: 30px;"><b>OCS</b> - Online Clinic System</h2>
<h3 align="center">Report of Diagnosis</h3><hr>
<table align="center">
<tr><td>Appointment Id: </td><td>${report.appointmentId }</td></tr>
<tr><td>User ID: </td><td>${user.userId }</td></tr>
<tr><td>Appointment Date: </td><td>${report.appointmentDate }</td></tr>
<tr><td>Appointment Time: </td><td>
 <c:choose>
                        	<c:when test="${report.appointmentSlot == 1}">
                        	&emsp;Time: 11:00 AM - 11:30 AM
                        	</c:when>
                        	<c:when test="${report.appointmentSlot == 2}">
                        	&emsp;Time: 11:30 AM - 12:00 PM
                        	</c:when>
                        	<c:when test="${report.appointmentSlot == 3}">
                        	&emsp;Time: 12:00 PM - 12:30 PM
                        	</c:when>
                        	<c:when test="${report.appointmentSlot == 4}">
                        	&emsp;Time: 12:30 PM - 01:00 PM
                        	</c:when>
                        	<c:when test="${report.appointmentSlot == 5}">
                        	&emsp;Time: 03:00 PM - 03:30 PM
                        	</c:when>
                        	<c:when test="${report.appointmentSlot == 6}">
                        	&emsp;Time: 03:30 PM - 04:00 PM
                        	</c:when>
                        	<c:when test="${report.appointmentSlot == 7}">
                        	&emsp;Time: 04:00 PM - 04:30 PM
                        	</c:when>
                        	<c:when test="${report.appointmentSlot == 8}">
                        	&emsp;Time: 04:30 PM - 05:00 PM
                        	</c:when>
</c:choose>
</td></tr>
</table><hr>
</div>
<script type="text/javascript">
	function fun() {
		var content = document.getElementById("report").innerHTML;
		document.body.innerHTML = content;
		window.print();
	}
</script>
<div align="center">
	<button class="btn btn-primary" onclick="fun()">Print</button>
	<a href="../../patient/home" class="btn btn-success" style="margin-left: 20px">Home</a>
</div>
</body>
</html>