package com.pack.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller 
{
	
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String download()
	{
		return "download";
	}
	
	@RequestMapping(value="/download" , method=RequestMethod.GET)
	public void downloadFile(HttpServletRequest request , HttpServletResponse response)throws Exception
	{
		response.setContentType("APPLICATION/OCTET-STREAM");
		File file = new File("G:/AnotherCopiedPhoto.jpg");
		FileInputStream fis = new FileInputStream(file);
		String file_name = file.getName();
		response.setHeader("Content-Disposition", "attachment;filename= \""+file_name+"\"");
		
		OutputStream os = response.getOutputStream();
		int value = fis.read();
		while(value !=-1)
		{
			os.write(value);
			value = fis.read();
			
		}
			
		fis.close();
		os.close();
		
	}
}
