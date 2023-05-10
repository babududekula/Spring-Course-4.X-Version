package com.pack.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller 
{
	@RequestMapping(value = "/welcome" , method = RequestMethod.GET)
	public String hello()
	{
		return "hellopage";
	}
	
	@RequestMapping(value = "/wish" , method = RequestMethod.POST)
	public String wish(@RequestParam String uname , @RequestParam String wish, ModelMap map)
	{
		map.addAttribute("name", uname);
		map.addAttribute("wish", wish);
		return "wish";
	}
}
