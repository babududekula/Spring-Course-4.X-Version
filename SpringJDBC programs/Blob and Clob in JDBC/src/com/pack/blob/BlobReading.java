package com.pack.blob;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BlobReading 
{

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "babu");
			PreparedStatement pst = con.prepareStatement("select * from babu where eno=?");
			pst.setInt(1, 111);
			ResultSet rs = pst.executeQuery();
			rs.next();
			System.out.println("Employee number :"+rs.getInt("eno"));
			
			FileOutputStream fos = new FileOutputStream("G:\\Nature.jpg");
			InputStream is = rs.getBinaryStream(2);
			
			int value =is.read();
			while(value != -1)
			{
				fos.write(value);
				value = is.read();
			}
			System.out.println("success");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}