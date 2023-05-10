package com.pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;


public class LoginFormController implements Controller 
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String s1 = request.getParameter("uname");
		ModelAndView mav = new ModelAndView("loginform", "name", s1);
		return mav;
	}

}
