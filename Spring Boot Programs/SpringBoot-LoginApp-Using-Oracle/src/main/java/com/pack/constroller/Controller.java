package com.pack.constroller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.pojo.Login;

@org.springframework.stereotype.Controller
public class Controller 
{
	@RequestMapping(name="/home", method = RequestMethod.GET)
	public String home()
	{
		return "homepage";
	}
	
	@RequestMapping(name="/login", method = RequestMethod.POST)
	public String login(@RequestParam String uname , @RequestParam String upwd , ModelMap map)
	{
		Login login = new Login();
		String status="";
		if(uname.equalsIgnoreCase(uname) && upwd.equalsIgnoreCase(upwd))
		{
			status="success";
			map.addAttribute("name", login.getUname());
		}
		else
		{
			status="failure";
			map.addAttribute("babu", login.getUpwd());
		}
		return status;
	}
}
