package com.pack.service;

import com.pack.pojo.Employee;

public interface EmployeeService 
{
	public String addModule(Employee employee);
	public Employee searchModule(String enumber);
	public String updateModule(Employee employee);
	public String deleteModule(String enumber);
}
