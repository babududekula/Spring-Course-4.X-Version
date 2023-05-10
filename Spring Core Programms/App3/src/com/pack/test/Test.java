package com.pack.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.HelloBean;
import com.pack.scopes.ThreadScope;

public class Test 
{

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/ApplicationContext.xml");
		HelloBean bean1 = (HelloBean)context.getBean("hellobean");
		HelloBean bean2 = (HelloBean)context.getBean("hellobean");
		System.out.println(bean1.sayHello());
		System.out.println(bean2.sayHello());
		System.out.println(bean1);
		System.out.println(bean2);
		ThreadScope threadScope = (ThreadScope)context.getBean("threadScope");
		HelloBean bean3 = (HelloBean)threadScope.remove("hellobean");
		System.out.println(bean3);
	}

}
