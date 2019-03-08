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
	
	@RequestMapping("/allDoctors")
	public String viewAllDoctors(Model m){
		m.addAttribute("doctors", reporterService.getAllDoctors());
		return "allDoctors";
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
	@RequestMapping("/reallocate/{appointmentId}")
	public String reallocate(@PathVariable("appointmentId")String appointmentId,HttpSession session,Model m){
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
		m.addAttribute("doctorList", doctors);
		return "doctorResult";
	}
	@RequestMapping("/doctorReschedule")
	public String reschedule(@RequestParam("doctorId")String doctorId,@RequestParam("appointmentId")String appointmentId,Model m){
		Appointments a = reporterService.getAppointmentByAid(appointmentId);
		List<Appointments> appointments = reporterService.requestAppointment(doctorId,a.getPatientId());
		for(Appointments ap:appointments){
			ap.setAppointmentId(a.getAppointmentId());
		}
		m.addAttribute("appointments", appointments);
		return "doctorSchedule";
	}
	@RequestMapping("/bookReschedule")
	public String bookReschedule(Appointments appointments,Model m){
		reporterService.updateAppointment(appointments);
		m.addAttribute("msg", "appointment Rescheduled Successfully");
		m.addAttribute("appointments", appointments);
		return "appointmentBooked";
	}
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
