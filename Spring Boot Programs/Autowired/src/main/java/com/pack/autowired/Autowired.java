package com.pack.autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


public class Autowired 
{
	@org.springframework.beans.factory.annotation.Autowired
	@Qualifier(value = "Autowired2")
	Autowired1 service;
	
	public void method()
	{
		System.out.println(service.method1("Babu"));
		System.out.println(service.method2("Dudekula"));
	}
	
}
