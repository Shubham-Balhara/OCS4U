<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>leave apply</title>
<link rel="shortcut icon" type="image/png" href="/OCS/images/logo/logo4.png">
</head>
<body style="background-color: #f2f2f2">
<br><br>
<div class="container" align="center">
<c:forEach items="${leaves }" var="leave">
 <label class="sr-only" for="from">Leave From : </label>

<c:out value="${leave.leaveFrom }"/><br/>
 <label class="sr-only" for="leaveTo">To  : </label>

<c:out value="${leave.leaveTo }"/><br/>

 <label class="sr-only" for="reason">Reason : </label>
<c:out value="${leave.reason }"/><br/><hr/>
</c:forEach>
</div>

<a href="../../reporter/home" " data-toggle="tooltip" title="Back to HOME"><h3><style="font-family: cursive; color: navy;">Home</h3></a>

</body>
</html>