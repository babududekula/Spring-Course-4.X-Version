package com.pack.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;


public class HelloController implements Controller 
{	
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{	
		ModelAndView mav = new ModelAndView("hello","message", "Welcome to Spring Web MVC World");
		
		return mav;
	}

}
