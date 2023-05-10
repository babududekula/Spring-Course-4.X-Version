package com.pack.test;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.pack.beans.Student;
import com.pack.validator.StudentValidator;


public class Test 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/ApplicationContext.xml");
		Student emp = (Student) context.getBean("student");
		emp.method();
		StudentValidator employeeValidator = (StudentValidator) context.getBean("studentValidator");
		Map<String , String> map = new HashMap<String , String>();
		MapBindingResult result = new MapBindingResult(map, "com.pack.beans.Student");
		employeeValidator.validate(emp, result);
		List<ObjectError> list = result.getAllErrors();
		for(ObjectError e: list)
		{
			System.out.println(e.getDefaultMessage());
		}
	}
}
