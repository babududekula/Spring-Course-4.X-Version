package com.pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller 
{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String s1 = request.getParameter("uname");
		String s2 = request.getParameter("upwd");
		ModelAndView mav = null;
		String message = "";
		if(s1.equalsIgnoreCase("Babu") && s2.equalsIgnoreCase("Dudekula Babu"))
		{
			message ="Login Successfully Completed";
			mav = new ModelAndView("success","name", message);
		}
		else
		{
			message = "Sorry Login Failure";
			mav = new ModelAndView("failure", "name", message);
		}
		return mav;
	}

}
