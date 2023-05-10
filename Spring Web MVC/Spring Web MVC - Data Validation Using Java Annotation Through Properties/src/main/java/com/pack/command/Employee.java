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
	@NotEmpty
	private String ename;
	
	@NotEmpty
	@Size(min=6 , max=20)
	private String epwd;
	
	@NotNull
	@Range(min=18 , max=30)
	private int eage;
	
	@NotEmpty
	@Email
	private String eemail;
	
	@NotEmpty
	@Pattern(regexp = "91-[0-9]{10}")
	private String emobile;
	
	@NotNull
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Past
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
