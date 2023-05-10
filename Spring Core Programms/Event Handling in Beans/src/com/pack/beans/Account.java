package com.pack.beans;

import com.pack.publisher.AccountEventPublisher;

public class Account 
{
	private AccountEventPublisher publisher;
	
	public void setPublisher(AccountEventPublisher publisher) 
	{
		this.publisher = publisher;
	}
	public void createAccount()
	{
		System.out.println("Account Created");
		publisher.publisher("Account created....");
	}
	public void serachAccount()
	{
		System.out.println("Account serached");
		publisher.publisher("Account serached....");
	}
	public void updateAccount()
	{
		System.out.println("Account updated");
		publisher.publisher("Account updated....");
	}
	public void deleteAccount()
	{
		System.out.println("Account Deleted");
		publisher.publisher("Account deleted....");
	}
}
