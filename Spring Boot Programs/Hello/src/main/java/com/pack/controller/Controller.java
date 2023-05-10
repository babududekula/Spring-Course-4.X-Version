package com.pack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@GetMapping("/hello")
	public String sayHello()
	{
		return "<h1 align='center' style='color:red;'> Hello Mr.Dudekula Babu Welcome To Spring Boot </h1>";
	}
}
