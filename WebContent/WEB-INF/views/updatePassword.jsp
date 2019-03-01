<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Doctor</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

<script type="text/javascript">
var check = function() {
	  if (document.getElementById('password').value ==
	    document.getElementById('confirmPassword').value) {
	    document.getElementById('message').style.color = 'green';
	    document.getElementById('message').innerHTML = 'matching';
	  } else {
	    document.getElementById('message').style.color = 'red';
	    document.getElementById('message').innerHTML = 'not matching';
	  }
	}
</script>
</head>
<body style="background-color: #f2f2f2;">
<div class="container"><h1 align="center">===== UPDATE PASSWORD ===== </h1><div class="row">
<a href="#">Home</a>&nbsp; | &nbsp;
<a href="logout">LogOut</a></div> </div><hr>
<h4 align="center" style="color: red;">${msg}</h4><br>
<div class="container">
<form action="updatePasswordInDB" >
<input type="text" name="userId" value="${userId}" style="visibility: hidden;"/>
<table align="center">
<tr><td>Old Password : </td><td><input type="password" name="password" class="form-control" placeholder="Current Password"  required/></td></tr>
<tr><td>New Password : </td><td><input type="password" class="form-control" placeholder="New Password" id="password" name="newPassword" onkeyup='check();'  required/></td></tr>
<tr><td>Re-Enter New Password : </td><td><input type="password"  class="form-control" placeholder="Confirm Password" name="confirmPassword" id="confirmPassword" onkeyup='check();' required/>  <span id='message'></span></td></tr>
<tr><td><input type="submit" class="btn btn-success"  value="Update"/></td></tr>
</table>
</form></div>
<hr>

</body>
</html>