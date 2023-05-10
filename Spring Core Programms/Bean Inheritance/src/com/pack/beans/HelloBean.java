package com.pack.beans;

public class HelloBean 
{
	private String name;
	private String upwd;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public void init()
	{
		System.out.println("this is init().");
	}
	public void destroy()
	{
		System.out.println("this is destroy().");
	}
	
	public String sayHello()
	{
		return name + " and password is "+upwd;
	}	
}
