
/*
 create or replace function getEmployee(sal_Range IN float) return SYS_REFCURSOR
 As
 	employees SYS_REFCURSOR;
 Begin 
 	open employees for select * from emp where esal < sal_Range;
 	return employees;
 End getEmployee;
 /	
 */




package com.pack.ProcedureWithCursors;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import oracle.jdbc.OracleTypes;

public class CursorStroredFunction 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "babu");
		CallableStatement cst = con.prepareCall("{? = call getEmployee(?)}");
		cst.setFloat(2, 10000);
		cst.registerOutParameter(1, OracleTypes.CURSOR);
		cst.execute();
		ResultSet rs = (ResultSet) cst.getObject(1);
		System.out.println("Eno\tEname\tEsal");
		System.out.println("====================");
		while(rs.next())
		{
			System.out.print(rs.getInt("eno")+"\t");
			System.out.print(rs.getString("ename")+"\t");
			System.out.println(rs.getFloat("esal"));
		}
	}

}
