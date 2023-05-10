package com.pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;


public class WishController implements Controller 
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception 
	{
		
		ModelAndView mav = new ModelAndView("wish","message","Spring Web MVC World");
		return mav;
	}

}
