package com.pack.controller;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.AbstractController;


public class AbstarctControllerImpl extends AbstractController 
{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception 
	{
		LocalTime t = LocalTime.now();
		int n = t.getHour();
		String wish_Message="";
		if(n < 12)
		{
			wish_Message ="Good Morning";
		}
		else if(n < 17)
		{
			wish_Message ="Good AfterNoon";
		}
		else
		{
			wish_Message ="Good Evening";
		}
		return new ModelAndView("wish", "message", wish_Message);
	}

}
