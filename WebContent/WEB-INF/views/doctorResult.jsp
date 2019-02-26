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
<h4>Search Results:</h4>
<c:forEach items="${doctors }" var="doctor">
<%-- <c:url value="/appointment/doctorSchedule" var="url"><c:param name="doctorid" value="${doctor.doctorId }"/></c:url> --%>
<form action="doctorSchedule" method="post">
<h4>${doctor.doctorName }</h4>
<h5>${doctor.qualification }</h5>
<input type="text" value="${doctor.doctorId }" style="visibility: hidden;" name="doctorId">
<input type="submit" value="Check Schedule">
</form>
</c:forEach>
</body>
</html>