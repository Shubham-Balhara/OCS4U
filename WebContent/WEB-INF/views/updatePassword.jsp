<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Doctor</title>
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
<body>
<h1 align="center">===== UPDATE PASSWORD ===== </h1> <hr>
<h4 align="center" style="color: red;">${msg}</h4><br>
<form action="updatePasswordInDB" >
<table align="center">
<tr><td>Old Password : </td><td><input type="password" name="password"  required/></td></tr>
<tr><td>New Password : </td><td><input type="password"  id="password" name="newPassword" onkeyup='check();'  required/></td></tr>
<tr><td>Re-Enter New Password : </td><td><input type="password" name="confirmPassword" id="confirmPassword" onkeyup='check();' required/>  <span id='message'></span></td></tr>
<tr><td><input type="submit" value="Update"/></td><td style="visibility: hidden;"><input type="text" name="userId" value="${userId}" required/></td></tr>
</table>
</form>
<hr>
<a href="#">Home</a>
<a href="/main/logout">LogOut</a>

</body>
</html>