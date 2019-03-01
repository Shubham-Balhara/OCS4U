<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #f2f2f2">
<div><c:forEach items="${leaves }" var="leave">
<c:out value="${leave.leaveFrom }"/><br/>
<c:out value="${leave.leaveTo }"/><br/>
<c:out value="${leave.reason }"/><br/><hr/>
</c:forEach>
</div>

<a href="../../reporter/home" " data-toggle="tooltip" title="Back to HOME"><h3><style="font-family: cursive; color: navy;">Home</h3></a>

</body>
</html>