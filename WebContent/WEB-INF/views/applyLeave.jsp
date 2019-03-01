<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Apply for Leave</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>

<body>

<c:import url="base.jsp"></c:import>
 <div class="container">
<h3>Apply for Leave Here</h3>
<h4>${msg }</h4>
<form action="leave" method="post">
<table class="table table-striped">
<tr><td><label for="doctorName">Name</label></td><td><select name="doctorId">
	<c:forEach items="${doctors }" var="doctor">
		<option value="${doctor.doctorId }">${doctor.doctorName }</option>
	</c:forEach>
</select></td></tr>
<tr><td><label for="fromDate">From</label></td><td><input type="date" name="leaveFrom"></td></tr>
<tr><td><label for="toDate">To</label></td><td><input type="date" name="leaveTo"></td></tr>
<tr><td><label for="reason">Reason*</label></td><td><textarea class="form-control rounded-0" id="reason" rows="5" required></textarea></td></tr>
<tr><td>  <button type="submit" class="btn btn-primary">Apply</button></td></tr>
</table>
</form>
<a href="../reporter/home">Home</a>

</div></body>
</html>