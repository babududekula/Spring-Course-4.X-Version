package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Branch1;
import com.pack.beans.Student1;

public class Test1 
{

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext1.xml");
		
		
		Branch1 br = (Branch1) context.getBean("branch");
		System.out.println(br.getMethod());
		
		Student1 std = (Student1) context.getBean("student");
		System.out.println(std.getbranch());

	}

}
