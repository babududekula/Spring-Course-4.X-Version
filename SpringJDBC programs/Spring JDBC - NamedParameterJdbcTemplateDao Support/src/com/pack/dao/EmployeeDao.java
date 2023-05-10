package com.pack.dao;

import java.util.List;

import com.pack.dto.Employee;

public interface EmployeeDao 
{
	public String add(Employee emp);
	public Employee serach(int eid);
	public List<Employee> getAllEmployees();
	public String update(Employee emp);
	public String delete(int eid);
}
