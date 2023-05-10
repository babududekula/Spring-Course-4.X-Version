package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;



@SessionAttributes("message")
@Controller
public class LoginController 
{
	
	@RequestMapping("/hellopage")
	public String login()
	{
		return "loginform";
	}
	@RequestMapping("/login")
	public String loginPage(@RequestParam("uname")String uname , ModelMap map)
	{
		map.addAttribute("message", "Hello "+uname+" Welcome To Maven !");
		return "wish";
	}
	
}
