package com.pack.beans;

public class HelloBean 
{
	static 
	{
		System.out.println("HelloBean class Loading");
	}
	public HelloBean() 
	{
		System.out.println("Hellobean class Instantiation");
	}
	public String sayHello()
	{
		return "Hello User!";
	}
}
