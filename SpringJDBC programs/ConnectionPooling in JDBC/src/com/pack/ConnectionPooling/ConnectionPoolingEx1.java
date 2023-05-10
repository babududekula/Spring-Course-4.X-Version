package com.pack.ConnectionPooling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

public class ConnectionPoolingEx1 
{

	public static void main(String[] args) 
	{
		OracleDataSource ds = null;
		Statement st = null;
		Connection con = null;
		ResultSet rs = null;
		
		try 
		{
			ds = new OracleDataSource();
			ds.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			ds.setUser("system");
			ds.setPassword("babu");
			
			con = ds.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("select * from student");
			System.out.println("sid\tsname\tsaddr");
			System.out.println("=====================");
			while(rs.next())
			{
				System.out.print(rs.getInt("sid")+"\t");
				System.out.print(rs.getString("sname")+"\t");
				System.out.println(rs.getString("saddr"));
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
				rs.close();
				ds.close();
				st.close();
				
			} 
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}

	}

}
