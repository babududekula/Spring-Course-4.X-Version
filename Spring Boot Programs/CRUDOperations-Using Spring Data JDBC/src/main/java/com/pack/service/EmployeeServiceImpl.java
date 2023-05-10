package com.pack.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.EmployeeDao;
import com.pack.pojo.Employee;

@Service("employeeService")

public class EmployeeServiceImpl implements EmployeeService
{

	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	@Override
	public String addModule(Employee employee) 
	{
		String status="";
		try 
		{
			boolean b = employeeDao.existsById(employee.getEnumber());
			if(b == true)
			{
				status = "existed";
			}
			else
			{
				Employee.isNew = true;
				Employee emp = employeeDao.save(employee);
				if(emp.getEnumber().equals(employee.getEnumber()))
				{
					status = "success";
				}
				else
				{
					status = "failure";
				}
			}
		} 
		catch (Exception e) 
		{
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Employee searchModule(String enumber) 
	{
		Employee employee = null;
		try 
		{
			Optional<Employee> emp = employeeDao.findById(enumber);
			if(emp.isEmpty()== true)
			{
				employee = null;
			}
			else
			{
				employee = emp.get();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return employee;
	}

	@Transactional
	@Override
	public String updateModule(Employee employee) 
	{
		String status = "";
		try 
		{
			Employee.isNew = false;
			Employee emp = employeeDao.save(employee);
			if(emp.getEnumber().equals(employee.getEnumber()))
			{
				status ="success";
			}
			else
			{
				status = "failure";
			}
		} 
		catch (Exception e) 
		{
			status ="failure";
			e.printStackTrace();
		}
		return status;
	}

	@Transactional
	@Override
	public String deleteModule(String enumber) 
	{
		String status ="";
		try 
		{
			Optional<Employee> emp = employeeDao.findById(enumber);
			if(emp.isEmpty() == true)
			{
				status ="notexisted";
			}
			else
			{
				employeeDao.deleteById(enumber);
				status ="success";
			}
		} 
		catch (Exception e) 
		{
			status ="failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Employee> getAllEmployees() 
	{
		List<Employee> empList = (List<Employee>) employeeDao.findAll();
		return empList;
	}

}
