package com.pack.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.command.Employee;
import com.pack.dao.EmployeeDao;
import com.pack.entity.EmployeeEntity;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	@Override
	public String add(Employee employee) 
	{
		String status = "";
		EmployeeEntity entityData = new EmployeeEntity();
		entityData.setEnumber(employee.getEnumber());
		entityData.setEname(employee.getEname());
		entityData.setEpwd(employee.getEpwd());
		entityData.setEage(employee.getEage());
		entityData.setEmail(employee.getEmail());
		entityData.setEmobile(employee.getEmobile());
		
		status = employeeDao.addForm(entityData);
		
		return status;
	}

	@Override
	public Employee serach(String enumber) 
	{
		EmployeeEntity entity = employeeDao.searchForm(enumber);
		Employee employee = null;
		if(entity == null)
		{
			employee = null;
		}
		else
		{
			employee = new Employee();
			employee.setEnumber(entity.getEnumber());
			employee.setEname(entity.getEname());
			employee.setEpwd(entity.getEpwd());
			employee.setEage(entity.getEage());
			employee.setEmail(entity.getEmail());
			employee.setEmobile(entity.getEmobile());
		}
		return employee;
	}
	@Transactional
	@Override
	public String update(Employee employee) 
	{
		
		String status = "";
		EmployeeEntity entityData = new EmployeeEntity();
		
		entityData.setEnumber("enumber");
		entityData.setEname(employee.getEname());
		entityData.setEpwd(employee.getEpwd());
		entityData.setEage(employee.getEage());
		entityData.setEmail(employee.getEmail());
		entityData.setEmobile(employee.getEmobile());
		
		status = employeeDao.updateForm(entityData);
		
		
		return status;
	}

	@Transactional
	@Override
	public String delete(String enumber) 
	{
		String status = employeeDao.deleteForm(enumber);
		return status;
	}

}
