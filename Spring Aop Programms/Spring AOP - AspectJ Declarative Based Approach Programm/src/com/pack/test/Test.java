package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Employee;
import com.pack.service.EmployeeService;

public class Test 
{
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Employee employee = (Employee) context.getBean("employeeBean");
		
		EmployeeService empService = (EmployeeService) context.getBean("target");
		
		try 
		{
			empService.createEmployee(employee);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
