package com.pack.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class GoodNight implements InitializingBean , DisposableBean
{
	private String name;
	private int age;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
		System.out.println("Setting name");
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
		System.out.println("Setting age");
	}
	public String sayName()
	{
		return name;
	}
	public int sayAge()
	{
		return age;
	}
	@Override
	public void afterPropertiesSet() throws Exception 
	{
//		name = "Babu";
//		age = 10;
		System.out.println("Name Initilized");
	}
	@Override
	public void destroy() throws Exception 
	{
		System.out.println("Destruction Successfully");
	}
	
	
	
}
