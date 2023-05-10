package com.pack.autowired;

import org.springframework.stereotype.Component;

@Component
public class Autowired2 implements Autowired1
{
	public String method1(String name)
	{
		return "Good Morning "+name;
	}

	@Override
	public String method2(String name) {
		
		return "Good Night "+name;
	}
}
