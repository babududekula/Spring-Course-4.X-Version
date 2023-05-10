package com.pack.BatchUpdations;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class BatchUpdationStatement 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "babu");
		Statement st =  con.createStatement();
		st.addBatch("insert into employee values(6,'Bajaj','Venkatagiri')");
		st.addBatch("delete from employee where eid =2");
		int[] rowCount =  st.executeBatch();
		for(int emp:rowCount)
		{
			System.out.println("RowCount :"+emp);
		}
	}
}
