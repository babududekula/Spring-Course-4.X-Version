package com.pack.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.pack.beans.Account;
import com.pack.exception.InsufficientBalanceException;
@Component
@Aspect
public class AccountAspectAdvice 
{
	@Before("execution(* com.pack.service.AccountService.*(..))")
	public void before(JoinPoint jp)
	{
		Object[] params = jp.getArgs();
		Account account = (Account) params[0];
		
		System.out.println("Before Advice :Initial Balance :"+account.getAccBalance());
	}
	
	@After("execution(* com.pack.service.AccountService.*(..))")
	public void after(JoinPoint jp)
	{
		Object[] params = jp.getArgs();
		Account account = (Account)params[0];
		
		System.out.println("After Advice :Initial Balance :"+account.getAccBalance());
	}
	
	@AfterReturning(pointcut="execution(* com.pack.service.AccountService.*(..))", returning = "results")
	public void afterReturning(JoinPoint jp , String results)
	{
		System.out.println("Transaction status :"+results);
	}
	
	@Around("execution(* com.pack.service.AccountService.*(..))")
	public void around(ProceedingJoinPoint jp)
	{
		System.out.println("Before TransAction "+jp.getSignature().getName()+ " it is started.....");
		try 
		{
			jp.proceed();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
		System.out.println("After TransAction "+jp.getSignature().getName()+ " it is Completed....");
	}
	
	@AfterThrowing(pointcut ="execution(* com.pack.service.AccountService.*(..))" , throwing = "exception")
	public void afterThrowing(JoinPoint jp , InsufficientBalanceException exception)
	{
		System.out.println("After Throwing this :"+jp.getSignature().getName()+" is opetion :"+exception.getMessage()+" occured");
	}
}







