package com.pack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;



@SessionAttributes("status")
@Controller
public class LoginApplication 
{
	@RequestMapping("/homepage")
	public String loginPage()
	{
		return "loginform";
	}	
	@RequestMapping("/login")
	public String login(@RequestParam("uname")String uname , @RequestParam("password")String password , ModelMap map)
	{
		String status="";
		if(uname.equalsIgnoreCase("Babu") && password.equalsIgnoreCase("Dudekula"))
		{
			map.addAttribute("status", "Login Page Success");
		}
		else
		{
			map.addAttribute("status", "Login Page Failure");
		}
		return status;
	}
}
