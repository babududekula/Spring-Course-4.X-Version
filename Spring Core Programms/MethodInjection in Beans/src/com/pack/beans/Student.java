package com.pack.beans;

public class Student 
{
	private String sid;
	private String sname;
	private String addr;
	private Course course;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public void getStudentDetails()
	{
		System.out.println("Student Details");
		System.out.println("=====================");
		System.out.println("sid    :"+sid);
		System.out.println("Sname  :"+sname);
		System.out.println("saddres:"+addr);
		System.out.println();
		System.out.println("Course Details");
		System.out.println("==================");
		System.out.println("cid    :"+course.getCid());
		System.out.println("cname  :"+course.getCname());
		System.out.println("ccost  :"+course.getCcost());
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
