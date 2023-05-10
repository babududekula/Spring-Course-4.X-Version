package com.pack.advice.validator;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


import com.pack.bean.Employee;

public class EmployeeValidatorAdviceImpl implements MethodBeforeAdvice 
{

	@Override
	public void before(Method method, Object[] params, Object target) throws Throwable 
	{
		Employee emp = (Employee) params[0];
		System.out.println("validation message for "+method.getName());
		System.out.println("=====================================");
		if(emp.getEno() < 100 || emp.getEno() > 999)
		{
			System.out.println("**** Employee Number must be in 3 digit Number ****");
		}
		if(emp.getEsal() < 20000 || emp.getEsal() > 50000)
		{
			System.out.println("**** Employee salary should be in 20000 to 50000 only ****");
		}
		if(!emp.getEmobile().startsWith("+91-"))
		{
			System.out.println("**** Employee Number Should follow Country code ****");
		}
		if(!emp.getEemail().endsWith("@gmail.com"))
		{
			System.out.println("**** Employee mail ends With Proper name ****");
		}
	}
	
}
