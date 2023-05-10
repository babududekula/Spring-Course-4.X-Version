package com.pack.beans;

public class Student 
{
	private String name;
	private int age;
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
	
	public void method()
	{
		System.out.println("Student Name "+name);
		System.out.println("Student Age  "+age);
	}
}
