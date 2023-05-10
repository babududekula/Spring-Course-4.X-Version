package com.pack.dao;

import java.util.List;

import com.pack.pojo.Employee;

public interface EmployeeDao 
{
	public String add(Employee employee);
	public Employee search(String enumber);
	public String update(Employee employee);
	public String delete(String enumber);
	public List<Employee> getAllEmployees();
}
