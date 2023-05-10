package com.pack.beans;

public class Student 
{
	private int sid;
	private String sname;
	private String saddr;
	private String sattendence;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public String getSattendence() {
		return sattendence;
	}
	public void setSattendence(String sattendence) {
		this.sattendence = sattendence;
	}
	
	public void getStudentDetails()
	{
		System.out.println("Student Details");
		System.out.println("===================");
		System.out.println("sid      :"+sid);
		System.out.println("sname    :"+sname);
		System.out.println("saddr    :"+saddr);
		System.out.println("sattend  :"+sattendence);
		System.out.println("===================");
	}
}
