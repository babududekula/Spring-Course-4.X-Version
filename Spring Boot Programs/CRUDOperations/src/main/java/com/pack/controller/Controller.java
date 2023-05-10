package com.pack.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.pojo.Employee;
import com.pack.service.EmployeeService;


@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/welcomepage" , method = RequestMethod.GET)
	public String welcome()
	{
		return "welcome";
	}
	
	@RequestMapping(value = "/addform" , method = RequestMethod.GET)
	public String add()
	{
		return "addpage";
	}
	
	@RequestMapping(value = "/searchform" , method = RequestMethod.GET)
	public String search()
	{
		return "searchpage";
	}
	
	@RequestMapping(value = "/updateform" , method = RequestMethod.GET)
	public String update()
	{
		return "updatepage";
	}
	
	@RequestMapping(value = "/deleteform" , method = RequestMethod.GET)
	public String delete()
	{
		return "deletepage";
	}
	
	@RequestMapping(value = "/add" , method = RequestMethod.POST)
	public String addpage(@RequestParam String enumber , @RequestParam String ename , @RequestParam String epwd , @RequestParam int eage ,@RequestParam String email , @RequestParam String emobile , ModelMap map)
	{
		String status="";
		map.addAttribute("name", "Employee Insertion");
		Employee employee = new Employee();
		employee.setEnumber(enumber);
		employee.setEname(ename);
		employee.setEpwd(epwd);
		employee.setEage(eage);
		employee.setEmail(email);
		employee.setEmobile(emobile);
		
		status = employeeService.addModule(employee);
		
		return status;
	}
	
	@RequestMapping(value = "/search" ,method = RequestMethod.POST)
	public String serach(@RequestParam String enumber , ModelMap map)
	{
		String status="";
		Employee employee = employeeService.searchModule(enumber);
		
		if(employee == null)
		{
			status="notexisted";
		}
		else
		{
			map.addAttribute("name", employee);
			status = "employeedetails";
		}
		return status;
	}
	
	@RequestMapping(value = "/editform" , method = RequestMethod.POST)
	public String edit(@RequestParam String enumber , ModelMap map)
	{
		String status="";
		Employee emp = employeeService.searchModule(enumber);
		if(emp == null)
		{
			status="notexisted";
		}
		else
		{
			map.addAttribute("name", emp);
			status ="editpage";
		}
		return status;
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	public String update(@RequestParam String enumber , @RequestParam String ename , @RequestParam String epwd , @RequestParam int eage ,@RequestParam String email , @RequestParam String emobile , ModelMap map)
	{
		String status="";
		Employee employee = new Employee();
		
		employee.setEnumber(enumber);
		employee.setEname(ename);
		employee.setEpwd(epwd);
		employee.setEage(eage);
		employee.setEmail(email);
		employee.setEmobile(emobile);
		
		map.addAttribute("name","Employee Updation");
		status = employeeService.updateModule(employee);
		
		return status;
	}
	
	@RequestMapping(value = "/delete" , method = RequestMethod.POST)
	public String delete(@RequestParam String enumber , ModelMap map)
	{
		String status="";
		map.addAttribute("name", "Employee Deletion");
		status = employeeService.deleteModule(enumber);
		return status;
	}
	
	@RequestMapping(value = "/allEmployees" , method = RequestMethod.GET)
	public String allEmployees()
	{
		return "allEmployees";
	}
}
