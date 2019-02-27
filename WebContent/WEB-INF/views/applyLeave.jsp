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
<h3>Apply for Leave Here</h3>
<h4>${msg }</h4>
<form action="leave" method="post">
<table>
<tr><td><select name="doctorId">
	<c:forEach items="${doctors }" var="doctor">
		<option value="${doctor.doctorId }">${doctor.doctorName }</option>
	</c:forEach>
</select></td></tr>
<tr><td><input type="date" name="leaveFrom"></td><td><input type="date" name="leaveTo"></td></tr>
<tr><td><input type="textarea" name="reason"></td></tr>
<tr><td><input type="submit" value="Add"></td></tr>
</table>
</form>
</body>
</html>