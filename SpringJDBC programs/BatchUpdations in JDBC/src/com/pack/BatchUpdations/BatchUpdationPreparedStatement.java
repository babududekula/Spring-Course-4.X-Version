package com.pack.BatchUpdations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchUpdationPreparedStatement 
{

	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "babu");
		PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?)");
		pst.setInt(1, 10);
		pst.setString(2, "AAA");
		pst.setString(3, "Hyd");
		pst.addBatch();
		
		pst.setInt(1, 7);
		pst.setString(2, "BBB");
		pst.setString(3, "Hyd");
		pst.addBatch();

		pst.setInt(1, 8);
		pst.setString(2, "CCC");
		pst.setString(3, "Hyd");
		pst.addBatch();

		pst.setInt(1, 9);
		pst.setString(2, "DDD");
		pst.setString(3, "Hyd");
		pst.addBatch();
		
		int[] RowCount = pst.executeBatch();
		for(int emp : RowCount)
		{
			System.out.println("RowCount is :"+emp);
		}

	}

}
