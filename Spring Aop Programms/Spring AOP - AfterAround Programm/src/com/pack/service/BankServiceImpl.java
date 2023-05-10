package com.pack.service;

import com.pack.beans.Account;
import com.pack.beans.Cheque;

public class BankServiceImpl implements BankService 
{

	@Override
	public void debit(Account acc, Cheque cheque) 
	{
		 int initial_balance = acc.getBalance();
		 int cheque_amount = cheque.getAmount();
		 int total_amount = initial_balance - cheque_amount;
		 acc.setBalance(total_amount);
		 System.out.println("**** Transaction Successfully ****");
		 System.out.println("**** Amount Is Debited From your Account ****");
		 

	}

}
