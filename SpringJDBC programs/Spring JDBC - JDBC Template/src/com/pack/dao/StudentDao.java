package com.pack.dao;

import java.util.List;

public interface StudentDao 
{
	public String add(Student std);
	public Student serach(String sid);
	public String update(Student std);
	public String delete(String sid);
	public List<Student> getAllEmployees();
	
}
