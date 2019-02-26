package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Appointments;
import com.dao.AppointmentDao;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	AppointmentDao appointmentDao;

	// -------Patienthome
	@RequestMapping("/home")
	public String home() {
		return "Patienthome";
	}

	//======= view AppointMents 
	@RequestMapping("/apOfD/${userID}")
	public String appointmentOfDoctor(@PathVariable("userId") String doctorId, Model m) {
	System.out.println(doctorId);
	List<Appointments> li = appointmentDao.getAppointmentsByDoctor(doctorId);
	m.addAttribute("appointmentList", li);
	return "viewAppointment";
		
	}

	@RequestMapping("/apOfP/${userID}")
	public String appointmentOfPatient(@PathVariable("userId") String patientId, Model m) {
		System.out.println(patientId);
		List<Appointments> li = appointmentDao.getAppointmentsByPatient(patientId);
		m.addAttribute("appointmentList", li);
		return "viewAppointment";
	}
}
