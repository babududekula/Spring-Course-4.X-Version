package com.pack.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login 
{
	@Id
	@Column(name ="UNAME")
	private String uname;
	@Column(name ="UPWD")
	private String upwd;
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUname() {
		return uname;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUpwd() {
		return upwd;
	}
}
