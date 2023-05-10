package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.Interface.ClassD;
import com.pack.beans.ClassB;
import com.pack.beans.ClassC;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		
		ClassD savingsAccountFactory = (ClassD) context.getBean("savingsAccountFactory");
		ClassB savingsAccount = (ClassB) savingsAccountFactory.getMethods();
		savingsAccount.add();
		savingsAccount.search();
		savingsAccount.update();
		savingsAccount.delete();
		
		System.out.println("==================");
		System.out.println();
		
		ClassD currentAccountFactory = (ClassD) context.getBean("currentAccountFactory");
		ClassC currentAccount = (ClassC) currentAccountFactory.getMethods();
		currentAccount.add();
		currentAccount.search();
		currentAccount.update();
		currentAccount.delete();
				
	}
}
