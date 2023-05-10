package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Course;
import com.pack.beans.Customer;
import com.pack.beans.Employee;
import com.pack.beans.Student;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Course course = (Course) context.getBean("course");
		course.getStudentDetails();
		
		System.out.println();
		
		Student std = (Student) context.getBean("std");
		System.out.println(std.method());
		
		Customer cust = (Customer) context.getBean("customer");
		cust.getCustomerDetails();
		
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp.method1());
		
		System.out.println();
		
		
		
		

	}

}
