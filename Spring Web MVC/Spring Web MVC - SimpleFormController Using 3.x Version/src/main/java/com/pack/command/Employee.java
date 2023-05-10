package com.pack.command;

public class Employee 
{
	private String uname;
	private String upwd;
	private boolean metitalstatus1;
	private String meritalstatus2;
	private String[] uqual1;
	private String[] uqual2;
	private String ugender;
	private String ulocation;
	private String[] uskills;
	private String[] uhobby;
	private String uprofession;
	private String uaddress;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setMetitalstatus1(boolean metitalstatus1) {
		this.metitalstatus1 = metitalstatus1;
	}
	public boolean isMetitalstatus1() {
		return metitalstatus1;
	}
	public void setMeritalstatus2(String meritalstatus2) {
		this.meritalstatus2 = meritalstatus2;
	}
	public String getMeritalstatus2() {
		if(meritalstatus2==null || meritalstatus2.equals(""))
		{
			meritalstatus2 = "Married";
		}
		return meritalstatus2;
		
	}
	public void setUqual1(String[] uqual1) {
		this.uqual1 = uqual1;
	}
	public String[] getUqual1() {
		return uqual1;
	}
	public void setUqual2(String[] uqual2) {
		this.uqual2 = uqual2;
	}
	public String[] getUqual2() {
		return uqual2;
	}
	public void setUgender(String ugender) {
		this.ugender = ugender;
	}
	public String getUgender() {
		return ugender;
	}
	public void setUlocation(String ulocation) {
		this.ulocation = ulocation;
	}
	public String getUlocation() {
		return ulocation;
	}
	public void setUskills(String[] uskills) {
		this.uskills = uskills;
	}public String[] getUskills() {
		return uskills;
	}
	public void setUhobby(String[] uhobby) {
		this.uhobby = uhobby;
	}
	public String[] getUhobby() {
		return uhobby;
	}
	public void setUprofession(String uprofession) {
		this.uprofession = uprofession;
	}
	public String getUprofession() {
		return uprofession;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public String getUaddress() {
		return uaddress;
	}
	
}
