package com.pack.pojo;



import org.springframework.data.domain.Persistable;


public class Employee implements Persistable<String> 
{
	public static boolean isNew = true;
	
	@org.springframework.data.annotation.Id
	private String enumber;
	private String ename;
	private String epwd;
	private int eage;
	private String email;
	private String emobile;
	
	@Override
	public String getId() 
	{
		return enumber;
	}
	@Override
	public boolean isNew() 
	{	
		return isNew;
	}
	
	public String getEnumber() {
		return enumber;
	}
	public void setEnumber(String enumber) {
		this.enumber = enumber;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEpwd() {
		return epwd;
	}
	public void setEpwd(String epwd) {
		this.epwd = epwd;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmobile() {
		return emobile;
	}
	public void setEmobile(String emobile) {
		this.emobile = emobile;
	}
}
