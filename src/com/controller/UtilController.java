package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.util.User;

@RequestMapping("/main")
public class UtilController {
	User user ;
	@RequestMapping("/login")
	public String login()
	{
	
		
		return "" ;
	}

}
