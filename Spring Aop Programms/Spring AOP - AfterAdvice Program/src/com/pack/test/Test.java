package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Student;
import com.pack.service.InstituteService;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Student std = (Student) context.getBean("studentBean");
		InstituteService institude_Service = (InstituteService) context.getBean("proxy");
		institude_Service.enquiry(std, "JAVA");
		System.out.println("");
		System.out.println("================================================");
		institude_Service.registration(std, "JAVA");
		
		
	}
}
