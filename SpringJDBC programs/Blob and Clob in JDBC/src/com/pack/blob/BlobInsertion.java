package com.pack.blob;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BlobInsertion {

	public static void main(String[] args) {
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "babu");
			PreparedStatement pst = con.prepareStatement("insert into babu values(?,?)");
			pst.setInt(1, 111);
			
			File file = new File("G:/CopiedPhoto.JPG");
			FileInputStream fis = new FileInputStream(file);
			pst.setBinaryStream(2, fis, file.length());
			
			int rowCount = pst.executeUpdate();
			if(rowCount == 1)
			{
				System.out.println("Inserted Successfully....");
			}
			else
			{
				System.out.println("Insertion failure.....");
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Record Insertion is Failure");
			e.printStackTrace();
		}

	}

}
