/*
 create or replace procedure getSal(no IN number , sal OUT float)
 As
 Begin
 	select esal into sal from emp where eno = no;
 End getSal;
 /	
 */

package com.pack.storedProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredProcedure 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "babu");
		CallableStatement cst = con.prepareCall("{call getSal(?,?)}");
		cst.setInt(1, 111);
		cst.registerOutParameter(2, Types.FLOAT);
		cst.execute();
		System.out.println("salary  :"+cst.getFloat(2));
		cst.close();
		con.close();
	}

}
