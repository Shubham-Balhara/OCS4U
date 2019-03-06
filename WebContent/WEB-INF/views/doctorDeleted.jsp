<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deleted</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

</head>
<body>
<%-- <h3>=== ${doctor.doctorId} == Deleted successfully====</h3>
<a href="../home">admin Home</a>
 --%>
<div class="container">
	<div class="row text-center">
        <div class="col-sm-6 col-sm-offset-3">
        <br><br> <h2 style="color:#0fad00">Success</h2>
        <img src="/OCS/images/Yes-tick.jpg">
        <h3>Dr.${doctor.doctorName} </h3>
        <p style="font-size:20px;color:#5C5C5C;">Doctor ID : ${doctor.doctorId}
</p><br><p style="font-size:20px;color:#5C5C5C;">Deleted SUCCESSFULLY !!</p>
        <a href="../home" class="btn btn-success">     Home    </a>
    <br><br>
        </div>
        
	</div>
</div>

</body>
</html>