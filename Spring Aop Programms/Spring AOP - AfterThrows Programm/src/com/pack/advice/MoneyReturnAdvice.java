package com.pack.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;


import com.pack.beans.Movie;

public class MoneyReturnAdvice implements ThrowsAdvice 
{
	
	public void afterThrowing(Method method , Object[] params , Object target , Exception e )
	{
		Movie m = (Movie) params[0];
		System.out.println(" ");
		System.out.println("**********************************************");
		System.out.println("Unfortunately The movie "+m.getName()+" was Stopper please Collect Your Money in Counter ");
		System.out.println("Thank You For Your Coopetion Please Visit us Again");
		System.out.println("**********************************************");
	}
}

