package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.WishBean;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		WishBean wishBean = (WishBean)context.getBean("wishBean");
		
		
		
		

	}

}
