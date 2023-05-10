package com.pack.dao;

public interface StudentDao 
{
	public String add(Student std);
	public Student serach(String sid);
	public String update(Student std);
	public String delete(String sid);
	
}
