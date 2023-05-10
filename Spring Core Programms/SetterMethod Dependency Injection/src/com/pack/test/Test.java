package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Account;
import com.pack.beans.Employee;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
	/*	Account acc = (Account) context.getBean("account");
		acc.getAccountDeatils();       */
		
		Employee employee = (Employee) context.getBean("employee");
		employee.getEmployee();
	}

}
