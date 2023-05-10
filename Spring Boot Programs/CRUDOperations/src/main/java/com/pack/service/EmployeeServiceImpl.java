package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.EmployeeDao;
import com.pack.pojo.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService
{

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public String addModule(Employee employee) 
	{
		String status = employeeDao.add(employee);
		return status;
	}

	@Override
	public Employee searchModule(String enumber) 
	{
		Employee employee = employeeDao.search(enumber);
		return employee;
	}

	@Override
	public String updateModule(Employee employee) 
	{
		String status = employeeDao.update(employee);
		return status;
	}

	@Override
	public String deleteModule(String enumber) 
	{
		String status = employeeDao.delete(enumber);
		return status;
	}

}
