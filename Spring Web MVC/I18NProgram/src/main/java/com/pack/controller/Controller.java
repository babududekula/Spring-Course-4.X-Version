package com.pack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pack.command.User;

@org.springframework.stereotype.Controller
public class Controller
{
	@RequestMapping(value="/home" , method=RequestMethod.GET)
	public ModelAndView reg()
	{
		return new ModelAndView("registrationform", "user", new User());
	}
	
	@RequestMapping(value="/reg" , method = RequestMethod.POST)
	public ModelAndView form(User user)
	{
		return new ModelAndView("registartiondetails" , "user" ,user);
	}
}
