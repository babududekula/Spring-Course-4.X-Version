package com.pack.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;


import com.pack.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int[] insert(List<Employee> empList) 
	{
		int[] RowCount = null;
		try 
		{
			String query = "insert into employee values(?,?,?)";
			RowCount = jdbcTemplate.batchUpdate(query, new BatchPreparedStatementSetter() 
			{
				
				@Override
				public void setValues(PreparedStatement pst, int index) throws SQLException 
				{
					Employee emp = empList.get(index);
					pst.setInt(1, emp.getEid());
					pst.setString(2, emp.getEname());
					pst.setString(3, emp.getEaddr());
					
				}
				
				@Override
				public int getBatchSize() 
				{
					
					return empList.size();
				}
			});
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return RowCount;
	}

	@Override
	public int[] update() 
	{
		int[] RowCount = null;
		try 
		{
			String query1 = "insert into employee values(444 , 'DDD' ,'Hyd')";
			String query2 = "update employee set ename = 'Babu',eaddr='Venkatagiri' where eid=444";
			String query3 = "delete from employee where eid=333";
			RowCount = jdbcTemplate.batchUpdate(query1,query2,query3);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return RowCount;
	}

}





