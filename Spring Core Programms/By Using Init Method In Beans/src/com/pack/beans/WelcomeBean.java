package com.pack.beans;

public class WelcomeBean 
{
	private String name;
	private String upwd;
	private int age ;
	private float salary;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void sayWelcome()
	{
		System.out.println("My Deatails");
		System.out.println("=============================");
		System.out.println("name  :"+name);
		System.out.println("upwd  :"+upwd);
		System.out.println("age   :"+age);
		System.out.println("salary:"+salary);
		System.out.println("=============================");
	} 
	public void init()
	{
		name = "Babu";
		upwd = "Babu1523";
		age  = 25;
		salary = 25600.0f;
		
	}

	public void destroy()
	{
		System.out.println("Destroy is successfully completed....");
	}
	
}
