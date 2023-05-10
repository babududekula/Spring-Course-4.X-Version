package com.pack.test;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Student;

public class Test 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Student student = (Student) context.getBean("student");
		student.method();
		System.out.println();
		context.refresh();
		context.start();
		context.stop();
		context.close();
		
	}

}
