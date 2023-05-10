package com.pack.beans;

public class Employee 
{
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	} 
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	} 
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public void getEmployeeDetails()
	{
		System.out.println("Employee Details");
		System.out.println("=====================");
		System.out.println("Emp no     :"+eno);
		System.out.println("Emp name   :"+ename);
		System.out.println("Emp sal    :"+esal);
		System.out.println("Emp address:"+eaddr);
		System.out.println("=====================");
	}
}
