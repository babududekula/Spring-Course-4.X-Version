package com.pack.daoimpl;

import java.util.List;

import com.pack.entity.Employee;

public interface EmployeeDao 
{
	public String upset(Employee employee);
	public Employee search(int id);
	public List<Employee> getAllEmployees();
	public String delete(int id);
}
