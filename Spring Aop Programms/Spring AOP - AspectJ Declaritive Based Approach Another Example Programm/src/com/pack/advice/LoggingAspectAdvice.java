package com.pack.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.pack.beans.Show;

public class LoggingAspectAdvice 
{
	
	
	public void before()
	{
		System.out.println("Get Tickets For show");
	}
	public void after()
	{
		System.out.println("Show Is Completed");
	}
	public void afterReturning()
	{
		System.out.println("Thank you For Attending This show");
	}
	public void around(ProceedingJoinPoint jp)
	{
		System.out.println("Show is Started now");
		try 
		{
			jp.proceed();
		} catch (Throwable e) 
		{
			e.printStackTrace();
		}
		System.out.println("Show is end "+jp.getSignature().getName()+" now");
	}
	public void afterThrowing()
	{
		System.out.println("There is an Interruption Because This show is Not Mimicry Show , Please Come and Collect your Cash");
		
	}
}
