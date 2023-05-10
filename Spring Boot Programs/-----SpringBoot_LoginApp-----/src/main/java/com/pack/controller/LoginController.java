package com.pack.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pack.dao.LoginDao;
import com.pack.entity.Login;
import com.pack.service.LoginService;

@Controller
public class LoginController 
{
	@Autowired(required = true)
	private LoginService loginService;
	
	@GetMapping("/homepage")
	public String homepage()
	{
		return "homepage";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute Login login, Model model)
	{	
		Login login1 = loginService.ById(login);
		if(login1.getUpwd().equals(login.getUpwd()))
		{
			return "success";
		}
		else
		{
			return "failure";
		}
	}
}
