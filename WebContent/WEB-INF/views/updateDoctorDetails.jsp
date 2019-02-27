<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<head>
<script type="text/javascript">
$(function(){
	$.validator.setDefaults({
		highlight: function(element){
			$(element)
			.closest('.form-group')
			.addClass('has-error')
		},
		unhighlight: function(element){
			$(element)
			.closest('.form-group')
			.removeClass('has-error')
		}
	});
	
	$.validate({
		rules:
		{	
		    password: "required",
			birthDate: "required",
			weight: {
			    required:true,
			    number:true
			},
			height:  {
			    required:true,
			    number:true
			},
			email: {
				required: true,
				email: true
			}
		},
			messages:{			
				email: {
				required: true,
				email: true
			}
		},
				password: {
					required: " Please enter password"
				},
				birthDate: {
					required: " Please enter birthdate"
				},
				email: {
					required: ' Please enter email',
					email: ' Please enter valid email'
				},
				weight: {
					required: " Please enter your weight",
					number: " Only numbers allowed"
				},
				height: {
					required: " Please enter your height",
					number: " Only numbers allowed"
				},
			}
			
	});
});</script>
<!--Custom styles-->
<link rel="stylesheet" type="text/css" href="/OCS/css/signUp.css">
<style type="text/css">
body {
     background: url("/OCS/images/pulseRate.jpg") fixed;
    background-size: cover;
}

</style>
</head><body>
<h4 align="center" style="color: red;">${msg }</h4>

<div class="container">
            <form class="form-horizontal" role="form" action="updateDoctorinDB" method="post">
                <h2>Update DOCTOR Details</h2>
                <div class="form-group">
                    <label for="doctorId" class="col-sm-3 control-label">Doctor ID</label>
                    <div class="col-sm-9">
                        <input type="text" id="doctorId" value="${doctor.doctorId }" class="form-control" name="doctorId" required autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label for="doctorName" class="col-sm-3 control-label">Doctor Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" value="${doctor.doctorName}"  class="form-control" name="doctorName" required autofocus>
                    </div>
                </div>

              
              
                <div class="form-group">
                    <label for="birthDate" class="col-sm-3 control-label">Date of Birth*</label>
                    <div class="col-sm-9">
                        <input type="date" id="birthDate" value="${doctor.dateOfBirth}" class="form-control" name="dateOfBirth" required>
                    </div>
                </div>
                 <div class="form-group">
                    <label for="dateOfJoining" class="col-sm-3 control-label">Date of Joining*</label>
                    <div class="col-sm-9">
                        <input type="date" id="dateOfJoining" value="${doctor.dateOfJoining}" class="form-control" name="dateOfJoining" required>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email* </label>
                    <div class="col-sm-9">
                        <input type="email" id="email" value="${doctor.emailId}" class="form-control" name="emailId" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="phoneNumber" class="col-sm-3 control-label">Phone number </label>
                    <div class="col-sm-9">
                        <input type="phoneNumber" id="phoneNumber"  value="${doctor.mobileNumber}" class="form-control"  name="mobileNumber" required>
                        <span class="help-block">Your phone number won't be disclosed anywhere </span>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="qualification" class="col-sm-3 control-label">Qualification* </label>
                    <div class="col-sm-9">
                        <input type="text" id="qualification" value="${doctor.qualification}" class="form-control" name="qualification" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="specialization" class="col-sm-3 control-label">Specialization* </label>
                    <div class="col-sm-9">
                        <input type="text" id="specialization" value="${doctor.specialization}" class="form-control" name="specialization" required>
                    </div>
                </div><div class="form-group">
                    <label for="yearsOfExperience" class="col-sm-3 control-label">Years Of Experience* </label>
                    <div class="col-sm-9">
                        <input type="text" id="yearsOfExperience" value="${doctor.yearsOfExperience}"  class="form-control" name="yearsOfExperience" required>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="street" class="col-sm-3 control-label">Street</label>
                    <div class="col-sm-9">
                        <input type="text" id="street" value="${doctor.street}" class="form-control" name="street" required autofocus>
                    </div>
                </div>
                             <div class="form-group">
                    <label for="location" class="col-sm-3 control-label">Location</label>
                    <div class="col-sm-9">
                        <input type="text" id="location" value="${doctor.location}" class="form-control" name="location" required autofocus>
                    </div>
                </div>
                              <div class="form-group">
                    <label for="city" class="col-sm-3 control-label">City</label>
                    <div class="col-sm-9">
                        <input type="text" id="city" value="${doctor.city}"class="form-control" name="city" required autofocus>
                    </div>
                </div>
                              <div class="form-group">
                    <label for="state" class="col-sm-3 control-label">State</label>
                    <div class="col-sm-9">
                        <input type="text" id="state" value="${doctor.state}" class="form-control" name="state" required autofocus>
                    </div>
                </div>
                              <div class="form-group">
                    <label for="pincode" class="col-sm-3 control-label">PinCode</label>
                    <div class="col-sm-9">
                        <input type="text" id="pincode" value="${doctor.pincode}" class="form-control" name="pincode" required autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="femaleRadio" name="gender" value="Female">Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="maleRadio" name="gender"  value="Male">Male
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
                <button type="submit" class="btn btn-primary btn-block">Update</button>
            </form> <!-- /form -->
        </div> <!-- ./container -->
        </body>