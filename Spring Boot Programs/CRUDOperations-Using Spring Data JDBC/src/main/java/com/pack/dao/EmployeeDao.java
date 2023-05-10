package com.pack.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.pojo.Employee;

public interface EmployeeDao extends CrudRepository<Employee, String>
{
	
}
