package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.dao.BlobClobDao;
import com.pack.dto.BlobClob;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		BlobClobDao bcDao = (BlobClobDao) context.getBean("blobclobDao");
		
	/*	BlobClob bc = new BlobClob();
		bc.setId(1);
		bc.setName("Nature");
		bc.setImage(new File("G:/Photo.jfif"));
		bc.setResume(new File("G:\\Resume.docx"));
		
		bcDao.insertBlobClob(bc);
		System.out.println("BlobClob Inserted Successfully....");
	*/
		BlobClob bc = bcDao.readBlobClob(1);
		System.out.println("BlobClob retrived Successfully...");
	}
}
