package com.pack.beans;

public class Employee 
{
	private String employeeName;
	private String employeePassword;
	private int employeeAge;
	private Address address;
	private Account account;
	
	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeePassword() {
		return employeePassword;
	}


	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}


	public int getEmployeeAge() {
		return employeeAge;
	}


	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}

	

	public void method1()
	{
		System.out.println("Adress Details");
		System.out.println("===============");
		System.out.println("Colony    :"+address.getColony());
		System.out.println("city      :"+address.getCity());
		System.out.println("State     :"+address.getState());
		System.out.println("Country   :"+address.getCountry());
		System.out.println("===============");
		System.out.println();
		System.out.println("Account Details");
		System.out.println("===============");
		System.out.println("Account Number    :"+account.getAccNo());
		System.out.println("Account Name      :"+account.getAccName());
		System.out.println("Account Type      :"+account.getAccType());
		System.out.println("Account Branch    :"+account.getAccBranch());
		System.out.println("Account Balance   :"+account.getAccBalance());
		System.out.println("===============");
		System.out.println();
		System.out.println("Employee Details");
		System.out.println("===============");
		System.out.println("Employee Name     :"+employeeName);
		System.out.println("Employee Password :"+employeePassword);
		System.out.println("Employee Age      :"+employeeAge);
		
		System.out.println("===============");
		System.out.println();
		
	}
}
