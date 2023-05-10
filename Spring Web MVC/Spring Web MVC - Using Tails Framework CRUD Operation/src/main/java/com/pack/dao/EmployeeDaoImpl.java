package com.pack.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pack.entity.EmployeeEntity;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public String addForm(EmployeeEntity entity) 
	{
		String status="";
		try 
		{
			EmployeeEntity entity1 = (EmployeeEntity)hibernateTemplate.get(EmployeeEntity.class, entity.getEnumber());
			if(entity1 == null)
			{
				String s1 = (String) hibernateTemplate.save(entity);
				if(s1.equals(entity.getEnumber()))
				{
					status = "success";
				}	
				else
				{
					status = "failure";
				}
			}
			else
			{
				status = "existed";
			}
			
		} 
		catch (Exception e) 
		{
			status="failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public EmployeeEntity searchForm(String enumber) 
	{
		EmployeeEntity entity = null;
		try 
		{
			entity = (EmployeeEntity) hibernateTemplate.get(EmployeeEntity.class, enumber);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return entity;
	}

	
	@Override
	public String updateForm(EmployeeEntity entity) 
	{
		String status="";
		try 
		{
			EmployeeEntity s1 = hibernateTemplate.get(EmployeeEntity.class, entity.getEnumber());
			if(s1 != null)
			{
				
				hibernateTemplate.update(entity);
				status="success";	
				
			}
			else
			{
				status ="notexisted";
			}
		} 
		catch (Exception e) 
		{
			status="failure";
			e.printStackTrace();
		}
		return status;
	}

	
	@Override
	public String deleteForm(String enumber) 
	{	
		String status="";
		try 
		{
			EmployeeEntity entity = (EmployeeEntity)hibernateTemplate.get(EmployeeEntity.class, enumber);
			if(entity == null)
			{
				status = "notexisted";
			}
			else
			{
				hibernateTemplate.delete(entity);
				status="success";
			}
		}
		catch (Exception e) 
		{
			status="failure";
			e.printStackTrace();
		}
		return status;
	}

}




