package com.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Appointments;
import com.bean.Credentials;
import com.dao.AppointmentDao;
import com.service.AdministratorService;
import com.service.PatientService;
import com.service.ReporterService;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService patientService;
	@Autowired
	ReporterService reporterService;
	@Autowired
	AdministratorService administratorService;

	// -------Patienthome
	@RequestMapping("/home")
	public String home(Model m,HttpSession session) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		String today = "";
		//String time = "";
		today += cal.get(Calendar.YEAR);
		today += "-"+((cal.get(Calendar.MONTH)+1<10)?("0"+(cal.get(Calendar.MONTH)+1)):(cal.get(Calendar.MONTH)+1));
		today += "-"+((cal.get(Calendar.DAY_OF_MONTH)<10)?("0"+cal.get(Calendar.DAY_OF_MONTH)):(cal.get(Calendar.DAY_OF_MONTH)));
		m.addAttribute("today", today);
		List<Appointments> li = patientService.getAppointmentsById("TM"+((Credentials)session.getAttribute("user")).getUserId());
		m.addAttribute("appointmentList", li);
		return "home";
	}

	//======= view AppointMents 
	@RequestMapping("/apOfD/{doctorId}")
	public String appointmentOfDoctor(@PathVariable("doctorId") String doctorId, Model m) {
	List<Appointments> li = administratorService.getAppointmentsByDoctorId(doctorId);
	m.addAttribute("appointmentList", li);
	return "viewAppointment";
		
	}

	@RequestMapping("/apOfP")
	public String appointmentOfPatient(Model m,HttpSession session) {
		String patientId = "TM"+((Credentials)session.getAttribute("user")).getUserId();
		List<Appointments> li = patientService.getAppointmentsById(patientId);
		m.addAttribute("date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		m.addAttribute("appointmentList", li);
		return "patientAppointment";
	}
	@RequestMapping("/report")
	public String getReport(Model m,HttpSession session){
		String patientId = "TM"+((Credentials)session.getAttribute("user")).getUserId();
		List<Appointments> li = patientService.getReportById(patientId);
		m.addAttribute("appointmentList", li);
		return "reportPage";
	}
	@RequestMapping("/printReport/{reportId}")
	public String printReport(@PathVariable("reportId")String reportId, Model m,HttpSession session){
		Appointments appointments = reporterService.getAppointmentByAid(reportId);
		m.addAttribute("report", appointments);
		return "printReport";
	}
}
