package com.pack.Interface;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MethodReplaceImpl implements MethodReplacer
{
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable 
	{
		System.out.println("Student Details");
		System.out.println("=======================");
		System.out.println("Student name  :  Durga");
		System.out.println("Student sid   :  10");
		System.out.println("Student colleg:  ESS Degree College");
		System.out.println("Student Mobile:  0908976");
		System.out.println("=======================");
		return null;
	}
}