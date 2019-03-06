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

import com.bean.Appointments;
import com.bean.Credentials;
import com.bean.Doctor;
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
	public String findDoctor(@RequestParam("doctorType") String type, Model m) {
		List<Doctor> li = patientService.viewListOfDoctor(type);
		m.addAttribute("doctorList", li);
		return "doctorResult";
	}

	@RequestMapping("/doctorSchedule")
	public String doctorSchedule(@RequestParam("doctorId") String doctorId, Model m, HttpSession session) {
		String userId = ((Credentials) session.getAttribute("user")).getUserId();
		List<Appointments> appointments = reporterService.requestAppointment(doctorId,"TM"+userId);
		m.addAttribute("appointments", appointments);
		return "doctorSchedule";
	}

	@RequestMapping("/bookSchedule")
	public String checkSchedule(Appointments appointments, Model m) {
		reporterService.addAppointment(appointments);
		m.addAttribute("msg", "appointment Booked Successfully");
		m.addAttribute("appointments", appointments);
		return "appointmentBooked";
	}
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
