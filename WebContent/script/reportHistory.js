var xhttp ;
function load() {
  
  if (window.XMLHttpRequest) {
	    // code for modern browsers
	    xhttp = new XMLHttpRequest();
	 } else {
	    // code for old IE browsers
	    xhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
  
}
function ajax() {
	var id = document.getElementById("patientId").value;
	var url = "../reporter/reportHistory/?patientId=";
	url += id;
	xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    	document.getElementById("history").innerHTML = this.responseText;
    }
  };
  xhttp.open("GET", url, true);
  xhttp.send();
}

function fun() {
	alert("working");
}