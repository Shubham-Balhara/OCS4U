<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style type="text/css">
body {
     background: url("/OCS/images/doctor-background.jpeg") fixed;
    background-size: cover;
}</style>

</head>
<body><div class="container">
		<div class="row">
		<div class="col-md-7 ">

				<div class="panel panel-default">
					<div class="panel-heading">
						<h4>Profile</h4>
					</div>
					<div class="panel-body">

						<div class="box box-info">

							<div class="box-body">
								<div class="col-sm-6">
									<div align="center">
										<img alt="User Pic"
											src="https://x1.xingassets.com/assets/frontend_minified/img/users/nobody_m.original.jpg"
											id="profile-image1" class="img-circle img-responsive">

										<input id="profile-image-upload" class="hidden" type="file">
										<div style="color: #999;">click here to change profile
											image</div>
										<!--Upload Image Js And Css-->

									</div>

									<br>

									<!-- /input-group -->
								</div>
								<div class="col-sm-6">
									<h2 style="color:red;">${profile.firstName}</h2>
									</span> <span><h4 style="color: blue; font-style: oblique;">${profile.lastName}</h4></span>
								</div>
								<div class="clearfix"></div>
								<hr style="margin: 5px 0 5px 0;">

								<div class="col-sm-5 col-xs-6 tital "> Id:</div>
								<div class="col-sm-7 col-xs-6 ">${profile.userId}</div>
								<div class="clearfix"></div>
								<div class="bot-border"></div>

								<div class="col-sm-5 col-xs-6 tital ">Name:</div>
								<div class="col-sm-7 col-xs-6 ">${profile.firstName} ${profile.lastName}</div>
								<div class="clearfix"></div>
								<div class="bot-border"></div>
                             	<div class="col-sm-5 col-xs-6 tital ">Gender:</div>
								<div class="col-sm-7">${profile.gender}</div>
								<div class="clearfix"></div>
								<div class="bot-border"></div>
							
                             	<div class="col-sm-5 col-xs-6 tital ">Date Of Birth:</div>
								<div class="col-sm-7">${profile.dateOfBirth}</div>



								<div class="clearfix"></div>
								<div class="bot-border"></div>
								<div class="col-sm-5 col-xs-6 tital ">Street:</div>
								<div class="col-sm-7">${profile.street}</div>

								<div class="clearfix"></div>
								<div class="bot-border"></div>
								<div class="col-sm-5 col-xs-6 tital ">Location:</div>
								<div class="col-sm-7">${profile.location}</div>

								<div class="clearfix"></div>
								<div class="bot-border"></div>
								
								<div class="col-sm-5 col-xs-6 tital ">City</div>
								<div class="col-sm-7">${profile.city}</div>

								<div class="clearfix"></div>
								<div class="bot-border"></div>
								<div class="col-sm-5 col-xs-6 tital ">State:</div>
								<div class="col-sm-7">${profile.state}</div>

								<div class="clearfix"></div>
								<div class="bot-border"></div>
								<div class="col-sm-5 col-xs-6 tital ">Pincode:</div>
								<div class="col-sm-7">${profile.pincode}</div>

								<div class="clearfix"></div>
								<div class="bot-border"></div>
								<div class="col-sm-5 col-xs-6 tital ">Mobile Number:</div>
								<div class="col-sm-7">${profile.mobileNumber}</div>

								<div class="clearfix"></div>
								<div class="bot-border"></div>
								
								<div class="col-sm-5 col-xs-6 tital ">Email Id:</div>
								<div class="col-sm-7">${profile.emailId}</div>

								<div class="clearfix"></div>
								<div class="bot-border"></div>

								<div class="col-sm-5 col-xs-6 tital ">Nationality:</div>
								<div class="col-sm-7">Indian</div><br>
								<hr>
								
                                <div class="col-sm-5 col-xs-6 tital "><a href="#" class="btn btn-success" role="button">Update Details</a></div>
                              
								<div class="col-sm-5 col-xs-6 tital "> <a href="../main/update" class="btn btn-primary" role="button">Change Password</a></div>
<br><br>
								<!-- /.box-body -->
							</div>
							<!-- /.box -->
							
					
</div>

					</div>
				</div>
			</div>
			<script>
				$(function() {
					$('#profile-image1').on('click', function() {
						$('#profile-image-upload').click();
					});
				});
			</script>
		</div>
	</div>
</body>
</html>
