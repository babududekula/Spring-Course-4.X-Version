package com.pack.beans;

public class Employee 
{
	private String eid;
	private String ename;
	private EmployeeAdress eaddr;
	private float esal;
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public EmployeeAdress getEaddr() {
		return eaddr;
	}
	public void setEaddr(EmployeeAdress eaddr) {
		this.eaddr = eaddr;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public float getEsal() {
		return esal;
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("=================");
		System.out.println("Emp id   :"+eid);
		System.out.println("Emp name :"+ename);
		System.out.println("Emp sal  :"+esal);
		System.out.println();
		System.out.println("=================");
		System.out.println("\n"+"\n");
		System.out.println("Employee Address Details");
		System.out.println("==================");
		System.out.println("Emp hno     :"+eaddr.getHno());
		System.out.println("Emp street  :"+eaddr.getStreet());
		System.out.println("Emp city    :"+eaddr.getCity());
		System.out.println("Emp state   :"+eaddr.getState());
		System.out.println("Emp Country :"+eaddr.getCountry());
	}
}
