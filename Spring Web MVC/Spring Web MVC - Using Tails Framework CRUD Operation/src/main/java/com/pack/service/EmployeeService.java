package com.pack.service;

import com.pack.command.Employee;

public interface EmployeeService 
{
	public String add(Employee employee);
	public Employee serach(String enumber);
	public String update(Employee employee);
	public String delete(String enumber);
}
