package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.I18NBean;
import com.pack.beans.I18NBeanClass;

public class Test 
{
	public static void main(String[] args) 
	
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		I18NBeanClass bean = (I18NBeanClass) context.getBean("i18Bean");
		bean.displayMethod();
	}
}
