package com.pack.service;

import com.pack.beans.Employee;

public interface EmployeeService 
{
	public void createEmployee(Employee emp)throws Exception;
	public void serachEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(Employee emp);
}
