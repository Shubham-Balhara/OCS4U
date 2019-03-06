<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="shortcut icon" type="image/png" href="/OCS/images/logo/logo4.png">
</head>
<body style="background-color: #f2f2f2">
	<c:import url="base.jsp"></c:import>
	<div class="container">

		<c:forEach items="${doctors }" var="doctor">
			<h2 style="font-family: monospace; color:maroon;">
				<c:out value="${doctor.doctorName }" />
			</h2>
			<br />
			<a href="../reporter/leaveByDoctor/${doctor.doctorId }" data-toggle="tooltip" title="Date: From-To"><h5><style="font-family: cursive; color: navy;">View Leave Details</h5></a>
			<hr>
		</c:forEach>
	</div>
</body>
</html>