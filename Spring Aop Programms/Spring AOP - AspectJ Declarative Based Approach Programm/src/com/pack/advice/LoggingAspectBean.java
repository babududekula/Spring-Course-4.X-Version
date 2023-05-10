package com.pack.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspectBean 
{
	public void before(JoinPoint jp) 
	{
		System.out.println(" 1 Before "+jp.getSignature().getName()+" method() Execution");
		
	}
	public void after(JoinPoint jp)
	{
		System.out.println(" 2 After "+jp.getSignature().getName()+" method() Execution");
	}
	public void afterReturning(JoinPoint jp , Object results)
	{
		System.out.println(" 3 After Returning "+jp.getSignature().getName()+" method results is "+results+" ...");
	}
	public void around(ProceedingJoinPoint pjp)
	{
		System.out.println(" 4 Before "+pjp.getSignature().getName()+" method() is Execution");
		try 
		{
			pjp.proceed();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
		System.out.println(" 5 After "+pjp.getSignature().getName()+" Mehtod() is Execution");
	}
	public void afterThrowing(JoinPoint jp , Throwable t)
	{
		System.out.println("After Throwing Exception "+t+" from "+jp.getSignature().getName()+" method");
	}
}
