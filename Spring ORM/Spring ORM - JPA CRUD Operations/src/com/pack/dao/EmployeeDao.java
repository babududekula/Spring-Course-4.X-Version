package com.pack.dao;

import com.pack.entity.Employee;

public interface EmployeeDao 
{
	public String add(Employee emp);
	public Employee search(int eno);
	public String update(Employee emp);
	public String delete(int eno);
}
