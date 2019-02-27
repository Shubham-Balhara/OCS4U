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
<style type="text/css">
body {
     background: url('https://static-communitytable.parade.com/wp-content/uploads/2014/03/rethink-target-heart-rate-number-ftr.jpg') fixed;
    background-size: cover;
}

*[role="form"] {
    max-width: 530px;
    padding: 15px;
    margin: 0 auto;
    border-radius: 0.3em;
    background-color: #f2f2f2;
}

*[role="form"] h2 { 
    font-family: 'Open Sans' , sans-serif;
    font-size: 40px;
    font-weight: 600;
    color: #000000;
    margin-top: 5%;
    text-align: center;
    text-transform: uppercase;
    letter-spacing: 4px;
}

</style>
</head><body>
<h4 align="center" style="color: red;">${msg }</h4>

<div class="container">
            <form class="form-horizontal" role="form" action="addProfile" method="post">
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
                        <input type="phoneNumber" id="phoneNumber" placeholder="eg.98xxxxxx12" class="form-control"  name="mobileNumber" required>
                        <span class="help-block">Your phone number won't be disclosed anywhere </span>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="qualification" class="col-sm-3 control-label">Qualification* </label>
                    <div class="col-sm-9">
                        <input type="text" id="qualification" placeholder="eg..MBBS,BEMS.." class="form-control" name="qualification" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="specialization" class="col-sm-3 control-label">Specialization* </label>
                    <div class="col-sm-9">
                        <input type="text" id="specialization" placeholder="eg.Gastro,Ortho,Dentist" class="form-control" name="specialization" required>
                    </div>
                </div><div class="form-group">
                    <label for="yearsOfExperience" class="col-sm-3 control-label">Years Of Experience* </label>
                    <div class="col-sm-9">
                        <input type="text" id="yearsOfExperience" placeholder="eg..5years practice" class="form-control" name="yearsOfExperience" required>
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
                    <label for="pincode" class="col-sm-3 control-label">PinCode</label>
                    <div class="col-sm-9">
                        <input type="text" id="pincode" placeholder="eg.121xx1" class="form-control" name="pincode" required autofocus>
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
                <button type="submit" class="btn btn-primary btn-block">ADD DOCTOR</button>
            </form> <!-- /form -->
        </div> <!-- ./container -->
        </body>