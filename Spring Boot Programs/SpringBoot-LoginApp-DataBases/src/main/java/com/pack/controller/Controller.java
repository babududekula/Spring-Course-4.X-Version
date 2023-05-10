package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pack.pojo.Login;
import com.pack.repository.RepositoryImpl;

@RestController
public class Controller 
{
	@Autowired
	private RepositoryImpl repo;
	
	@GetMapping(value = "/home")
	public ModelAndView home()
	{
		return new ModelAndView("homepage");
	}
	
	@PostMapping(value = "/page")
	public ModelAndView loginPage(@RequestParam("uname") String uname , @RequestParam("upwd") String upwd , ModelMap model)
	{
		ModelAndView mav = null;
		Login login = null;
		try 
		{
			login = repo.findByName(uname);
		}
		catch (Exception e) 
		{
			System.out.println("Login Not Found");
			e.printStackTrace();
		}
		if(login != null)
		{
			model.addAttribute("uname", uname);
			mav = new ModelAndView("welcome");
		}
		else
		{
			mav = new ModelAndView("failure");
		}
		return mav;
	}
	
}
