package com.pack.dao;

import com.pack.entity.EmployeeEntity;

public interface EmployeeDao 
{
	public String addForm(EmployeeEntity entity);
	public EmployeeEntity searchForm(String enumber);
	public String updateForm(EmployeeEntity entity);
	public String deleteForm(String enumber);
}
