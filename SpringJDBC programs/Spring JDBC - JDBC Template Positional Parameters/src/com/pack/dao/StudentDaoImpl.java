package com.pack.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public String add(Student std) 
	{
		String status = "";
		try 
		{
			String query = "select * from student where sid = ?";
			List<Student> studentList = jdbcTemplate.query(query,new Object[] {std.getSid()}, (rs,index)->{
				Student std1 = new Student();
				std.setSid(rs.getString("sid"));
				std.setSname(rs.getString("sname"));
				std.setSaddr(rs.getString("saddr"));
				return std1;
			});
			if(studentList.isEmpty() == true)
			{
				int RowCount = jdbcTemplate.update("insert into student values(?,?,?)" , new Object[] {std.getSid(),std.getSname(),std.getSaddr()});
				if(RowCount == 1)
				{
					status = "Student Insertion succesfully";
				}
				else
				{
					status = "student Insertion Failure";
				}
			}
			else
			{
				status = "student Inserted Already...";
			}
		} 
		catch (Exception e) 
		{
			status = "Student Insertion Failure";
			e.printStackTrace();
		}
		return status;
	}	

	@Override
	public Student serach(String sid) 
	{
		Student std = null;
		try {
			String query = "select * from student where sid = ?";
			List<Student> studentList = jdbcTemplate.query(query, new Object[] {sid},(rs,index)->{
				Student std1 = new Student();
				std1.setSid(rs.getString("sid"));
				std1.setSname(rs.getString("sname"));
				std1.setSaddr(rs.getString("saddr"));
				return std1;
			});
			boolean b = studentList.isEmpty();
			if(b == true)
			{
				std = null;
			}
			else
			{
				std = studentList.get(0);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return std;
	}

	@Override
	public String update(Student std) 
	{
		String status = "";
		try 
		{
				String query = "update student set sname = ?, saddr = ? , where sid = ?";
				int RowCount = jdbcTemplate.update(query , new Object[] {std.getSid(),std.getSname(),std.getSaddr()});
				if(RowCount == 1)
				{
					status = "Student updated Successfully";
				}
				else
				{
					status = "Student Updation failure";
				}
			
		} 
		catch (Exception e) 
		{
			status = "student updation Failure";
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public String delete(String sid) 
	{
		String status = "";
		try {
			Student std = serach(sid);
			if(std == null)
			{
				status = "Student Not Existed ";
			}
			else
			{
				String query = "delete from student where sid =?";
				int RowCount = jdbcTemplate.update(query , new Object[] {sid});
				if(RowCount == 1)
				{
					status = "Student deletd Successfully";
				}
				else
				{
					status = "Student Deletion Failure";
				}
			}
			
		} catch (Exception e) 
		{
			status = "Student Deletion Failure";
			e.printStackTrace();
		}
		return status;
	}

}
