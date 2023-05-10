package com.pack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller 
{
	
	@RequestMapping(value = "/home" ,  method = RequestMethod.GET)
	public String home()
	{
		return "homepage";
	}
	@RequestMapping(value = "/add" , method = RequestMethod.GET)
	public String admin()
	{
		return "adminpage";
	}
	@RequestMapping(value = "/login" ,method = RequestMethod.GET)
	public String login()
	{
		return "loginpage";
	}
	@RequestMapping(value = "/loginfailed" , method = RequestMethod.GET)
	public String failure()
	{
		return "loginfailure";
	}
}
