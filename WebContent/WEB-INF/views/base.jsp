<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" type="image/png" href="{%  static 'favicon.ico' %}"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link href='https://fonts.googleapis.com/css?family=Satisfy' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="{% static 'music/style.css' %}"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>OCS - Online Clinic System</title>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">

        <!-- Header -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#topNavBar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <c:choose>
            	<c:when test="${user.userType == \"Admin\" }">
            		<b><strong><a class="navbar-brand" href="../admin/home" style="font-family: cursive;font-size: xx-large;">OCS</a></strong></b>    
            	</c:when>
            <c:when test="${user.userType == \"Patient\" }">
            	<b><strong><a class="navbar-brand" href="../patient/home" style="font-family: cursive;font-size: xx-large;">OCS</a></strong></b>
            </c:when>
            <c:when test="${user.userType == \"Reporter\" }">
            	<b><strong><a class="navbar-brand" href="../reporter/home" style="font-family: cursive;font-size: xx-large;">OCS</a></strong></b>
            </c:when>
            </c:choose>
        </div>

        <!-- Items -->
        <div class="collapse navbar-collapse" id="topNavBar">
            <ul class="nav navbar-nav">
            <c:choose>
            <c:when test="${user.userType == \"Admin\" }">
                <li class="{% block albums_active %}{% endblock %}"><a href="../admin/home"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>&nbsp; Home</a></li>
            </c:when>
            <c:when test="${user.userType == \"Patient\" }">
            <li class="{% block albums_active %}{% endblock %}"><a href="../patient/home"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>&nbsp; Home</a></li>
            </c:when>
            <c:when test="${user.userType == \"Reporter\" }">
            <li class="{% block albums_active %}{% endblock %}"><a href="../reporter/home"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>&nbsp; Home</a></li>
            </c:when>
            </c:choose>
            </ul>
            
            <ul class="nav navbar-nav navbar-right">
            <c:choose>
            	<c:when test="${user != null }">
            	<c:choose>
                <c:when test="${user.userType == \"Patient\"}">
                <li>
                    <a href="../appointment/start">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp; Book Appointment
                    </a>
                </li>
                </c:when>
                <c:when test="${user.userType == \"Admin\" }">
               		 <li>
                        <a href="../admin/add">
                            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp; Add Doctor
                        </a>
                    </li>
                </c:when>
                <c:when test="${user.userType == \"Reporter\" }">
                    <li>
                        <a href="../reporter/applyLeave">
                            <span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>&nbsp; Apply Leave
                        </a>
                    </li>
                    <li>
                        <a href="../reporter/viewLeave">
                            <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>&nbsp; View Leave
                        </a>
                    </li>
                </c:when></c:choose>
                    <li>
                        <a href="../main/profile">
                            <span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp; ${user.userType }
                        </a>
                    </li>
                    <li>
                        <a href="../main/logout">
                            <span class="glyphicon glyphicon-off" aria-hidden="true"></span>&nbsp; Logout
                        </a>
                    </li>
                    </c:when>
                <c:otherwise>
                    <li>
                        <a href="../main/register">
                            <span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp; SignUp
                        </a>
                    </li>
                    <li>
                        <a href="../main/login">
                            <span class="glyphicon glyphicon-off" aria-hidden="true"></span>&nbsp; LogIn
                        </a>
                    </li>
                </c:otherwise>
                </c:choose>
            </ul>
        </div>

    </div>
</nav>
</body>
</html>