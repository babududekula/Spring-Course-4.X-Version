package com.pack.beans;

public class User 
{
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login()
	{
		return "Hello User Your User Name is "+name+ " And Password is "+password;
	}
	
}
