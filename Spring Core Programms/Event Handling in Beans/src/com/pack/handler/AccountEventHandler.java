package com.pack.handler;

import org.springframework.context.ApplicationListener;

import com.pack.event.AccountEvent;

public class AccountEventHandler implements ApplicationListener<AccountEvent>
{

	@Override
	public void onApplicationEvent(AccountEvent ae) 
	{
		ae.generateLog();
	}

}
