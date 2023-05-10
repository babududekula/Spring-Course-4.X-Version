package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.CurrentAccount;
import com.pack.beans.SavingsAccount;
import com.pack.factory.AccountFactory;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/ApplicationContext.xml");
		AccountFactory savingAccountFactory = (AccountFactory) context.getBean("savingsAccountFactory");
		SavingsAccount savingsAccount = (SavingsAccount) savingAccountFactory.getAccount();
		System.out.println(savingsAccount);
		savingsAccount.create();
		savingsAccount.serach();
		savingsAccount.update();
		savingsAccount.delete();
		
		AccountFactory currentAccountFactory = (AccountFactory) context.getBean("currentAccountFactory");
		CurrentAccount currentAccount = (CurrentAccount) currentAccountFactory.getAccount();
		currentAccount.create();
		currentAccount.serach();
		currentAccount.update();
		currentAccount.delete();
	}
}
