<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ALL Doctor</title>
</head>
<body>
<h1 align="center">===== View ALL Doctors =======</h1>
<c:forEach items=${doctorList} var="e" >
  <c:out value="${e.doctorName}"/>
   <c:out value="${e.specialization}"/>
   <c:out value="${e.yearsOfExperience}"/>
    <c:out value="${e.mobileNumber}"/>
    <a href="../admin/doctor/${e.doctorId}">View Details</a>
<hr>
</c:forEach>
<hr>



</body>
</html>