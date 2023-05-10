package com.pack.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.pack.beans.StudentDto;

public class StudentDaoImpl implements StudentDao 
{
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String add(StudentDto student) 
	{
		String status="";
		try 
		{
			String query="select * from student1 where sid= '"+student.getSid()+"' ";
			List<StudentDto> list = jdbcTemplate.query(query, (rs,index)->{
				StudentDto student1 = new StudentDto();
				student1.setSid(rs.getString("sid"));
				student1.setSname(rs.getString("sname"));
				student1.setSsal(rs.getFloat("ssal"));
				student1.setSaddr(rs.getString("saddr"));
				return student1;
			});
			if(list.isEmpty())
			{
				String query1 = "insert into student1 values('"+student.getSid()+"' , '"+student.getSname()+"' , "+student.getSsal()+",'"+student.getSaddr()+"')";
				int RowCount = jdbcTemplate.update(query1);
				if(RowCount > 0)
				{
					status = "Success";
				}
				else
				{
					status = "Failure";
				}
			}
			else
			{
				status = "Existed";
			}
		} 
		catch (Exception e) 
		{
			status ="Student Insertion Fialure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public StudentDto serach(String sid) 
	{
		StudentDto student = null;
		try 
		{
			String query="select * from student1 where sid= '"+sid+"' ";
			List<StudentDto> list_Values = jdbcTemplate.query(query, (resultSet , index)->{
				StudentDto std = new StudentDto();
				std.setSid(resultSet.getString("sid"));
				std.setSname(resultSet.getString("sname"));
				std.setSsal(resultSet.getFloat("ssal"));
				std.setSaddr(resultSet.getString("saddr"));
				return std;
			});
			if(list_Values.isEmpty())
			{
				student = null;
			}
			else
			{
				student = list_Values.get(0);
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public String update(StudentDto student) 
	{
		String status="";
		try 
		{
			String query="select * from student1 where sid= '"+student.getSid()+"' ";
			List<StudentDto> list_Values = jdbcTemplate.query(query, (resultSet , index)->{
				StudentDto std = new StudentDto();
				std.setSid(resultSet.getString("sid"));
				std.setSname(resultSet.getString("sname"));
				std.setSsal(resultSet.getFloat("ssal"));
				std.setSaddr(resultSet.getString("saddr"));
				return std;
				});
			if(list_Values.isEmpty())
			{
				status = "Not Existed";
			}
			else
			{
				String query1 ="update student1 set sname ='"+student.getSname()+"' , ssal = '"+student.getSsal()+"' , saddr = '"+student.getSaddr()+"' where sid = '"+student.getSid()+"' ";
				int RowCount = jdbcTemplate.update(query1);
				if(RowCount > 0)
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
	public String delete(String sid) 
	{
		String status ="";
		try 
		{
			String query1 = "select * from student1 where sid = '"+sid+"' ";
			List<StudentDto> list = jdbcTemplate.query(query1, (resultSet , index)->{
				StudentDto std = new StudentDto();
				std.setSid(resultSet.getString("sid"));
				std.setSname(resultSet.getString("sname"));
				std.setSsal(resultSet.getFloat("ssal"));
				std.setSaddr(resultSet.getString("saddr"));
				
				return std;
			});
			if(list.isEmpty())
			{
				status = "Not Existed";
			}
			else
			{
				String query = "delete student1 where sid = '"+sid+"' ";
				int RowCount = jdbcTemplate.update(query);
				if(RowCount > 0)
				{
					status = "success";
				}
				else
				{
					status = "Failure";
				}
			
		    }	
	}
		catch (Exception e) 
		{
			status = "Failure";
			e.printStackTrace();
		}
		return status;
	}

}











