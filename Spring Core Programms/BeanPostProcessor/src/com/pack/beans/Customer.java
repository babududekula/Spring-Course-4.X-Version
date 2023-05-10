package com.pack.beans;

public class Customer 
{
	private String cName;
	private String cNumber;
	private String cid;
	private String cmail;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcNumber() {
		return cNumber;
	}
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCmail() {
		return cmail;
	}
	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	public void init()
	{
		System.out.println("this is initilization.....");
		
	}
	public void destroy()
	{
		System.out.println("this is destroying the object...");
	}
	public void getDeatils()
	{
		System.out.println("Deatils of Account");
		System.out.println("====================");
		System.out.println("name  :"+cName);
		System.out.println("Number:"+cNumber);
		System.out.println("Id    :"+cid);
		System.out.println("Mail  :"+cmail);
		System.out.println("====================");
		
		
	}
}
