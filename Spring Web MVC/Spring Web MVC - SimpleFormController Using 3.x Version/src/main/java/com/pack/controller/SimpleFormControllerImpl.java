package com.pack.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.SimpleFormController;


import com.pack.command.Employee;

public class SimpleFormControllerImpl extends SimpleFormController 
{
	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception 
	{	
		Map<String, Object> map = new HashMap<String,Object>();
		List<String> list = new ArrayList<>();
		list.add("Bsc");
		list.add("Mca");
		list.add("Degree");
		map.put("list", list);
		
		List<String> list1 = new ArrayList<>();
		list1.add("Hyderabad");
		list1.add("Chennai");
		list1.add("Bangalore");
		map.put("Locations", list1);
		
		List<String> uhobby = new ArrayList<>();
		uhobby.add("Playing Cricket");
		uhobby.add("Reading books");
		uhobby.add("Listening Music");
		map.put("uhobby", uhobby);
		
		List<String> list2 = new ArrayList<>();
		list2.add("Enginerr");
		list2.add("Doctor");
		list2.add("Business");
		map.put("list2", list2);
		
		return map;
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception 
	{
		Employee emp = (Employee) command;
		return new ModelAndView("registrationdetails", "name", emp );
	}
}
