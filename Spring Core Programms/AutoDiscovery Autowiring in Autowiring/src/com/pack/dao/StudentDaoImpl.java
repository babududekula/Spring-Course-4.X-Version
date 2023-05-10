package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.dto.Student;

import oracle.jdbc.pool.OracleDataSource;


//@Component("studentDao")
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao 
{
	@Autowired
	private OracleDataSource dataSource;
	
	@Override
	public String add(Student student) 
	{
		String status ="";
		try 
		{
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from student where SID =?");
			pst.setString(1, student.getSid());
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b == true)
			{
				status="existed";
			}
			else
			{
				pst = con.prepareStatement("insert into student values(?,?,?)");
				pst.setString(1, student.getSid());
				pst.setString(2, student.getSname());
				pst.setString(3, student.getSaddr());
				int rowCount = pst.executeUpdate();
				if(rowCount == 1)
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
	public Student search(String sid) 
	{
		Student student = null;
		try 
		{
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from student where sid=?");
			pst.setString(1, sid);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b == true)
			{
				student = new Student();
				student.setSid(rs.getString("sid"));
				student.setSname(rs.getString("sname"));
				student.setSaddr(rs.getString("saddr"));
			}
			else
			{
				student = null;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return student;
	}

	@Override
	public String update(Student student) 
	{
		String status="";
		
		try 
		{
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("update student set sname = ? , saddr = ? where sid = ?");
			pst.setString(1, student.getSname());
			pst.setString(2, student.getSaddr());
			pst.setString(3, student.getSid());
			int rowCount = pst.executeUpdate();
			if(rowCount == 1)
			{
				status = "success";
				
			}
			else
			{
				status = "Failure";
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
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from student where sid =?");
			pst.setString(1, sid);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b == true)
			{
				pst = con.prepareStatement("delete from student where sid =?");
				pst.setString(1, sid);
				int rowCount = pst.executeUpdate();
				if(rowCount == 1)
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
				status = "Not Existed";
			}
		} 
		catch (Exception e) 
		{
			status = "failure";
			e.printStackTrace();
		}
		
		return status;
	}

}
