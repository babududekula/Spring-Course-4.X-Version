package com.pack.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Account 
{
	private String saccname;
	private long saccnumber;
	private float saccbalance;
	private Student student;
	

	@Autowired(required=true)
	public Account(String saccname, long saccnumber, float saccbalance, @Qualifier("name") Student student) 
	{
		this.saccname=saccname;
		this.saccnumber=saccnumber;
		this.saccbalance=saccbalance;
		this.student=student;
	}
	
/*	
	public String getSaccname() {
		return saccname;
	}
	public void setSaccname(String saccname) {
		this.saccname = saccname;
	}
	public long getSaccnumber() {
		return saccnumber;
	}
	public void setSaccnumber(long saccnumber) {
		this.saccnumber = saccnumber;
	}
	public float getSaccbalance() {
		return saccbalance;
	}
	public void setSaccbalance(float saccbalance) {
		this.saccbalance = saccbalance;
	}
	public Student getStudent() {
		return student;
	}
	@Required
	@Autowired
	@Qualifier("name")
	public void setStudent(Student student) {
		this.student = student;
	}
	
	*/
	
	
	
	public void getStudentDetails()
	{
		System.out.println("Student Account Details");
		System.out.println("======================");
		System.out.println("account name  :"+saccname);
		System.out.println("account number:"+saccnumber);
		System.out.println("account balanc:"+saccbalance);
		System.out.println();
		System.out.println("Student Details");
		System.out.println("======================");
		System.out.println("student name  :"+student.getSname());
		System.out.println("student number:"+student.getSnumber());
		System.out.println("student addres:"+student.getSaddress());
		System.out.println("student age   :"+student.getSage());
		System.out.println();
		System.out.println("=====================");
	}
}









