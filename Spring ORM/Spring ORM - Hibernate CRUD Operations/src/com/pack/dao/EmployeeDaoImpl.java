package com.pack.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import org.springframework.transaction.annotation.Transactional;

import com.pack.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public String add(Employee emp) 
	{
		String status="";
		try 
		{
			Employee emp1 = (Employee)hibernateTemplate.get(Employee.class, emp.getEno());
			if(emp1 != null)
			{
				status ="Employee Existed Already";
			}
			else
			{
				int eno = (Integer) hibernateTemplate.save(emp);
				if(eno == emp.getEno())
				{
					status = "Employee Inserted Successfully";
				}
				else
				{
					status = "Employee Insertion Failure";
				}
			}
		} 
		catch (Exception e) 
		{
			status = "Employee Insertion Failure";
			e.printStackTrace();
		}
		return status;
	}
	
	@Transactional
	@Override
	public Employee serach(int eno) 
	{
		Employee emp = null;
		try 
		{
			emp = (Employee) hibernateTemplate.get(Employee.class, eno);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return emp;
	}
	
	@Transactional
	@Override
	public String update(Employee emp) 
	{
		String status="";
		try 
		{
			Employee emp1 = (Employee)hibernateTemplate.get(Employee.class, emp.getEno());
			if(emp1 == null)
			{
				status ="Employee Not Existed";
			}
			else
			{
				hibernateTemplate.evict(emp1);
				hibernateTemplate.update(emp);
				status ="Employee Updation Success";
			}
		} 
		catch (Exception e) 
		{
			status ="Employee updation Failure";
			e.printStackTrace();
		}
		return status;
	}

	@Transactional
	@Override
	public String delete(Employee emp) 
	{
		String status = "";
		try 
		{
			Employee emp1 = hibernateTemplate.get(Employee.class, emp.getEno());
			if(emp1 == null)
			{
				status = "Employee Not Existed";
			}
			else
			{
				hibernateTemplate.evict(emp1);
				hibernateTemplate.delete(emp);
				status ="Deletion Successfully completed";
			}
		} 
		catch (Exception e) 
		{
			status="Deletion Failure";
			e.printStackTrace();
		}
		return status;
	}

}
