package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Show;
import com.pack.service.ShowService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Show show = (Show) context.getBean("showBean");
		
		ShowService showservice = (ShowService) context.getBean("target");
		
		String status;
		try 
		{
			status = showservice.runShow(show);
		} catch (Exception e) 
		{
			
		}

	}

}
