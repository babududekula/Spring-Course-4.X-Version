package com.pack.service;

import com.pack.beans.Account;
import com.pack.exception.InsufficientBalanceException;

public interface AccountService 
{
	public String withDraw(Account account , int with_Draw)throws InsufficientBalanceException;
}
