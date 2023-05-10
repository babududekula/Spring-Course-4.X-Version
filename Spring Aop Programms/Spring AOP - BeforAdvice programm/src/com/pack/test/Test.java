package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.bean.Employee;
import com.pack.service.EmployeeService;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Employee emp = (Employee) context.getBean("employee");
		
		EmployeeService empService = (EmployeeService) context.getBean("proxy");
		empService.getEmployeeDetails(emp);
		System.out.println("============================================================================");
		empService.displayEmployeeDdetails(emp);
	}
}
