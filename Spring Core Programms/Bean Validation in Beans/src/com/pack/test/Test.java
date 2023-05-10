package com.pack.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.pack.beans.Employee;
import com.pack.validators.EmployeeValidator;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/ApplicationContext.xml");
		Employee emp = (Employee) context.getBean("emp");
		emp.getEmployeeDetails();
		EmployeeValidator employeeValidator = (EmployeeValidator) context.getBean("empValidator");
		Map<String , String> map = new HashMap<String , String>();
		MapBindingResult result = new MapBindingResult(map, "com.pack.beans.Employee");
		employeeValidator.validate(emp, result);
		List<ObjectError> list = result.getAllErrors();
		for(ObjectError e: list)
		{
			System.out.println(e.getDefaultMessage());
		}
	}
}
