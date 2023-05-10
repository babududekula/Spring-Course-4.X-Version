package com.pack.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;


public class LoginController implements Controller {

	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception 
	{
		String s1 = req.getParameter("uname");
		String s2 = req.getParameter("password");
		ModelAndView mav = null;
		if(s1.equalsIgnoreCase("Babu") && s2.equalsIgnoreCase("Dudekula"))
		{
			mav = new ModelAndView("success");
		}
		else
		{
			mav = new ModelAndView("failure");
		}
		return mav;
	}

}
