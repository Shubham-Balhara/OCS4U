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

function getDoctor() {
	var type = document.getElementById("doctorType").value;
	var url = "../appointment/findDoctor/?type=";
	url += type;
	xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    	document.getElementById("content").innerHTML = this.responseText;
    }
  };
  xhttp.open("GET", url, true);
  xhttp.send();
}

function checkSchedule(doctorId) {
	var url = "../appointment/doctorSchedule/?doctorId=";
	url += doctorId;
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
	var doctorId = document.getElementById("doctorId"+id).value;
	var patientId = document.getElementById("patientId"+id).value;
	var appointmentDate = document.getElementById("appointmentDate"+id).value;
	var appointmentSlot = document.getElementById("appointmentSlot"+id).value;
	var url = "../appointment/bookSchedule";
	console.log(url+" - "+id);
	xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    	document.getElementById("content").innerHTML = this.responseText;
    }
  };
  xhttp.open("POST", url, true);
  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
  xhttp.send("doctorId="+doctorId+"&patientId="+patientId+"&appointmentDate="+appointmentDate+"&appointmentSlot="+appointmentSlot);
}