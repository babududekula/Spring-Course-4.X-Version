package com.pack.beans;

public class Branch 
{
	private Student name;

/*	public Branch(Student name) 
	{
		this.name=name;
	}
	*/
	public void setName(Student name) {
		this.name = name;
	}
	public Student getName() {
		return name;
	}
	public String getDeatils()
	{
		return "Babu";
	}
}
