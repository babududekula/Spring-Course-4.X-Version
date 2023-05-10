package com.pack.dao;

import com.pack.beans.StudentDto;

public interface StudentDao 
{
	public String add(StudentDto student);
	public StudentDto serach(String sid);
	public String update(StudentDto student);
	public String delete(String sid);
}
