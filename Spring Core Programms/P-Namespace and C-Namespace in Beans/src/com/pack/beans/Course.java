package com.pack.beans;

public class Course 
{
	private String cname;
	private String ctype;
	private Student std;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	public void getStudentDetails()
	{
		System.out.println("Course Details");
		System.out.println("=================");
		System.out.println("cname   :"+cname);
		System.out.println("ctype   :"+ctype);
		System.out.println();
		System.out.println("Student Details");
		System.out.println("================");
		System.out.println("sname   :"+std.getSname());
		System.out.println("sage    :"+std.getSage());
	}
}
