package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.dao.AccountDao;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		AccountDao accDao = (AccountDao) context.getBean("accountDao");
		String status = accDao.transferAmount("abc123", "aaa123", 400);
		System.out.println(status);
	}
}
