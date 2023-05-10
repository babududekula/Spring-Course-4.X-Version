package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.HelloBean;

public class Test 
{

	public static void main(String[] args) throws Exception
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloBean hello = (HelloBean)context.getBean("helloBean");
		System.out.println(hello.sayHello());
	}

}
