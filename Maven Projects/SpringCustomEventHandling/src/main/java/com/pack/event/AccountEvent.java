package com.pack.event;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class AccountEvent extends ApplicationEvent
{
	private static final long serialVersionUID = 1L;
	private String message;
	private static  FileOutputStream fos;
	static
	{
		try 
		{
			fos = new FileOutputStream("E:/logs/log2.txt",true);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	public AccountEvent(Object source , String message) 
	{
		super(source);
		this.message=message;
		
	}
	public void generateLog() 
	{
		try 
		{
			message = new Date().toString()+" : "+message+"\n";
			byte[] b = message.getBytes();
			fos.write(b);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}

	}
	
}
