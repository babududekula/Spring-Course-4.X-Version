package com.pack.beans;

public class WishBean 
{
	private String name;
	private int age;
	private String upwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String sayWish()
	{
		return "Hey "+name+ "age is "+age+ "password is "+upwd;
	}
		

	public void initializeBean()
	{
		
	}
	
	
}
