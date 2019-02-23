package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Credentials;
import com.bean.Patient;
import com.bean.Profile;
import com.util.User;

@Controller
@RequestMapping("/main")
public class MainController {
	@Autowired
	User u;
	
	/// ---- Login
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	@RequestMapping("/validate")
	public String validate(Credentials c,Model m,HttpSession session){
		String result = u.login(c);
		if(result.equals("invalid")){
			m.addAttribute("msg","invalid try again");
			return "login";
		}else{
			c.setLoginStatus(1);
			session.setAttribute("user", c);
			return "welcome";
		}
	}
	
	//--------register
	@RequestMapping("/register")
	public String register(){
		return "register";
	}
	@RequestMapping("/addProfile")
	public String addProfile(Profile p,Model m){
		String result = u.register(p);
		if(result.equals("success")){
			m.addAttribute("msg","Successfully registered, Login to Continue");
			return "login";
		}
		else{
			m.addAttribute("msg", "Register Failed");
			return "register";
		}
	}
	
	//-----logout
	@RequestMapping("/logout")
	public String logout(HttpSession session,Model m){
		String userId = ((Credentials)session.getAttribute("user")).getUserId();
		if(u.logout(userId)){
			m.addAttribute("msg", "logged out successfully");
			return "index";
		}else{
			m.addAttribute("msg","loggout failed");
			return "welcome";
		}
	}
}
