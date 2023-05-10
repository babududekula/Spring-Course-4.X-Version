package com.pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@org.springframework.stereotype.Controller
public class Controller 
{
	
	@RequestMapping(value = "/hero" , method = RequestMethod.GET)
	public String helloForm()
	{
		return "helloform";
	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public ModelAndView loginPage(HttpServletRequest request , HttpServletResponse response)
	{
		String s1 = request.getParameter("uname");
		String s2 = request.getParameter("upwd");
		String message = "";
		ModelAndView mav = null;
		if(s1.equalsIgnoreCase("babu") && s2.equalsIgnoreCase("babu"))
		{
			message = "Login Successfully Completed";
			mav = new ModelAndView("success", "name",message);
		}
		else
		{
			message = "Login Failure Sorry";
			mav = new ModelAndView("failure", "name", message);
		}
		return mav;
	}
}
