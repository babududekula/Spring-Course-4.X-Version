package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp 
{
	Connection con;
	Statement st;
	ResultSet rs;
	
	public JdbcApp()
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "babu");
			st = con.createStatement();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void getEmployee()
	{
		try 
		{
			String query = "select * from employee";
			rs = st.executeQuery(query);
			System.out.println("ENUMBER\tENAME\tEPWD\tEAGE\tEMAIL\tEMOBILE");
			System.out.println("==========================================");
			while(rs.next())
			{
				System.out.print(rs.getString("enumber")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("epwd")+"\t");
				System.out.print(rs.getInt("eage")+"\t");
				System.out.print(rs.getString("email")+"\t");
				System.out.print(rs.getString("emobile")+"\n");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				con.close();
				st.close();
				rs.close();
			} 
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}
	}
}