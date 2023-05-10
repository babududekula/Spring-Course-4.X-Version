package com.pack.beans;

public class Account 
{
	private String name;
	private String id;
	private long number;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getAccountDeatils()
	{
		System.out.println("Account Deatails");
		System.out.println("=====================");
		System.out.println("name   :"+name);
		System.out.println("id     :"+id);
		System.out.println("number :"+number);
		System.out.println("age    :"+age);
		System.out.println("=====================");
	}
}




















