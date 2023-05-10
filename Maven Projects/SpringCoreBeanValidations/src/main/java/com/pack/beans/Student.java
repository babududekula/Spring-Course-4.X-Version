package com.pack.beans;

public class Student 
{
	private String id;
	private String name;
	private int age;
	private String mail;
	private String mobile;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void method()
	{
		System.out.println("Student Details");
		System.out.println("================");
		System.out.println("Student Id     :"+id);
		
		 System.out.println("Student Name   :"+name);
		  System.out.println("Student Age    :"+age);
		  System.out.println("Student Mail   :"+mail);
		 System.out.println("Student Mobile :"+mobile);
		 System.out.println("================");
		 
		
	}
}
