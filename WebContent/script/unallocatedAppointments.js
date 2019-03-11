var xhttp ;
function load() {
  
  if (window.XMLHttpRequest) {
	    // code for modern browsers
	    xhttp = new XMLHttpRequest();
	    console.log("set");
	 } else {
	    // code for old IE browsers
	    xhttp = new ActiveXObject("Microsoft.XMLHTTP");
	    console.log("set");
	}
  
}

function getDoctor(id) {
	var url = "../reporter/reallocate/?appointmentId=";
	url += id;
	xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    	document.getElementById("content").innerHTML = this.responseText;
    }
  };
  xhttp.open("GET", url, true);
  xhttp.send();
}

function checkSchedule(doctorId) {
	var url = "../reporter/doctorReschedule/?doctorId=";
	url += doctorId;
	url += "&appointmentId=";
	url += document.getElementById(doctorId).value;
	console.log(url);
	xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    	document.getElementById("content").innerHTML = this.responseText;
    }
  };
  xhttp.open("GET", url, true);
  xhttp.send();
}

function bookSlot(id) {
	var appointmentId = document.getElementById("appointmentId"+id).value;
	var doctorId = document.getElementById("doctorId"+id).value;
	var patientId = document.getElementById("patientId"+id).value;
	var appointmentDate = document.getElementById("appointmentDate"+id).value;
	var appointmentSlot = document.getElementById("appointmentSlot"+id).value;
	var url = "../reporter/bookReschedule";
	console.log("appointmentId"+appointmentId+"&doctorId="+doctorId+"&patientId="+patientId+"&appointmentDate="+appointmentDate+"&appointmentSlot="+appointmentSlot);
	xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    	document.location.reload(true);
    	document.getElementById("content").innerHTML = this.responseText;
    }
  };
  xhttp.open("POST", url, true);
  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
  xhttp.send("appointmentId="+appointmentId+"&doctorId="+doctorId+"&patientId="+patientId+"&appointmentDate="+appointmentDate+"&appointmentSlot="+appointmentSlot);
}