package com.pack.beans;

public class Employee 
{
	private String eid;
	private String ename;
	private String esal;
	private EmployeeAddress eaddr;
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
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	public EmployeeAddress getEaddr() {
		return eaddr;
	}
	public void setEaddr(EmployeeAddress eaddr) {
		this.eaddr = eaddr;
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("===================");
		System.out.println("Emp id     :"+eid);
		System.out.println("Emp name   :"+ename);
		System.out.println("Emp sal    :"+esal);
	//	System.out.println("Emp eaddr  :"+eaddr);
		System.out.println("==================");
		System.out.println();
		
		System.out.println("Employee address");
		System.out.println("=================");
		System.out.println("Emp hno  :"+eaddr.getHno());
		System.out.println("Emp state:"+eaddr.getState());
		System.out.println("Emp Coun :"+eaddr.getCountry());
		System.out.println("==================");
	}
}
