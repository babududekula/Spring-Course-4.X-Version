package com.pack.beans;

public class Customer 
{
	private String cname;
	private int cage;
	private float csal;
	private Employee employee;
	
	public Customer(String cname , int cage , float csal , Employee employee) 
	{
		this.cname=cname;
		this.cage=cage;
		this.csal=csal;
		this.employee=employee;
	}
	public void getCustomerDetails()
	{
		System.out.println();
		System.out.println("Customer Details");
		System.out.println("==================");
		System.out.println("emp name:"+cname);
		System.out.println("emp age :"+cage);
		System.out.println("emp sal :"+csal);
		System.out.println();
		employee.getEmployeeDetails();
		
	}
}
