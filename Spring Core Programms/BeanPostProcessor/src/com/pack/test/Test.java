package com.pack.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Customer;

public class Test 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Customer cust = (Customer) context.getBean("cust");
		cust.getDeatils();
		context.registerShutdownHook();
		
	}
}
