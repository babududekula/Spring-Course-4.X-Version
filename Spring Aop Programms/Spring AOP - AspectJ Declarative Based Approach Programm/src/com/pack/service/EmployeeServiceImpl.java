package com.pack.service;

import com.pack.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService 
{

	@Override
	public void createEmployee(Employee emp) throws Exception 
	{
		System.out.println("Employee "+emp.getEno()+ " iss created Successfully");
		throw new ArithmeticException();
	}

	@Override
	public void serachEmployee(Employee emp) 
	{
		System.out.println("Employee "+emp.getEno()+ " is serched successfully");

	}

	@Override
	public void updateEmployee(Employee emp) 
	{
		System.out.println("Employee "+emp.getEno()+" is Updated Successfully");
	}

	@Override
	public void deleteEmployee(Employee emp) 
	{
		System.out.println("Employee "+emp.getEno()+" is Deleted Successfully");

	}

}
