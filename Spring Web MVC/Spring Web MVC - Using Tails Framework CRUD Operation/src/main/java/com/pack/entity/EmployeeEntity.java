package com.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity 
{
	@Id
	@Column(name="enumber")
	private String enumber;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="epwd")
	private String epwd;
	
	@Column(name="eage")
	private int eage;
	
	@Column(name="email")
	private String email;
	
	@Column(name="emobile")
	private String emobile;
	
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
	public void setEnumber(String enumber) {
		this.enumber = enumber;
	}
	public String getEnumber() {
		return enumber;
	}
	
	
}
