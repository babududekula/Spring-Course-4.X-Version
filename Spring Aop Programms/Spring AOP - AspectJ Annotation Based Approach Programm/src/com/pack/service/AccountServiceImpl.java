package com.pack.service;

import org.springframework.stereotype.Component;

import com.pack.beans.Account;
import com.pack.exception.InsufficientBalanceException;

@Component("transaction")
public class AccountServiceImpl implements AccountService 
{

	@Override
	public String withDraw(Account account, int with_Draw) throws InsufficientBalanceException 
	{
		String status="";
		if(account.getAccBalance() > with_Draw)
		{
			int total = account.getAccBalance() - with_Draw;
			account.setAccBalance(total);
			System.out.println("From WithDraw () : TransAction WithDraw Completed");
			status = "success";
		}
		else
		{
			status = "Failure";
			throw new InsufficientBalanceException("No Proper Balance is there In your Account");
		}
		return status;
	}

}
