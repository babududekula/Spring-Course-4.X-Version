package com.pack.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pack.dao.Student;

public class StudentRowMapper implements RowMapper<Student>
{

	@Override
	public Student mapRow(ResultSet rs, int index) throws SQLException 
	{
		Student std = new Student();
		std.setSid(rs.getString("sid"));
		std.setSname(rs.getString("sname"));
		std.setSaddr(rs.getString("saddr"));
		
		return std;
	}
	
}
