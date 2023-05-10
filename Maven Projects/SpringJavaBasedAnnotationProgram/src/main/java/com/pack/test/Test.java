package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.bean.GoodNight;


public class Test 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/java/application.xml");
		GoodNight gnit = (GoodNight) context.getBean("beanName");
//		System.out.println(gnit.sayName());
//		System.out.println(gnit.sayAge());
		System.out.println(gnit.sayName());
		System.out.println(gnit.sayAge());
		context.registerShutdownHook();
		
		
	}
}
