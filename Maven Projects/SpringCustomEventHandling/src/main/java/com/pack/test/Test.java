package com.pack.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Account;

public class Test 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Account account = (Account) context.getBean("account");
		account.create();
		account.serach();
		account.update();
		account.delete();
	}
}
