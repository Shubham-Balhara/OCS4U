package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Credentials;
import com.bean.Doctor;
import com.bean.Profile;
import com.dao.CredentialsDao;
import com.util.User;

@Controller
@RequestMapping("/main")
public class MainController {
	@Autowired
	User u;
	@Autowired
	CredentialsDao credentialsDao ;
	
	
	//-------home page
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
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
			return c.getUserType()+"home";
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
		if(result.equals("fail")){
			m.addAttribute("msg", "Register Failed");
			return "register";
		}
		else{
			m.addAttribute("msg","Successfully registered, Login to Continue");
			return "login";
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
			m.addAttribute("msg","already logged out");
			return "login";
		}
	}
	
	//======= UPDATE PASSWORD 
	@RequestMapping("/update/{userId}")
	public String update(@PathVariable("userId") String userId, Model m)
	{
		m.addAttribute("userId",userId) ;
		System.out.println("id--" + userId );
	   	return "updatePassword" ;
	}
	@RequestMapping("/update/updatePasswordInDB")
	public String updatePassword(@RequestParam("newPassword") String newPassword ,@RequestParam("userId") String userId, Model m,HttpSession session)
	{
		//String id =((Credentials)session.getAttribute("user")).getUserId() ;
		
		System.out.println("userwali id --" + userId );
		
              Credentials credentials = credentialsDao.getCredentialsById(userId);
              System.out.println("cre=-" + credentials);
              String msg = u.changePassword(credentials, newPassword) ;
              m.addAttribute("msg" ,msg) ;
            System.out.println("msggg--" + msg );
              if(msg.equals("success"))
            	 return "passwordUpdated" ;
             else
            	 return "upadatePassword" ;
	}
	
}
