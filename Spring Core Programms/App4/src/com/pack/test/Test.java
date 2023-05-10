package com.pack.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pack.beans.WelcomeBean;
import com.pack.config.AppConfig;

public class Test {

	public static void main(String[] args) throws Exception
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WelcomeBean welBean = (WelcomeBean)context.getBean("welcomeBean");
		System.out.println(welBean.getWelcomeMessage());
		
	}

}
