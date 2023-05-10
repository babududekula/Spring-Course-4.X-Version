package com.pack.beans;

public class HelloBean 
{
	static
	{
		System.out.println("this is class Loading");
	}
	public HelloBean() 
	{
		System.out.println("this is creating Instatntiation");
	}
	public String sayHello()
	{
		return "Hello User";
	}
	public static HelloBean getBeanInstance()
	{
		System.out.println("this is static factory method");
		return new HelloBean();
	}
}
