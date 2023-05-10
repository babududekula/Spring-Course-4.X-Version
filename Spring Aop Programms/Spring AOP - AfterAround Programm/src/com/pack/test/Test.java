package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Account;
import com.pack.beans.Cheque;
import com.pack.service.BankService;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Account account = (Account) context.getBean("accountBean");
		Cheque cheque = (Cheque) context.getBean("chequeBean");
		
		BankService bankService = (BankService) context.getBean("proxy");
		bankService.debit(account, cheque);

	}

}
