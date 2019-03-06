<%@page import="com.bean.Credentials"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="shortcut icon" type="image/png" href="/OCS/images/logo/logo4.png">
</head>
<body>
<div class="albums-container container-fluid">
    <c:choose>
    <c:when test="${appointmentList != null }">
    <div class="row">
        <div class="col-sm-12">
            <h3><b>Appointments</b></h3>
        </div>
            <c:forEach items="${appointmentList }" var="e">
            <c:if test="${date == e.appointmentDate }">
            <div></c:if>
                <div class="col-sm-4 col-lg-3">
                    <div class="thumbnail">
                        <a href="#">
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
                        <a href="../appointment/reschedule/${e.appointmentId }" class="btn btn-primary btn-sm" role="button">Re-Schedule</a>
                    </div>
                </div>
               <c:if test="${date == e.appointmentDate }">
            </div></c:if>
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