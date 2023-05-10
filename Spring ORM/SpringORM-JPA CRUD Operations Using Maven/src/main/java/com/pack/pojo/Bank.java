package com.pack.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank")

public class Bank 
{
	@Id
	@Column(name="BNAME")
	private String bname;
	@Column(name="BID")
	private int bid;
	@Column(name="BACCOUNT")
	private String baccount;
	@Column(name="BBALANCE")
	private float bbalance;
	@Column(name="BBRANCH")
	private String bbranch;
	
	public String getBname() 
	{
		return bname;
	}
	public void setBname(String bname) 
	{
		this.bname = bname;
	}
	public int getBid() 
	{
		return bid;
	}
	public void setBid(int bid) 
	{
		this.bid = bid;
	}
	public String getBaccount() 
	{
		return baccount;
	}
	public void setBaccount(String baccount) 
	{
		this.baccount = baccount;
	}
	public float getBbalance() 
	{
		return bbalance;
	}
	public void setBbalance(float bbalance) 
	{
		this.bbalance = bbalance;
	}
	public String getBbranch() 
	{
		return bbranch;
	}
	public void setBbranch(String bbranch) 
	{
		this.bbranch = bbranch;
	}
	
	
}
