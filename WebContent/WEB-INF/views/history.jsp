<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/OCS/script/reportHistory.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="load()">
<c:import url="base.jsp"/>
<table>
<tr><td>PatientId: </td><td><input type="text" name="patientId" id="patientId"></td></tr>
<tr><td><input type="button" onclick="ajax()" value="Find"></td></tr>
</table>
<hr>

<div id="history">

</div>
</body>
</html>