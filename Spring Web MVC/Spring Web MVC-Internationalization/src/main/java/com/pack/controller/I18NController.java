package com.pack.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;


import com.pack.command.Employee;

@Controller
public class I18NController 
{
	@RequestMapping(value="/next" , method=RequestMethod.GET)
	public String form()
	{
		return "next";
	}
	@RequestMapping(value="/reg" , method = RequestMethod.GET)
	public ModelAndView showForm()
	{
		return new ModelAndView("reg" ,"user", new Employee());
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public ModelAndView reg(Employee employee)
	{
		return new ModelAndView("details" ,"name" , employee);
	}
}
