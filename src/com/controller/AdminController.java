package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Doctor;
import com.bean.Profile;
import com.service.AdministratorService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdministratorService administratorService;

	//-------Admin home
		@RequestMapping("/home")
		public String home(){
			return "home";
		}
		
	// ========= ADD DOCTOR ==========
	@RequestMapping("/add")
	public String addDoctor() {
		return "addDoctor";
	}

	@RequestMapping("/addDoctor")
	public String addDoctorInDb(Doctor d, Model m) {
		String result = administratorService.addDoctor(d);
		if (result.equals("fail")) {
			m.addAttribute("msg", "Register Failed");
			return "addDoctor";
		} else {
			m.addAttribute("msg", "Doctor Added Successfully ,click on view to see Details !!");
			return "Adminhome";
		}
	}

	// ========= VIEW DOCTOR DETAILS ========
	@RequestMapping("/viewAll")
	public String viewAllDoctor(Model m) {
		List<Doctor> li = administratorService.getAllDoctor();
		m.addAttribute("doctorList", li);
		return "viewAllDoctor";
	}

	@RequestMapping("/doctor/{doctorId}")
	public String viewDetails(@PathVariable("doctorId") String doctorId, Model m) {
		Doctor doctor = administratorService.getDoctorById(doctorId);
		m.addAttribute("e",doctor);
		return "viewDoctor";
	}

	// ========= UPDATE DOCTOR ========
	@RequestMapping("/updateDoctor/{doctorId}")
	public String updateDoctorStart(@PathVariable("doctorId") String doctorId, Model m) {
		Doctor doctor = administratorService.getDoctorById(doctorId);
		m.addAttribute("doctor",doctor);
     	return "updateDoctorDetails";
	}
	@RequestMapping("/updateDoctor/updateDoctorinDB")
	public String updateDoctorinDB(Doctor doctor ,Model m) {
		administratorService.updateDoctor(doctor);
		System.out.println(doctor);
		m.addAttribute("msg","doctor updated sucessfully"+ doctor.getDoctorId() ) ;
		return "doctorUpdated";
	}
	
	
	// ========= Delete DOCTOR ========
		@RequestMapping("/deleteDoctor/{doctorId}")
		public String deleteDoctor(@PathVariable("doctorId") String doctorId, Model m) {
			Doctor doctor = administratorService.getDoctorById(doctorId);
			m.addAttribute("doctor",doctor);	
			String result = administratorService.deleteDoctor(doctor) ;
		
	     	return "doctorDeleted";
		}

}
