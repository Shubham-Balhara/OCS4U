package com.controller;

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

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService patientService;
	@Autowired
	AdministratorService administratorService;

	// -------Patienthome
	@RequestMapping("/home")
	public String home(Model m,HttpSession session) {
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
		m.addAttribute("appointmentList", li);
		return "patientAppointment";
	}
}
