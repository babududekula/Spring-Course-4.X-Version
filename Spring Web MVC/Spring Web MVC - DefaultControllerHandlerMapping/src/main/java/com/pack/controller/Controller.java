package com.pack.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@org.springframework.stereotype.Controller
public class Controller 
{
	
	@RequestMapping(value="/hello" , method = RequestMethod.GET)
	public String helloForm()
	{
		return "helloform";
	}
	
	@RequestMapping(value = "/loginpage" , method = RequestMethod.POST)
	public ModelAndView loginForm(HttpServletRequest request , HttpServletResponse response)
	{
		String s1 = request.getParameter("uname");
		String s2 = request.getParameter("upwd");
		
		String message = "";
		
		if(s1.equalsIgnoreCase("Babu") && s2.equalsIgnoreCase("babu"))
		{
			message = "Login Success";
		}
		else
		{
			message = "Login Failure";
		}
		return new ModelAndView("loginform", "name", message);
	}
}
