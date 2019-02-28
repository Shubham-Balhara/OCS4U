<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bootstrap basic table example</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<style type="text/css">
body {
     background: url("/OCS/images/doctor-background.jpeg") fixed;
    background-size: cover;
}
#tab tr:nth-child(even) { background-color: gray;}
</style>

</head>
<body>

<div class="container ">
<table class="table table-bordered table-striped table-hover" id="tab">
  <tr>
      <th>Appointment ID</th>
      <th>Doctor ID</th>
     <th>Appointment Date</th>
      <th>Slot</th>
  </tr>
  <tr class="info">
  <c:forEach items="${appointmentList}" var="e" >
      <td><c:out value="${e.doctorId}"/></td>
      <td> <c:out value="${e.appointmentId}"/></td>
      <td><c:out value="${e.appointmentDate}"/></td>
      <td> <c:out value="${e.appointmentSlot}"/></td>
      </c:forEach>
  </tr>
  </table>
</div><br /><br />
<hr>
<div class="col-sm-5 col-xs-6 tital "><a href="../../admin/home" class="btn btn-success" role="button">HOME</a></div>


</body>
</html>

