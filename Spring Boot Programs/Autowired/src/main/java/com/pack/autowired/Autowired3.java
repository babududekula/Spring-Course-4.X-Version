package com.pack.autowired;

import org.springframework.stereotype.Component;

@Component
public class Autowired3 implements Autowired1
{
	public String method2(String name)
	{
		return "Good "+name;
	}

	@Override
	public String method1(String name) {
		
		return "Good "+name;
	}
}
