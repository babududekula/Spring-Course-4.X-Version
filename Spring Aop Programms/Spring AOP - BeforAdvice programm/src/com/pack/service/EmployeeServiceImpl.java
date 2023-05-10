package com.pack.service;

import com.pack.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService 
{

	@Override
	public void getEmployeeDetails(Employee emp) 
	{
		System.out.println("Employee Details from getEmployeeDetails() Method");
		System.out.println("=========================================");
		System.out.println("Employee number  :"+emp.getEno());
		System.out.println("Employee Name    :"+emp.getEname());
		System.out.println("Employee salary  :"+emp.getEsal());
		System.out.println("Employee address :"+emp.getEaddr());
		System.out.println("Employee Mobile  :"+emp.getEmobile());
		System.out.println("Employee emial   :"+emp.getEemail());
		System.out.println("=========================================");

	}

	@Override
	public void displayEmployeeDdetails(Employee emp) 
	{
		System.out.println("Employee Details from DisplayEmployeeDetails() Method");
		System.out.println("=========================================");
		System.out.println("Employee number  :"+emp.getEno());
		System.out.println("Employee Name    :"+emp.getEname());
		System.out.println("Employee salary  :"+emp.getEsal());
		System.out.println("Employee address :"+emp.getEaddr());
		System.out.println("Employee Mobile  :"+emp.getEmobile());
		System.out.println("Employee emial   :"+emp.getEemail());
		System.out.println("=========================================");

	}

}
