/*
 create or replace function getAvg(no1 IN number , no2 IN number) return float
 As
 	sal1 float;
 	sal2 float;
 Begin
 	select esal into sal1 from emp where eno = no1;
 	select esal into sal2 from emp where eno = no2;
 	return (sal1 + sal2)/2;
 	
 End getAvg;
 /	
 */



package com.pack.storedProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Function 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "babu");
		CallableStatement cst = con.prepareCall("{?=call getAvg(?,?)}");
		cst.setInt(2, 111);
		cst.setInt(3, 222);
		cst.registerOutParameter(1, Types.FLOAT);
		cst.execute();
		System.out.println("Avg salary :"+cst.getFloat(1));
		con.close();
		cst.close();
	}

}
