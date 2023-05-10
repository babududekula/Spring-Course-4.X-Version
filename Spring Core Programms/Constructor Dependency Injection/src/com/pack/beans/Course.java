package com.pack.beans;

public class Course 
{
	private String cname;
	private String cid;
	private int cvalue;
	private String ctime;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public int getCvalue() {
		return cvalue;
	}
	public void setCvalue(int cvalue) {
		this.cvalue = cvalue;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public Course()
	{
		System.out.println("this is 0 argument Constructor");
	}
	public Course(String cname , String cid , int cvalue , String ctime)
	{
		this.cname = cname;
		this.cid = cid;
		this.cvalue = cvalue;
		this.ctime = ctime;
	}
	public Course(String name , String cid)
	{
		this.cname=name;
		this.cid=cid;
	}
	
	public void getDetails()
	{
		System.out.println("Course Details");
		System.out.println("=====================");
		System.out.println("cname  :"+cname);
		System.out.println("cid    :"+cid);
		System.out.println("cvalue :"+cvalue);
		System.out.println("ctime  :"+ctime);
		System.out.println("=====================");
	}
}
