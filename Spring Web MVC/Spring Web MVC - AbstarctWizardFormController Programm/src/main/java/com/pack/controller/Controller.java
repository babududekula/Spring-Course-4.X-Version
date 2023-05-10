package com.pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.pack.command.User;


public class Controller extends AbstractWizardFormController 
{
	
	@Override
	protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object model,
			BindException error) throws Exception 
	{
		User user = (User) model;
		
		return new ModelAndView("registrationdetails" , "name" , user);
	}
	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception 
	{
		return new ModelAndView("welcomepage");
	}

}
