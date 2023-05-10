package com.pack.Clob;

import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClobRetriving {

	public static void main(String[] args) {
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "babu");
			PreparedStatement pst = con.prepareStatement("select * from babu1 where ename =?");
			pst.setString(1, "Spring");
			ResultSet rs = pst.executeQuery();
			rs.next();
			System.out.println("Employee Name :"+rs.getString("ename"));
			Reader r = rs.getCharacterStream(2);
			FileWriter fw = new FileWriter("G:\\Spring.xml");
			int value = r.read();
			while(value != -1)
			{
				fw.write(value);
				value = r.read();
			}
			System.out.println("success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
