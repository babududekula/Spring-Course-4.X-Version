package com.pack.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.domain.Persistable;
import org.springframework.lang.NonNull;


@Entity
@Table(name = "mobile")
public class Mobile implements Persistable<String> , Serializable
{
	public static boolean isNew = true;
	
	@Id
	
	@Column(name="MOBILENAME")
	private String mobileName;
	@Column(name="MOBILENUMBER")
	private String mobileNumber;
	@Column(name="MOBILEAGE")
	private int mobileAge;
	@Column(name="MOBILEADDRESS")
	private String mobileAddress;
	@Column(name="MOBILEDATE")
	private Date mobileDate;

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getMobileAge() {
		return mobileAge;
	}

	public void setMobileAge(int mobileAge) {
		this.mobileAge = mobileAge;
	}

	public String getMobileAddress() {
		return mobileAddress;
	}

	public void setMobileAddress(String mobileAddress) {
		this.mobileAddress = mobileAddress;
	}

	public Date getMobileDate() {
		return mobileDate;
	}

	public void setMobileDate(Date mobileDate) {
		this.mobileDate = mobileDate;
	}

	@Override
	public String getId() {
		
		return mobileNumber;
	}

	@Override
	public boolean isNew() {
		
		return isNew;
	}

}
