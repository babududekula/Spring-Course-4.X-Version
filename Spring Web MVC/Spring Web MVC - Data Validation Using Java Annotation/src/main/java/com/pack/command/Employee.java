package com.pack.command;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class Employee 
{
	@NotEmpty(message = "Employee Name Is Required")
	private String ename;
	
	@NotEmpty(message = "Employee Password Required")
	@Size(min=6 , max=20 , message = "Employee Password Must Be In Min 6 Letters Or Maximum 20 Letters")
	private String epwd;
	
	@NotNull(message = "Employee Age Is Required")
	@Range(min=18 , max=30 , message = "Employee Age Is Minimus 18 Years And Maximum 30 years")
	private int eage;
	
	@NotEmpty(message = "Employee Mail Is Required")
	@Email
	private String eemail;
	
	@NotEmpty(message = "Employee Mobile Is Required")
	@Pattern(regexp = "91-[0-9]{10}" , message = "Employee Mobile Number Must Be +91-DDDDDDDDDD")
	private String emobile;
	
	@NotNull(message = "Employee DOB Is Required")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Past(message = "Date Should Be Past Date")
	private Date edob;
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
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEmobile() {
		return emobile;
	}
	public void setEmobile(String emobile) {
		this.emobile = emobile;
	}
	public void setEdob(Date edob) {
		this.edob = edob;
	}
	public Date getEdob() {
		return edob;
	}
	
	
}
