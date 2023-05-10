package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.model.Login;
import com.pack.service.LoginService;

@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/home" , method = RequestMethod.GET)
	public String loginPage()
	{
		return "loginpage";
	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public String loginMethod(@RequestParam String uname , @RequestParam String upwd , ModelMap map)
	{
		Login login = null;
		try 
		{
			login = loginService.ByName(uname);
		} 
		catch (Exception e) 
		{
			System.out.println("Login Details Not Found");
		}
		if(login != null)
		{
			map.addAttribute("name", uname);
			return "success";
		}
			map.addAttribute("name", uname);
			return "failure";
	}
}	
