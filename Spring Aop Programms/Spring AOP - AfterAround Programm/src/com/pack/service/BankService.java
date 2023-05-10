package com.pack.service;

import com.pack.beans.Account;
import com.pack.beans.Cheque;

public interface BankService 
{
	public void debit(Account acc , Cheque cheque);
}
