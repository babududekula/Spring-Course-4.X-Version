package com.pack.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.WelcomeBean;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		WelcomeBean welcomeBean =(WelcomeBean) context.getBean("welcomeBean");
		System.out.println(welcomeBean.sayWelcome());
		context.registerShutdownHook();
		
		
	}

}
