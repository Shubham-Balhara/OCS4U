<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD NEW DOCTOR</title>
</head>
<body>
<h3 align="center">ADD NEW DOCTOR</h3><hr>
<h4 align="center" style="color: red;">${msg }</h4>
<form action="addDoctor" method="post">
<table align="center">
<tr><td>Doctor Name:</td><td><input type="text" name="doctorName" required></td></tr>
<tr><td>Date Of Birth:</td><td><input type="date" name="dateOfBirth" required></td></tr>
<tr><td>Date Of Joining:</td><td><input type="date" name="dateOfJoining" required></td></tr>
<tr><td>Gender:</td><td><input type="radio" name="gender" value="male">Male</td><td><input type="radio" name="gender" value="female">Female</td></tr>
<tr><td>Qualification :</td><td><input type="text" name="qualification" required></td></tr>
<tr><td>Specialization :</td><td><input type="text" name="specialization" required></td></tr>
<tr><td>Years of Experience :</td><td><input type="text" name="yearsOfExperience" required></td></tr>
<tr><td>Street:</td><td><input type="text" name="street" required></td></tr>
<tr><td>Location:</td><td><input type="text" name="location" required></td></tr>
<tr><td>City:</td><td><input type="text" name="city" required></td></tr>
<tr><td>State:</td><td><input type="text" name="state" required></td></tr>
<tr><td>PinCode:</td><td><input type="text" name="pincode" required></td></tr>
<tr><td>Mobile No:</td><td><input type="text" name="mobileNumber" required></td></tr>
<tr><td>Email Id:</td><td><input type="text" name="emailId" required></td></tr>
<tr><td><input type="submit" value="ADD DOCTOR"></td></tr>
</table>
</form>
</body>
</html>