<%@page import="org.springframework.scheduling.annotation.Schedules"%>
<%@page import="com.bean.Schedule"%>
<%@page import="java.util.List"%>
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
<h3>Doctor Schedule Page</h3>

<%-- <c:forEach items="${schedules }" var="schedule">
<c:out value="${schedule.slots }"></c:out>
<c:out value="${schedule.scheduleId }"></c:out>
<c:out value="${schedule.doctorId }"></c:out>
<c:out value="${schedule.availableDays }"></c:out>
</c:forEach> --%>
<!-- <script type="text/javascript">
	function fun() {
		document.getElementById("slot").style.visibility = 'visible';
	}
</script> -->

<h4>${msg}</h4>
<form action="checkSchedule" method="post">
<input type="text" name="doctorId" value="${doctorId }" style="visibility: hidden;">
<table>
<tr><td><input type="date" name="date" ><!-- onchange="fun()"> --></td></tr>
<tr><td><select name="slots" id="slot" ><!-- style="visibility: hidden;" onchange="fun1()" -->
<option>select slot</option>
<option value="1" id="1">1</option>
<option value="2" id="2">2</option>
<option value="3" id="3">3</option>
<option value="4" id="4">4</option>
<option value="5" id="5">5</option>
<option value="6" id="6">6</option>
<option value="7" id="7">7</option>
<option value="8" id="8">8</option>
</select></td></tr>
<tr><td><input type="submit" value="Book"></td></tr>
</table>
</form>
</body>
</html>