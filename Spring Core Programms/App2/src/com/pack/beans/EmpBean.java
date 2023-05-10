package com.pack.beans;

public class EmpBean 
{
	private String name;
	private String upwd;
	private int number;
	private long mobile;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void getEmp()
	{
		System.out.println("Employee details");
		System.out.println("-----------------------------------");
		System.out.println("emp name  :" +name);
		System.out.println("emp upwd  :" +upwd);
		System.out.println("emp number:" +number);
		System.out.println("emp mobile:" +mobile);
	}
	
}
