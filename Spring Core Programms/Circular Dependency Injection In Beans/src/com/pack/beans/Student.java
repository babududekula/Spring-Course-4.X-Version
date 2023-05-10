package com.pack.beans;

public class Student 
{
	private Branch branch;
	/*
	public Student(Branch branch) 
	{
		this.branch=branch;
	}
	*/
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Branch getBranch() {
		return branch;
	}
	public String getMethod()
	{
		return "Degree";
	}
}
