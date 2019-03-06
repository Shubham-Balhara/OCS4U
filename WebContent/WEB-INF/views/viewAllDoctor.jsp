<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ALL Doctor</title>
<link rel="shortcut icon" type="image/png" href="/OCS/images/logo/logo4.png">
</head>
<body>
<div class="albums-container container-fluid">
    <c:choose>
    <c:when test="${doctorList != null }">
    <div class="row">
        <div class="col-sm-12">
            <h3><b>Doctors:</b></h3>
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
                        <a href="../admin/doctor/${e.doctorId}" class="btn btn-primary btn-sm" role="button">View Details</a>
                    </div>
                </div>
            </c:forEach>
            </c:when>
        <c:otherwise>
            <div class="jumbotron col-sm-12">
                <h2><b>No Doctors</b></h2>
            </div>
        </c:otherwise>
        </c:choose>
    </div>
</div>
</body>
</html>