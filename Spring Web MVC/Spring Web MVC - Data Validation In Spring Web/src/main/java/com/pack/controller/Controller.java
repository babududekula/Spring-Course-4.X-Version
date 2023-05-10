package com.pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.SimpleFormController;

import com.pack.command.Employee;


public class Controller extends SimpleFormController 
{
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception 
	{
		Employee emp = (Employee) command;
		return new ModelAndView("registrationdetails" , "name" , emp);
	}
}
