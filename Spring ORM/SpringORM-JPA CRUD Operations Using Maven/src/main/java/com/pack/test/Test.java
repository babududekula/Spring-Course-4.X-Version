package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.dao.BankDao;
import com.pack.pojo.Bank;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		BankDao bankDao = (BankDao) context.getBean("bankDao");
		
		Bank bank1 = new Bank();
		bank1.setBname("HDFC");
		bank1.setBid(333);
		bank1.setBaccount("Savings");
		bank1.setBbalance(98760);
		bank1.setBbranch("Nellore");
		
		String status = bankDao.add(bank1);
		System.out.println(status);
		
		
//		Bank bank = bankDao.serach("Axis");
//		if(bank == null)
//		{
//			System.out.println("Bank Not Existed");
//		}
//		else
//		{
//			System.out.println("Bank Details");
//			System.out.println("==================");
//			System.out.println("Bank Name   :"+bank.getBname());
//			System.out.println("Bank id     :"+bank.getBid());
//			System.out.println("Bank Account:"+bank.getBaccount());
//			System.out.println("Bank Balance:"+bank.getBbalance());
//			System.out.println("Bank Branch :"+bank.getBbranch());
//			System.out.println("==================");
//		}
		
		
//		Bank bank = new Bank();
//		bank.setBname("ICICI");
//		bank.setBid(333);
//		bank.setBaccount("Demat");
//		bank.setBbalance(456780);
//		bank.setBbranch("Venkatagiri");
//		
//		String status = bankDao.update(bank);
//		System.out.println(status);
		
//		String status = bankDao.delete("HDFC");
//		System.out.println(status);
		
	}
}
