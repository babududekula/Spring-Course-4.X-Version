package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.User;

public class Client 
{
	public void checkCredentials()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resources/applicationContext.xml");
		User user = (User) context.getBean("userBean");
		String status = user.login();
		System.out.println(status);
	}
}
