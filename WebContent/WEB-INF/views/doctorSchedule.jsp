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
<c:forEach items="${appointments}" var="appointment">
<c:out value="${appointment.doctorId }"/><br/>
<c:out value="${appointment.patientId }"/><br/>
<c:out value="${appointment.appointmentDate }"/><br/>
<c:out value="${appointment.appointmentSlot }"/><br/>
<form action="bookSchedule" method="post">
<input type="text" name="doctorId" style="visibility: hidden;" value="${appointment.doctorId }">
<input type="text" name="patientId" style="visibility: hidden;" value="${appointment.patientId }">
<input type="text" name="appointmentDate" style="visibility: hidden;" value="${appointment.appointmentDate }">
<input type="text" name="appointmentSlot" style="visibility: hidden;" value="${appointment.appointmentSlot }">
<input type="submit" name="Book Schedule">
</form>
<hr/>
</c:forEach>
</body>
</html>