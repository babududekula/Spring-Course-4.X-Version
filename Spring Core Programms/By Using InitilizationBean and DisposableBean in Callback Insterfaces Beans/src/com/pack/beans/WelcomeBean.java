package com.pack.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public  class WelcomeBean implements InitializingBean , DisposableBean
{
	private String message;
	private int age;
	private String name;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String sayWelcome()
	{
		return "Hello "+name+" "+message+" age is "+age;
	}
	@Override
	public void destroy() throws Exception 
	{
		System.out.println("destroy");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception 
	{
	//	message = "Welcome to the spring FrameWork";
		System.out.println("afterPropertiesSet()");
		
	}
	
}
