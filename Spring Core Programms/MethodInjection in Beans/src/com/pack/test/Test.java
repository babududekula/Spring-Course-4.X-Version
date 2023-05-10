package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Student student1 = (Student) context.getBean("studentBean");
		Student student2 = (Student) context.getBean("studentBean");
		Student student3 = (Student) context.getBean("studentBean");
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println();
		
		System.out.println(student1.getCourse());
		System.out.println(student2.getCourse());
		System.out.println(student3.getCourse());
		

	}

}
