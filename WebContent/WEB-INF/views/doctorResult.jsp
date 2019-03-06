<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="shortcut icon" type="image/png" href="/OCS/images/logo/logo4.png">
</head>
<body>
<%-- <h4>Available Doctors:</h4>
<c:forEach items="${doctors }" var="doctor">
<form action="doctorSchedule" method="post">
<h4>${doctor.doctorName }</h4>
<h5>${doctor.qualification }</h5>
<input type="text" value="${doctor.doctorId }" style="visibility: hidden;" name="doctorId">
<input type="submit" value="Check Schedule">
</form>
</c:forEach>

 --%>
 <c:import url="base.jsp"/>
<div class="albums-container container-fluid">
    <c:choose>
    <c:when test="${doctorList != null }">
    <div class="row">
        <div class="col-sm-12">
            <h3><b>Available Doctors:</b></h3>
        </div>
            <c:forEach items="${doctorList }" var="e">
                <div class="col-sm-4 col-lg-3">
                    <div class="thumbnail">
                        <a href="../admin/doctor/${e.doctorId}">
                            <div style="height: 200px">
                                <c:choose>
                                <c:when test="${e.gender == \"male\" }">
                                <center><img src="/OCS/images/doctor_male.png" class="img-responsive" style="height: 190px"></center>
                                </c:when>
                                <c:when test="${e.gender ==\"female\" }">
                                <center><img src="/OCS/images/doctor_female.png" class="img-responsive" style="height: 190px"></center>
                                </c:when>
                                </c:choose>
                                <hr>
                            </div>
                        </a>
                        <div class="caption">
                            <h2><b>Dr. ${e.doctorName}</b></h2>
                            <h4 style="color:#595959">&emsp;Specailization: ${e.specialization}</h4>
                            <h5 style="color:#595959">&emsp;Experience: ${e.yearsOfExperience}years</h5>
                            <h5><i><u>Contact:</u></i></h5>
                            <h5 style="color:#595959">&emsp;Mobile: ${e.mobileNumber}</h5>
                            <h5 style="color:#595959">&emsp;Email: ${e.emailId}</h5>
                        </div>
                        <form action="doctorSchedule" method="post">
							<input type="text" value="${e.doctorId }" style="visibility: hidden;" name="doctorId">
							<input type="submit" value="Check Schedule" class="btn btn-primary btn-sm">
						</form>
                    </div>
                </div>
            </c:forEach>
            </c:when>
        <c:otherwise>
            <div class="jumbotron col-sm-12">
                <h2><b>Sorry ! No Doctors Availabe Right Now.</b></h2>
            </div>
        </c:otherwise>
        </c:choose>
    </div>
</div>
</body>
</html>