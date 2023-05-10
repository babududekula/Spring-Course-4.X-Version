package com.pack.beans;

public class EmployeeBean 
{
	private String empName;
	private String empAddress;
	private int empAge;
	private String empId;
	private Account acc;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void getEmpDeatails()
	{
		System.out.println("Employee Details");
		System.out.println("==========================");
		System.out.println("emp name  :"+empName);
		System.out.println("empAddress:"+empAddress);
		System.out.println("empAge    :"+empAge);
		System.out.println("empId     :"+empId);
		System.out.println("==========================");
		System.out.println("Account Details");
		System.out.println("==========================");
	
		System.out.println("accNo     :"+acc.getAccNo());
		System.out.println("accName   :"+acc.getAccName());
		System.out.println("accDate   :"+acc.getAccDate());
		System.out.println("accSal    :"+acc.getAccSal());
		System.out.println("accType   :"+acc.getAccType());
		
	}
	
	
}
