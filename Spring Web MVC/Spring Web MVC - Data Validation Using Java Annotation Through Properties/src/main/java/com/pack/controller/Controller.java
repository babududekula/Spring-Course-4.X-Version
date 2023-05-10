package com.pack.controller;

import javax.validation.Valid;


import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.pack.command.Employee;


@org.springframework.stereotype.Controller
@RequestMapping("/welcome")
public class Controller 
{
	
	@RequestMapping(method = RequestMethod.GET)
	public String registerForm(Model model)
	{
		model.addAttribute("employee", new Employee());
		return "registration";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView registartionDetails(@Valid Employee employee , BindingResult errors , Model model)
	{
		if(errors.hasErrors())
		{
			return new ModelAndView("registration", "name", employee);
		}
		else
		{
			return new ModelAndView("registrationdetails", "name", employee);
		}
	}
}
