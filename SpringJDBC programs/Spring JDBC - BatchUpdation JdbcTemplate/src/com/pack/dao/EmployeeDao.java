package com.pack.dao;

import java.util.List;

import com.pack.dto.Employee;

public interface EmployeeDao 
{
	public int[] insert(List<Employee> empList);
	public int[] update();
}
