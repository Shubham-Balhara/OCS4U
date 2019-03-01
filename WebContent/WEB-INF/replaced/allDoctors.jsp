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
<c:forEach items="${doctors }" var="doctor">
<c:out value="${doctor.doctorName }"/><br/>
<c:out value="${doctor.dateOfBirth }"/><br/>
<c:out value="${doctor.gender }"/><br/>
<c:out value="${doctor.qualification }"/><br/>
<c:out value="${doctor.specialization }"/><br/>
<c:out value="${doctor.yearsOfExperience }"/><br/>
<c:out value="${doctor.mobileNumber }"/><br/>
<c:out value="${doctor.emailId }"/><hr/>
</c:forEach>
<a href="../reporter/home">Home</a>
</body>
</html>