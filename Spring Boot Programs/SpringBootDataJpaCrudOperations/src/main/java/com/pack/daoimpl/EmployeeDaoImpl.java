package com.pack.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.pack.dao.CrudRepositoryImpl;
import com.pack.entity.Employee;

@Service
public class EmployeeDaoImpl implements EmployeeDao
{
	@Autowired
	private CrudRepositoryImpl employeeDao;
	
	@Override
	public String upset(Employee employee) 
	{
		employeeDao.save(employee);
		return "Success";
	}

	@Override
	public Employee search(int id) 
	{
		Employee employee=null;
		Optional<Employee> findById = employeeDao.findById(id);
		if(findById.isPresent())
		{
			employee = findById.get();
		}
		else
		{
			employee = null;
		}
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() 
	{
		List<Employee> findAll = employeeDao.findAll();
		return findAll;
	}

	@Override
	public String delete(int id) 
	{
		String status="";
		Optional<Employee> findById = employeeDao.findById(id);
		if(findById.isEmpty())
		{
			status="Not Existed Data";
		}
		else
		{
			employeeDao.deleteById(id);
			status="Success";
		}
		return status;
	}

}
