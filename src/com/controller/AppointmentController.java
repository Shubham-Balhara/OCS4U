package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String bookStart(){
		return "searchDoctor";
	}
	@RequestMapping("/findDoctor")
	public String findDoctor(@RequestParam("doctorType")String type,Model m){
		List<Doctor> li = patientService.viewListOfDoctor(type);
		m.addAttribute("doctors",li);
		return "doctorResult";
	}
	@RequestMapping("/doctorSchedule")
	public String doctorSchedule(@RequestParam("doctorid")String doctorId,Model m){
		/*List<Schedule> schedules = reporterService.getSchedulesByDoctor(doctorid);*/
		//m.addAttribute("schedules",schedules);
		m.addAttribute("doctorId", doctorId);
		return "doctorSchedule";
	}
	@RequestMapping("/checkSchedule")
	public String checkSchedule(@RequestParam("doctorId")String doctorId, @RequestParam("date")String date,@RequestParam("slots")String slots, Model m,HttpSession session){
		boolean flag = false;
		String userId = ((Credentials)session.getAttribute("user")).getUserId();
		Appointments appointments = new Appointments(doctorId, "TM"+userId, date, slots);
		flag = reporterService.requestAppointment(appointments);
		if(flag == false){
			m.addAttribute("doctorId", doctorId);
			m.addAttribute("msg", "Slot is already booked");
			return "doctorSchedule";
		}else{
			return "appointmentBooked";
		}
	}
}
