package com.pack.controller;


import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.servlet.ModelAndView;


@org.springframework.stereotype.Controller
public class Controller 
{
	
	@RequestMapping(value = "/home" , method = RequestMethod.GET)
	public String helloFrom()
	{
		return "upload";
	}
	@RequestMapping(value = "/upload" , method=RequestMethod.POST)
	public ModelAndView uploadFile(@RequestParam MultipartFile[] fileName) 
	{
		String status="";
			try 
			{
				for(MultipartFile fileName1 : fileName )
				{
				String file_name = fileName1.getOriginalFilename();
				FileOutputStream fos = new FileOutputStream("F:/photos/"+file_name);
				byte[] b = fileName1.getBytes();
				fos.write(b);
				status ="Success";
				} 
			}
			catch (IOException e) 
			{
				status ="Failure";
				e.printStackTrace();
			}
		
		return new ModelAndView("status", "name", status);
	}
}
