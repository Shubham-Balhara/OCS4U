package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Credentials;
import com.bean.Leave;
import com.service.ReporterService;

@Controller
@RequestMapping("/reporter")
public class ReporterController {

	@Autowired
	ReporterService reporterService;
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
}
