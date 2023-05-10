package com.pack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pack.bean.Student;

public class StudentDao 
{
	public Student getResults(int hno)
	{
		
		Student student = new Student();
		try 
		{
			Class.forName("oracle.jsbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "babu");
			PreparedStatement pst = con.prepareCall("select * from student where hno=?");
			pst.setInt(1, hno);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				student.setHno(rs.getString("hno"));
				student.setName(rs.getString("name"));
	
				student.setC(rs.getInt("c"));
				student.setCpp(rs.getInt("cpp"));
				student.setJava(rs.getInt("java"));
				
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return student;
	}
	
}
