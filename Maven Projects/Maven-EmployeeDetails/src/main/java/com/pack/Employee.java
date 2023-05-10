package com.pack;

public class Employee 
{
	String ename;
	String epwd;
	float esal;
	String eaddr;
	
	public Employee(String ename , String epwd , float esal , String eaddr) 
	{
		this.ename = ename;
		this.epwd = epwd;
		this.esal = esal;
		this.eaddr = eaddr;
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("==================");
		System.out.println("Employee Name  :"+ename);
		System.out.println("Employee pass  :"+epwd);
		System.out.println("Employee esal  :"+esal);
		System.out.println("Employee eadd  :"+eaddr);
		System.out.println("==================");
	}
	
}
