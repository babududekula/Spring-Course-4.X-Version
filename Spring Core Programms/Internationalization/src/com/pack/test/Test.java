package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.pack.beans.I18NBean;

public class Test 
{
	public static void main(String[] args) throws Exception
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/ApplicationContext.xml");
		I18NBean i18 = (I18NBean) context.getBean("i18Bean");
		i18.displayMessage();
		
		
		
	}
}
