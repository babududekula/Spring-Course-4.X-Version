package com.pack.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@SessionAttributes("status")
@org.springframework.stereotype.Controller
public class LoginController  
{
	@RequestMapping("/loginform")
	public ModelAndView loginPage() 
	{
		ModelAndView mav = new ModelAndView("loginpage");
		return mav;
	}

	@RequestMapping("/login")
	public String login(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd, ModelMap map) throws Exception
	{
		String status="";
		if(uname.equalsIgnoreCase("Babu") && upwd.equalsIgnoreCase("Dudekula"))
		{
			map.addAttribute("status", "Login Success");
		}
		else
		{
			map.addAttribute("status", "Login Failure");
		}
		return status;
	}

}
