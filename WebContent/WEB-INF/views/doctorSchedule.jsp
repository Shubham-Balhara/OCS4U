<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <c:forEach items="${appointments}" var="appointment">
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
 --%>
<c:import url="base.jsp"/>
<div class="albums-container container-fluid">
    <c:choose>
    <c:when test="${fn:length(appointments)>0}">
    <div class="row">
        <div class="col-sm-12">
            <h3><b>Available Slots:</b></h3>
        </div>
            <c:forEach items="${appointments }" var="e">
                <div class="col-sm-4 col-lg-3">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3><b>Slot:</b></h3>
                            <h4 style="color:#595959">&emsp;Date: ${e.appointmentDate}</h4>
                            <h5 style="color:#595959">&emsp;Time: 
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
                            </h5>
                        </div>
                        <form action="bookSchedule" method="post">
							<input type="text" name="doctorId" style="visibility: hidden;" value="${e.doctorId }">
							<input type="text" name="patientId" style="visibility: hidden;" value="${e.patientId }">
							<input type="text" name="appointmentDate" style="visibility: hidden;" value="${e.appointmentDate }">
							<input type="text" name="appointmentSlot" style="visibility: hidden;" value="${e.appointmentSlot }">
							<input type="submit" value="Book Schedule" class="btn btn-primary btn-sm">
						</form>
                    </div>
                </div>
            </c:forEach>
            </c:when>
        <c:otherwise>
            <div class="jumbotron col-sm-12">
                <h2><b>Sorry ! No Slots Available Right Now.</b></h2>
            </div>
        </c:otherwise>
        </c:choose>
    </div>
</div>

</body>
</html>