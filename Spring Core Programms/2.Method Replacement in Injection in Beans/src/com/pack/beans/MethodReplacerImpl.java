package com.pack.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MethodReplacerImpl implements MethodReplacer 
{

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable 
	{
		System.out.println("Student Details");
		System.out.println("===================");
		System.out.println("Student id       : 1");
		System.out.println("Student Name     : Dudekula Babu");
		System.out.println("Student addr     : Venkatagiri");
		System.out.println("Student attende  :80 percent");
		System.out.println("===================");
		
		return null;
	}

}
