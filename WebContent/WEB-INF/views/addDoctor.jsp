<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
<link rel="shortcut icon" type="image/png" href="/OCS/images/logo/logo4.png">
<head>
<link rel="stylesheet" type="text/css" href="/OCS/css/signUp.css">
<style type="text/css">
body {
     background: url("/OCS/images/pulseRate.jpg") fixed;
    background-size: cover;
}</style>

<script type="text/javascript"language="javascript">  
   function CompareDate() {  
       var doj =document.getElementById("dateOfJoining").value;
       var dob =document.getElementById("birthDate").value;
     
       if (doj <= dob) {  
            alert("Date of joining must be greater than Date of Birth ");  
        }
          
    } 
   
	function isNumberKey(evt)
	{
		var charCode = (evt.which) ? evt.which : evt.keyCode;
		if (charCode != 46 && charCode > 31 
		&& (charCode < 48 || charCode > 57))
		return false;
		return true;
	}  
</script>
</head>
<body>
<h4 align="center" style="color: red;">${msg }</h4>

<div class="container">
            <form class="form-horizontal" role="form" action="addDoctor" method="post">
                <h2>DOCTOR Registration</h2>
                <div class="form-group">
                    <label for="doctorName" class="col-sm-3 control-label">Doctor Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" placeholder="Dr." class="form-control" name="doctorName" required autofocus>
                    </div>
                </div>

              
              
                <div class="form-group">
                    <label for="birthDate" class="col-sm-3 control-label">Date of Birth*</label>
                    <div class="col-sm-9">
                        <input type="date" id="birthDate" class="form-control" name="dateOfBirth" required>
                    </div>
                </div>
                 <div class="form-group">
                    <label for="dateOfJoining" class="col-sm-3 control-label">Date of Joining*</label>
                    <div class="col-sm-9">
                        <input type="date" id="dateOfJoining" class="form-control" name="dateOfJoining" required>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email* </label>
                    <div class="col-sm-9">
                        <input type="email" id="email" placeholder="eg.abc@example.com" class="form-control" name="emailId" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="phoneNumber" class="col-sm-3 control-label">Phone number </label>
                    <div class="col-sm-9">
                        <input type="phoneNumber" id="phoneNumber" placeholder="eg.98xxxxxx12" class="form-control"  name="mobileNumber"  onkeypress="return isNumberKey(event)" maxlength="10" title="Accept number only*" required>
                        <span class="help-block">Your phone number won't be disclosed anywhere </span>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="qualification" class="col-sm-3 control-label">Qualification* </label>
                    <div class="col-sm-9">
                          <label for="qualification">Select Highest Qualification :</label>
                             <select class="form-control form-control-lg" id="qualification" name="qualification" title="required field" required>
                                   <option value="">None</option>
                                  <option value="MBBS - Bachelor of Medicine, Bachelor of Surgery" >MBBS - Bachelor of Medicine, Bachelor of Surgery</option>
                                  <option value="BDS - Bachelor of Dental Surgery" >BDS - Bachelor of Dental Surgery</option>
                                   <option value="BAMS - Bachelor of Ayurvedic Medicine and Surgery" >BAMS - Bachelor of Ayurvedic Medicine and Surgery</option>
                                   <option value="BUMS - Bachelor of Unani Medicine and Surgery" >BUMS - Bachelor of Unani Medicine and Surgery</option>
                                    <option value="BHMS - Bachelor of Homeopathy Medicine and Surgery" >BHMS - Bachelor of Homeopathy Medicine and Surgery</option>
                                    <option value="Bachelor of Occupational Therapy" > Bachelor of Occupational Therapy </option>
                                    <option value="Bachelor of Science in Biotechnology" >Bachelor of Science in Biotechnology</option>
                                    <option value="Bachelor of Technology in Biomedical Engineering" >Bachelor of Technology in Biomedical Engineering</option>
                                    <option value="Bachelor of Science in Microbiology (Non-Clinical)" >Bachelor of Science in Microbiology (Non-Clinical)</option>
                                     </select>
                    </div>
                </div><br>
                <div class="form-group">
                    <label for="specialization" class="col-sm-3 control-label">Specialization* </label>
                    <div class="col-sm-9">
                             <select class="form-control form-control-lg" id="specialization" name="specialization" title="required field" required>
                               <option value="">None</option>
                               <option value="General Surgeons"  >General Surgeons </option>
                               <option value="Emergency Medicine Specialists" >Emergency Medicine Specialists </option>
                               <option value="Family Physicians" >Family Physicians </option>
                               <option value="Gastroenterologists" >Gastroenterologists </option>
                               <option value="Cardiologists" >Cardiologists </option>
                               <option value="Allergists/Immunologists" >Allergists/Immunologists </option>
                               <option value="Anesthesiologists" >Anesthesiologists</option>
                               <option value="Infectious Disease Specialists" >Infectious Disease Specialists </option>
                               <option value="Plastic Surgeons" >Plastic Surgeons</option>
                               <option value="Radiologists" >Radiologists </option>
                               <option value="General Dentist" >General Dentist</option>
                             </select>                
                  </div>
                </div><br>
                <div class="form-group">
                    <label for="yearsOfExperience" class="col-sm-3 control-label">Years Of Experience* </label>
                    <div class="col-sm-9">
                        <input type="number" id="yearsOfExperience" placeholder="eg..5years practice" class="form-control" name="yearsOfExperience"   min="0" max="50"required>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="street" class="col-sm-3 control-label">Street</label>
                    <div class="col-sm-9">
                        <input type="text" id="street" placeholder="eg.H-no,flat-no." class="form-control" name="street" required autofocus>
                    </div>
                </div>
                             <div class="form-group">
                    <label for="location" class="col-sm-3 control-label">Location</label>
                    <div class="col-sm-9">
                        <input type="text" id="location" placeholder="eg.Sector-X ,Colony y" class="form-control" name="location" required autofocus>
                    </div>
                </div>
                              <div class="form-group">
                    <label for="city" class="col-sm-3 control-label">City</label>
                    <div class="col-sm-9">
                        <input type="text" id="city" placeholder="eg.Faridabad,delhi" class="form-control" name="city" required autofocus>
                    </div>
                </div>
                              <div class="form-group">
                    <label for="state" class="col-sm-3 control-label">State</label>
                    <div class="col-sm-9">
                        <input type="text" id="state" placeholder="eg.Haryana" class="form-control" name="state" required autofocus>
                    </div>
                </div>
                              <div class="form-group">
                    <label for="pincode" class="col-sm-3 control-label"  >PinCode</label>
                    <div class="col-sm-9">
                        <input type="text" id="pincode" placeholder="eg.121xx1" class="form-control" name="pincode" min="3" max="10" required>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="femaleRadio" name="gender" value="female" required>Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="maleRadio" name="gender"  value="male" required>Male
                                </label>
                            </div>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <span class="help-block">*Required fields</span>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary btn-block" onclick="CompareDate()">ADD DOCTOR</button>
            </form> <!-- /form -->
        </div> <!-- ./container -->
        </body>