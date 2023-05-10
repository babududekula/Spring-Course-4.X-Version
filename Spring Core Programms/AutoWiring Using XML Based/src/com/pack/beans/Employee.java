package com.pack.beans;

public class Employee 
{
	private String eid;
	private String ename;
	private float esal;
	private Account account;
	private Address address;
	
	public Employee(String eid , String ename , float esal , Account account , Address address) 
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.account=account;
		this.address=address;
		
	}
	
	
/*	
	public String getEid() 
	{
		return eid;
	}
	public void setEid(String eid) 
	{
		this.eid = eid;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public float getEsal() 
	{
		return esal;
	}
	public void setEsal(float esal) 
	{
		this.esal = esal;
	}
	public Account getAccount() 
	{
		return account;
	}
	public void setAccount(Account account) 
	{
		this.account = account;
	}
	public Address getAddress() 
	{
		return address;
	}
	public void setAddress(Address address) 
	{
		this.address = address;
	}
	
	*/
	public void getEmp()
	{
		System.out.println("Employee Deatilas");
		System.out.println("=======================");
		System.out.println("employee id      :"+eid);
		System.out.println("employee name    :"+ename);
		System.out.println("employee salary  :"+esal);
		System.out.println();
		System.out.println("Employee Account Details");
		System.out.println("=======================");
		System.out.println("Account number   :"+account.getAccno());
		System.out.println("Account name     :"+account.getAccname());
		System.out.println("Account Type     :"+account.getAcctype());
		System.out.println("Account Balance  :"+account.getBalance());
		System.out.println();
		System.out.println("Employee Address Deatails");
		System.out.println("=======================");
		System.out.println("House Number     :"+address.getHno());
		System.out.println("Street           :"+address.getStreet());
		System.out.println("city             :"+address.getCity());
		System.out.println("state            :"+address.getState());
	}
	
}



















