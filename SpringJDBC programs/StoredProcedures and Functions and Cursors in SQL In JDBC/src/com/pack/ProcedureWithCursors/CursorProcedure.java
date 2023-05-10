/*
  create or replace procedure getEmps(sal_Range IN float , emps OUT SYS_REFCURSOR)
  As
  Begin
  	open emps for select * from emp where esal < sal_Range;
  End getEmps;
  /	
 */



package com.pack.ProcedureWithCursors;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import oracle.jdbc.OracleTypes;

public class CursorProcedure 
{

	public static void main(String[] args) throws Exception
	
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "babu");
		CallableStatement cst = con.prepareCall("{call getEmps(?,?)}");
		cst.setFloat(1, 10000);
		cst.registerOutParameter(2, OracleTypes.CURSOR);
		cst.execute();
		ResultSet rs = (ResultSet) cst.getObject(2);
		System.out.println("Eno\tEname\tEsal");
		System.out.println("=====================");
		while(rs.next())
		{
			System.out.print(rs.getInt("eno")+"\t");
			System.out.print(rs.getString("ename")+"\t");
			System.out.print(rs.getFloat("esal")+"\n");
			
		}
		rs.close();
		con.close();
		cst.close();
	}

}
