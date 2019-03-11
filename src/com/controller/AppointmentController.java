package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Appointments;
import com.bean.Credentials;
import com.bean.Doctor;
import com.bean.Report;
import com.bean.Schedule;
import com.service.PatientService;
import com.service.ReporterService;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {
	@Autowired
	PatientService patientService;
	@Autowired
	ReporterService reporterService;

	@RequestMapping("/start")
	public String bookStart() {
		return "searchDoctor";
	}

	@RequestMapping("/findDoctor")
	public @ResponseBody String findDoctor(String type) {
		System.out.println(type);
		List<Doctor> li = patientService.viewListOfDoctor(type);
		String data = "<table class='table table-hover'>";
		data+="<thead><tr><th>#</th><th>Doctor</th><th>Specialization</th><th>Qualification</th><th>Experience</th><th>Mobile</th><th>Email</th><th> </th></tr></thead>";
		int index = 0;
		for(Doctor r:li){
			index++;
			data += "<tbody><tr>"+"<th scope='row'>"+index+"</th>"+"<td>"+r.getDoctorName()+"</td>"+"<td>"+r.getSpecialization()+"</td>"+"<td>"+r.getQualification()+"</td>"+"<td>"+r.getYearsOfExperience()+"</td>"+"<td>"+r.getmobileNumber()+"</td>"+"<td>"+r.getEmailId()+"</td>"+"<td><button onclick='checkSchedule(this.value)' value='"+ r.getDoctorId()+"'>Schedule</button></td>"+"</tr></tbody>";
		}
		data += "</table>";
		return data;
	}

	@RequestMapping("/doctorSchedule")
	public @ResponseBody String doctorSchedule(String doctorId, HttpSession session) {
		String userId = ((Credentials) session.getAttribute("user")).getUserId();
		List<Appointments> appointments = reporterService.requestAppointment(doctorId,"TM"+userId);
		String data = "<table class='table table-hover'>";
		data+="<thead><tr><th>#</th><th>Doctor</th><th>Patient</th><th>Date</th><th>Slot</th><th><img onclick='getDoctor()' src='/OCS/images/icons/cancel.jpg' width='30px' height='30px' class='img-circle'></th></tr></thead>";
		int index = 0;
		for(Appointments r:appointments){
			index++;
			data += "<tbody><tr>"+"<th scope='row'>"+index+"</th>"
						+ "<td><input type='text' id='doctorId"+index+"' disabled='disabled' value='"+r.getDoctorId()+"'></td>"
								+ "<td><input type='text' id='patientId"+index+"' disabled='disabled' value='"+r.getPatientId()+"'></td>"
										+ "<td><input type='text' id='appointmentDate"+index+"' disabled='disabled' value='"+r.getAppointmentDate()+"'></td>"
												+ "<td><input type='text' id='appointmentSlot"+index+"' disabled='disabled' value='"+r.getAppointmentSlot()+"'></td>"
														+ "<td><button value='"+index+"' onclick='bookSlot(this.value)'>Book</button></td>"+"</tr></tbody>";
		}
		data += "</table>";
		return data;
	}
	@RequestMapping("/bookSchedule")
	public @ResponseBody String checkSchedule(Appointments appointments) {
		System.out.println("booked");
		reporterService.addAppointment(appointments);
		return "<div class='jumbotrone'><h3>Booked Successfully !</h3></div>";
	}
	
	//------------reschedule
	@RequestMapping("/reschedule/{appointmentId}")
	public String reschedule(@PathVariable("appointmentId")String appointmentId,Model m){
		List<Appointments> li = reporterService.reschedule(appointmentId);
		m.addAttribute("appointments", li);
		return "reschedule";
	}
	@RequestMapping("/rescheduleSchedule")
	public String rescheduleSchedule(Appointments appointments,Model m){
		System.out.println(appointments);
		reporterService.updateAppointment(appointments);
		m.addAttribute("msg", "appointment Booked Successfully");
		m.addAttribute("appointments", appointments);
		return "appointmentBooked";
	}
}
