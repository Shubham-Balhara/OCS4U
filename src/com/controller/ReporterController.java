package com.controller;

import java.awt.Dialog.ModalExclusionType;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Appointments;
import com.bean.Credentials;
import com.bean.Doctor;
import com.bean.Leave;
import com.bean.Report;
import com.dao.ReportDao;
import com.service.AdministratorService;
import com.service.PatientService;
import com.service.ReporterService;

@Controller
@RequestMapping("/reporter")
public class ReporterController {

	@Autowired
	ReporterService reporterService;
	@Autowired
	PatientService patientService;
	@Autowired
	AdministratorService administratorService;
	@Autowired
	HttpSession session;
	
	@RequestMapping("/home")
	public String home(Model m){
		m.addAttribute("doctorList", reporterService.getAllDoctors());
		return "home";
	}
	
	@RequestMapping("/applyLeave")
	public String applyLeave(Model m){
		m.addAttribute("doctors", reporterService.getAllDoctors());
		return "applyLeave";
	}
	@RequestMapping("/leave")
	public String leave(Leave leave,Model m){
		String result = reporterService.addLeave(leave);
		if(result.equals("success")){
			m.addAttribute("msg", "leave added successfully");
		}
		m.addAttribute("doctors", reporterService.getAllDoctors());
		return "applyLeave";
	}
	@RequestMapping("/viewLeave")
	public String viewLeaves(Model m){
		m.addAttribute("doctors", reporterService.getAllDoctors());
		return "viewLeave";
	}
	@RequestMapping("/leaveByDoctor/{doctorId}")
	public String ViewLeaveByDoctor(@PathVariable("doctorId")String doctorId,Model m){
		m.addAttribute("leaves", reporterService.getLeaveByDoctor(doctorId));
		return "leave";
	}
	//---------allocated doctor
	@RequestMapping("/unalloted")
	public String unallocated(Model m){
		List<Appointments> appointments = reporterService.getUnallocatedAppointment();
		m.addAttribute("appointments", appointments);
		return "unallocatedAppointments";
	}
	@RequestMapping("/reallocate")
	public @ResponseBody String reallocate(String appointmentId,HttpSession session){
		Appointments a = reporterService.getAppointmentByAid(appointmentId);
		Doctor doctor = administratorService.getDoctorById(a.getDoctorId());
		List<Doctor> li = patientService.viewListOfDoctor(doctor.getSpecialization());
		//session.setAttribute("appointment", a);
		List<Doctor> doctors = new ArrayList<Doctor>();
		for(Doctor d:li){
			if(!d.getDoctorId().equals(doctor.getDoctorId())){
				doctors.add(d);
			}
		}
		String data = "<table class='table table-hover'>";
		data+="<thead><tr><th>#</th><th>Doctor</th><th>Specialization</th><th>Qualification</th><th>Experience</th><th>Mobile</th><th>Email</th><th> </th></tr></thead>";
		int index = 0;
		for(Doctor r:li){
			index++;
			data += "<tbody><input type='text' value='"+a.getAppointmentId()+"' id='"+r.getDoctorId()+"' style='display: none;'>"
					+ "<tr>"+"<th scope='row'>"+index+"</th>"
					+"<td>"+r.getDoctorName()+"</td>"
					+"<td>"+r.getSpecialization()+"</td>"
					+"<td>"+r.getQualification()+"</td>"
					+"<td>"+r.getYearsOfExperience()+"</td>"
					+"<td>"+r.getmobileNumber()+"</td>"
					+"<td>"+r.getEmailId()+"</td>"
					+"<td><button onclick='checkSchedule(this.value)' value='"+ r.getDoctorId()+"'>Schedule</button></td>"+"</tr></tbody>";
		}
		data += "</table>";
		return data;
	}
	@RequestMapping("/doctorReschedule")
	public @ResponseBody String reschedule(String doctorId,String appointmentId,Model m){
		Appointments a = reporterService.getAppointmentByAid(appointmentId);
		List<Appointments> appointments = reporterService.requestAppointment(doctorId,a.getPatientId());
		String data = "<table class='table table-hover'>";
		data+="<thead><tr><th>#</th><th>Doctor</th><th>Patient</th><th>Date</th><th>Slot</th><th><button value='"+a.getAppointmentId()+"' onclick='getDoctor(this.value)'><img src='/OCS/images/icons/cancel.jpg' width='30px' height='30px' class='img-circle'></button></th></tr></thead>";
		int index = 0;
		for(Appointments r:appointments){
			index++;
			data += "<tbody><tr>"+"<th scope='row'>"+index+"</th>"
					+ "<td><input type='text' id='appointmentId"+index+"' disabled='disabled' value='"+a.getAppointmentId()+"'></td>"
						+ "<td><input type='text' id='doctorId"+index+"' disabled='disabled' value='"+r.getDoctorId()+"'></td>"
								+ "<td><input type='text' id='patientId"+index+"' disabled='disabled' value='"+r.getPatientId()+"'></td>"
										+ "<td><input type='text' id='appointmentDate"+index+"' disabled='disabled' value='"+r.getAppointmentDate()+"'></td>"
												+ "<td><input type='text' id='appointmentSlot"+index+"' disabled='disabled' value='"+r.getAppointmentSlot()+"'></td>"
														+ "<td><button value='"+index+"' onclick='bookSlot(this.value)'>Book</button></td>"+"</tr></tbody>";
		}
		data += "</table>";
		return data;
	}
	@RequestMapping("/bookReschedule")
	public @ResponseBody String bookReschedule(Appointments appointments){
		reporterService.updateAppointment(appointments);
		return "<div class='jumbotrone'><h3>Re-Scheduled Successfully !</h3></div>";
	}
	
	//-----------pending reports 
	@RequestMapping("/pendingReport")
	public String pendingReport(Model m){
		List<Appointments> li = reporterService.pendingReport();
		m.addAttribute("reports", li);
		return "pendingReport";
	}
	@RequestMapping("/fillReport")
	public String fillReport(Report report){
		reporterService.addReport(report);
		return "redirect:pendingReport";
	}
	@RequestMapping("/history")
	public String history(){
		return "history";
	}
	@RequestMapping("/reportHistory")
	public @ResponseBody String reportHistory(String patientId){
		List<Report> reports = reporterService.getReportByPatient(patientId);
		String data = "<table class='table'>";
		int index = 0;
		for(Report r:reports){
			index++;
			data += "<tr>"+"<th scope='row'>"+index+"</th>"+"<td>"+r.getId()+"</td>"+"<td>"+r.getDoctor()+"</td>"+"<td>"+r.getPatient()+"</td>"+"<td>"+r.getAppointmentDate()+"</td>"+"<td>"+r.getappointmentSlot()+"</td>"+"<td>"+r.getAilments()+"</td>"+"<td>"+r.getMedicines()+"</td>"+"</tr>";
		}
		data += "</table>";
		return data;
	}
}
