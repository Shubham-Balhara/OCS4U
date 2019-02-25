<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update Doctor</title>
</head>
<body>
<h3 align="center">====Update DOCTOR Details ====</h3><hr>
<form action="updateDoctorinDB" method="post">
<input type="text" name="doctorId" value="${doctor.doctorId }" style="visibility: hidden;">
<table align="center">
<tr><td>Doctor Name:</td><td><input type="text" name="doctorName" value="${doctor.doctorName}"></td></tr>
<tr><td>Date Of Birth:</td><td><input type="date" name="dateOfBirth" value="${doctor.dateOfBirth}"></td></tr>
<tr><td>Date Of Joining:</td><td><input type="date" name="dateOfJoining" value="${doctor.dateOfJoining}"></td></tr>
<tr><td>Gender:</td><td><input type="radio" name="gender" value="male">Male</td><td><input type="radio" name="gender" value="female">Female</td></tr>
<tr><td>Qualification :</td><td><input type="text" name="qualification" value="${doctor.qualification}"></td></tr>
<tr><td>Specialization :</td><td><input type="text" name="specialization" value="${doctor.specialization}"></td></tr>
<tr><td>Years of Experience :</td><td><input type="text" name="yearsOfExperience" value="${doctor.yearsOfExperience}"></td></tr>
<tr><td>Street:</td><td><input type="text" name="street" value="${doctor.street}"></td></tr>
<tr><td>Location:</td><td><input type="text" name="location" value="${doctor.location}"></td></tr>
<tr><td>City:</td><td><input type="text" name="city" value="${doctor.city}"></td></tr>
<tr><td>State:</td><td><input type="text" name="state" value="${doctor.state}"></td></tr>
<tr><td>PinCode:</td><td><input type="text" name="pincode" value="${doctor.pincode}"></td></tr>
<tr><td>Mobile No:</td><td><input type="text" name="mobileNumber" value="${doctor.mobileNumber}"></td></tr>
<tr><td>Email Id:</td><td><input type="text" name="emailId" value="${doctor.emailId}"></td></tr>
<tr><td><input type="submit" value="Update DOCTOR"></td></tr>
</table>
</form>

</body>
</html>