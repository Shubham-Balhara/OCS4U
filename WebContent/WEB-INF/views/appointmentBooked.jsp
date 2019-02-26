<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Appointment Booked</h3>
<a href="../main/logout">Home</a>
<h4>Details:</h4>
<c:forEach items="${appointments}" var="appointment">
<c:out value="${appointment.doctorId }"/><br/>
<c:out value="${appointment.patientId }"/><br/>
<c:out value="${appointment.appointmentDate }"/><br/>
<c:out value="${appointment.appointmentSlot }"/><br/>
</c:forEach>
</body>
</html>