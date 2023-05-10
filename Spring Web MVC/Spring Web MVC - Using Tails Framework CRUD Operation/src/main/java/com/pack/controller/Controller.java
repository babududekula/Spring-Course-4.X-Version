package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;


import com.pack.command.Employee;
import com.pack.service.EmployeeService;


@org.springframework.stereotype.Controller
public class Controller 
{
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public String login()
	{
		return "loginpage";
	}
	
	@RequestMapping(value = "/loginfailure" , method = RequestMethod.GET)
	public String failure()
	{
		return "loginfailure";
	}
	
	@RequestMapping(value="/welcomepage" , method=RequestMethod.GET)
	public String welcomePage()
	{
		return "welcomeDef";
	}
	
	@RequestMapping(value="/add" ,method=RequestMethod.GET)
	public ModelAndView addForm()
	{
		return new ModelAndView("addDef", "employee", new Employee());
	}
	
	 @RequestMapping(value="/addpage" , method=RequestMethod.POST)
	public ModelAndView add(Employee employee)
	{
		/*
		 * String status = employeeService.add(employee);
		 * 
		 * return new ModelAndView("statusDef" ,"status" ,status);
		 */
		
		String status = employeeService.add(employee);
		ModelAndView mav = null;
		if(status.equalsIgnoreCase("success"))
		{
			mav = new ModelAndView("successDef");
		}
		else if(status.equalsIgnoreCase("failure"))
		{
			mav = new ModelAndView("failureDef");
		}
		else
		{
			mav = new ModelAndView("existedDef");
		}
		return mav;
			
	}
	 @RequestMapping(value = "/search" , method=RequestMethod.GET)
	 public ModelAndView searchForm()
	 {
		 return new ModelAndView("searchDef" ,"employee" ,new Employee());
	 }
	 
	 @RequestMapping(value = "/searchform" , method = RequestMethod.POST)
	 public ModelAndView search(Employee employee)
	 {
		 ModelAndView mav = null;
		 Employee emp = employeeService.serach(employee.getEnumber());
		 
		 if(emp == null)
		 {
			mav = new ModelAndView("notexistedDef");
		 }
		 else
		 {
			mav = new ModelAndView("employeedetailsDef" ,"name",emp);
		 }
		 return mav;
	 }
	 @RequestMapping(value = "/update" , method=RequestMethod.GET)
	 public ModelAndView updateForm()
	 {
		 return new ModelAndView("updateDef","employee",new Employee());
	 }
	 @RequestMapping(value = "/updateform" ,method=RequestMethod.POST)
	 public ModelAndView editForm(Employee employee)
	 {
		 ModelAndView mav = null;
		 Employee emp = employeeService.serach(employee.getEnumber());
		 
		 if(emp == null)
		 {
			mav = new ModelAndView("notexistedDef");
		 }
		 else
		 {
			mav = new ModelAndView("editDef" ,"name",emp);
		 }
		 return mav;
	 }
	 @RequestMapping(value = "/update" ,method = RequestMethod.POST)
	 public ModelAndView update(Employee employee)
	 {
		 ModelAndView mav = null;
		 String status = employeeService.update(employee);
		 if(status.equalsIgnoreCase("success"))
		 {
			 mav = new ModelAndView("successDef");
		 }
		 else
		 {
			 mav = new ModelAndView("failureDef");
		 }
		 return mav;
	 }
	 @RequestMapping(value = "/delete" , method = RequestMethod.GET)
	 public ModelAndView deleteForm()
	 {
		 return new ModelAndView("deleteDef" ,"employee" ,new Employee());
	 }
	 @RequestMapping(value = "/deleteform" ,method = RequestMethod.POST)
	 public ModelAndView delete(Employee employee)
	 {
		 ModelAndView mav = null;
		 String status = employeeService.delete(employee.getEnumber());
		 if(status.equalsIgnoreCase("success"))
		 {
			 mav = new ModelAndView("deleteDef1");
		 }
		 else if(status.equalsIgnoreCase("failure"))
		 {
			 mav = new ModelAndView("failureDef");
		 }
		 else
		 {
			 mav = new ModelAndView("notexisted");
		 }
		 return mav;
	 }
}










