package com.pack.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.HelloBean;
import com.pack.beans.WelcomeBean;
import com.pack.beans.WishBean;

public class Test 
{

	
	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
//		HelloBean hello = (HelloBean) context.getBean("hello");
//		System.out.println(hello.sayHello()); 
		WelcomeBean welcome = (WelcomeBean) context.getBean("welcome");
		System.out.println(welcome.sayWelcome());
		WishBean wish = (WishBean) context.getBean("wish");
		System.out.println(wish.sayWish());
		context.registerShutdownHook();
	}

}
