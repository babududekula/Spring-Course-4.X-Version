package com.pack.dao;

import com.pack.beans.Employee;

public interface EmployeeDao 
{
	public String add(Employee emp);
	public Employee serach(int eno);
	public String update(Employee emp);
	public String delete(Employee emp);
}
