package com.pack.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserService 
{
	public String login(String name , String password)
	{
		String status ="";
		Connection con;
		Statement st;
		ResultSet rs;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:2315/babudb", "root", "bhavani");
			st = con.createStatement();
			String query = "select * from employee where ename= '"+name+"' and epwd ='"+password+"' ";
			rs = st.executeQuery(query);
			boolean b = rs.next();
			if(b==true)
			{
				status="success";
			}
			else
			{
				status="failure";
			}
		} catch (Exception e) 
		{
			status="failure";
			e.printStackTrace();
		}
		
		return status;
	}
}
