package com.pack.beans;

public class Employee 
{
	private String ename;
	private int eage;
	private float esal;
	
	public Employee(String ename , int eage , float esal) 
	{
		this.ename=ename;
		this.eage=eage;
		this.esal=esal;
	}
	public void getEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("===================");
		System.out.println("cname   :"+ename);
		System.out.println("cage    :"+eage);
		System.out.println("csal    :"+esal);
		System.out.println();

	}
	public String method1()
	{
		return "This is Constructor c NameSpace";
	}
}
