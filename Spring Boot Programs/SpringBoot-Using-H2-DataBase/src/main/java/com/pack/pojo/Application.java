package com.pack.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.domain.Persistable;

@Entity
@Table(name="application")
public class Application implements Serializable , Persistable<Integer>
{
	public static boolean isNew = true; 
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="NUMBER")
	private int number;
	@Column(name="NAME")
	private String name;
	@Column(name="COST")
	private String cost;
	@Column(name="DATE")
	private Date date ;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public boolean isNew() 
	{
		return isNew;
	}
	@Override
	public Integer getId() 
	{
		return number;
	}
	
	
	
	
}
