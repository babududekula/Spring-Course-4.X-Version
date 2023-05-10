package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Branch;
import com.pack.beans.Student;

public class Test {

	public static void main(String[] args) throws Exception
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Student std = (Student) context.getBean("student");
		System.out.println(std.getMethod());
		
		Branch br = (Branch) context.getBean("branch");
		System.out.println(br.getDeatils());

	}

}
