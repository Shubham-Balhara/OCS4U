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
<script type="text/javascript">
	function fun(id) {
		document.getElementById(id).style.visibility = "hidden";
		var formId = "form"+id;
		document.getElementById(formId).style.visibility = "visible";
	}
</script>
<c:import url="base.jsp"/>
<div class="albums-container container-fluid">
    <c:choose>
    <c:when test="${reports != null }">
    <div class="row">
        <div class="col-sm-12">
            <h3><b>Pending Reports:</b></h3>
        </div>
            <c:forEach items="${reports }" var="e">
                <div class="col-sm-4 col-lg-3">
                    <div class="thumbnail">
                        <a href="../appointment/reschedule/${e.appointmentId }">
                            <div style="height: 200px">
                                <center><img src="/OCS/images/appointment.gif" class="img-responsive" style="height: 190px"></center>
                                <hr>
                            </div>
                        </a>
                        <div class="caption">
                            <h2><b>Appointment</b></h2>
                            <h5 style="color:#595959">&emsp;Date: ${e.appointmentDate}</h5>
                        <c:choose>
                        	<c:when test="${e.appointmentSlot == 1}">
                        	<h5 style="color:#595959">&emsp;Time: 11:00 AM - 11:30 AM</h5>
                        	</c:when>
                        	<c:when test="${e.appointmentSlot == 2}">
                        	<h5 style="color:#595959">&emsp;Time: 11:30 AM - 12:00 PM</h5>
                        	</c:when>
                        	<c:when test="${e.appointmentSlot == 3}">
                        	<h5 style="color:#595959">&emsp;Time: 12:00 PM - 12:30 PM</h5>
                        	</c:when>
                        	<c:when test="${e.appointmentSlot == 4}">
                        	<h5 style="color:#595959">&emsp;Time: 12:30 PM - 01:00 PM</h5>
                        	</c:when>
                        	<c:when test="${e.appointmentSlot == 5}">
                        	<h5 style="color:#595959">&emsp;Time: 03:00 PM - 03:30 PM</h5>
                        	</c:when>
                        	<c:when test="${e.appointmentSlot == 6}">
                        	<h5 style="color:#595959">&emsp;Time: 03:30 PM - 04:00 PM</h5>
                        	</c:when>
                        	<c:when test="${e.appointmentSlot == 7}">
                        	<h5 style="color:#595959">&emsp;Time: 04:00 PM - 04:30 PM</h5>
                        	</c:when>
                        	<c:when test="${e.appointmentSlot == 8}">
                        	<h5 style="color:#595959">&emsp;Time: 04:30 PM - 05:00 PM</h5>
                        	</c:when>
                        </c:choose>
                        </div>
                        <button class="btn btn-success" id="${e.appointmentId }" onclick="fun(this.id)">Fill Report</button>
                        <div id="form${e.appointmentId }" style="visibility: hidden;">
                        	<form action="fillReport" method="post">
                        		<input type="text" value="${e.appointmentId }" style="display: none;" name="id">
                        		<input type="text" value="${e.doctorId }" style="display: none;" name="doctor">
                        		<input type="text" value="${e.patientId }" style="display: none;" name="patient">
                        		<input type="text" value="${e.appointmentDate }" style="display: none;" name="appointmentDate">
                        		<input type="text" value="${e.appointmentSlot }" style="display: none;" name="appointmentSlot">
                        		<label for="aliments">Ailment: </label>
                        		<input type="text" name="ailments" required><br>
                        		<label for="medicines">Medicines: </label>
                        		<input type="text" name="medicines" required>
                        		<input type="submit" value="Fill">
                        	</form>
                        </div>
                    </div>
                </div>
            </c:forEach>
            </c:when>
        <c:otherwise>
            <div class="jumbotron">
                <h2><b>No Appointments</b></h2>
            </div>
       </c:otherwise>
</c:choose>
    </div>
</div>
</body>
</html>