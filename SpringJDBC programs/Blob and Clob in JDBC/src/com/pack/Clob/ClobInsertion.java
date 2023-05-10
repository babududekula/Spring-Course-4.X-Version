package com.pack.Clob;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClobInsertion 
{

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "babu");
			PreparedStatement pst = con.prepareStatement("insert into babu1 values(?,?)");
			pst.setString(1, "Spring");
			
			File file = new File("F:\\Spring\\spring-framework-4.3.9.RELEASE-dist\\spring-framework-4.3.9.RELEASE\\docs\\spring-framework-reference\\html\\xsd-configuration.html");
			FileReader fr = new FileReader(file);
			pst.setCharacterStream(2, fr , file.length());
			int rowCount = pst.executeUpdate();
			if(rowCount == 1)
			{
				System.out.println("Inserted successfully");
			}
			else
			{
				System.out.println("Inserted failure");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
