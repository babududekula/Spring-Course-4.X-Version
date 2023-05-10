package com.pack.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee 
{
	private String ename;
	private String eaddress;
	private int eage;
	private long enumber;
	private float esal;
	private Set<String> education;
	private List<String> ecourse;
	private Map<String , String> ecourse_and_faculty;
	private Account acc;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public long getEnumber() {
		return enumber;
	}
	public void setEnumber(long enumber) {
		this.enumber = enumber;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public Set<String> getEducation() {
		return education;
	}
	public void setEducation(Set<String> education) {
		this.education = education;
	}
	public List<String> getEcourse() {
		return ecourse;
	}
	public void setEcourse(List<String> ecourse) {
		this.ecourse = ecourse;
	}
	public Map<String, String> getEcourse_and_faculty() {
		return ecourse_and_faculty;
	}
	public void setEcourse_and_faculty(Map<String, String> ecourse_and_faculty) {
		this.ecourse_and_faculty = ecourse_and_faculty;
	}
	public void getEmployee()
	{
		System.out.println("Employee Details");
		System.out.println("======================");
		System.out.println("ename               :"+ename);
		System.out.println("eaddress            :"+eaddress);
		System.out.println("eage                :"+eage);
		System.out.println("enumber             :"+enumber);
		System.out.println("esal                :"+esal);
		System.out.println("educatio            :"+education);
		System.out.println("ecourse             :"+ecourse);
		System.out.println("ecourse and faculty :"+ecourse_and_faculty);
		System.out.println();
		System.out.println("======================");
		System.out.println("Account Details");
		System.out.println("=====================");
		System.out.println();
		System.out.println("name   :"+acc.getName());
		System.out.println("id     :"+acc.getId());
		System.out.println("number :"+acc.getNumber());
		System.out.println("age    :"+acc.getAge());
		System.out.println("=====================");
	}
	
}






















