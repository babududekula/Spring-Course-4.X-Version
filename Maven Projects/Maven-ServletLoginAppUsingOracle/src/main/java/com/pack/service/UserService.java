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
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "babu");
			st = con.createStatement();
			String query = "select * from emp2 where uname= '"+name+"' and upwd ='"+password+"' ";
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
