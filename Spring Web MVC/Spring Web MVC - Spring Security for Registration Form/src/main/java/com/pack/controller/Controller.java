package com.pack.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pack.command.User;





@org.springframework.stereotype.Controller
public class Controller 
{
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login()
	{
		return "loginpage";
	}
	
	@RequestMapping(value = "/loginfailure" , method = RequestMethod.GET)
	public String failure()
	{
		return "loginfailure";
	}
	
	@RequestMapping(value = "/home" , method = RequestMethod.GET)
	public String reg()
	{
		return "home";
	}
	
	
	@RequestMapping(value = "/register" , method = RequestMethod.GET)
	public String reg1(Model model)
	{
		model.addAttribute("user", new User());
		return "registrationForm";
	}
	
	@RequestMapping(value = "/babu" , method = RequestMethod.POST)
	public ModelAndView reg2(User user)
	{
		return new ModelAndView("regdetails", "name", user);
	}
	
	
}
