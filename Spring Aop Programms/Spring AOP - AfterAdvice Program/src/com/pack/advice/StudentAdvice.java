package com.pack.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;


import com.pack.beans.Student;

public class StudentAdvice implements AfterReturningAdvice 
{
	
	@Override
	public void afterReturning(Object return_value, Method method, Object[] params, Object target) throws Throwable 
	{
		Student std = (Student)params[0];
		String course = (String) params[1];
		System.out.println("**********************************************************************");
		System.out.println("Thank you "+std.getSname()+" for your course "+method.getName()+" course name is "+course);
		System.out.println("My Team Will Contact You Shortly");
		System.out.println("**********************************************************************");

	}

}
