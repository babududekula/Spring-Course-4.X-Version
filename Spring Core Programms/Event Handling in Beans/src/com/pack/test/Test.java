package com.pack.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Account;

public class Test 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Account acc = (Account) context.getBean("accountBean");
		acc.createAccount();
		acc.serachAccount();
		acc.updateAccount();
		acc.deleteAccount();
	}
}
