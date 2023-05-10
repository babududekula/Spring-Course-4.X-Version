package com.pack.dao;



import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


import com.pack.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	public void setDataSource(DataSource dataSource) 
	{
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}	
	

	@Override
	public void add(Employee emp) 
	{
		try 
		{
			String query = "insert into employee values(?,?,?)";
			int RowCount = jdbcTemplate.update(query, new Object[] {emp.getEid(),emp.getEname(),emp.getEaddr()});
			if(RowCount == 1)
			{
				System.out.println("Employee Executed Successfully");
			}
			else
			{
				System.out.println("Employee Not Executed ");
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
