package com.pack.beans;

import com.pack.event.AccountEventPublisher;

public class Account 
{
	private AccountEventPublisher publisher;
	
	public void setPublisher(AccountEventPublisher publisher) 
	{
		this.publisher = publisher;
	}
	
	public void create()
	{
		System.out.println("Account Created");
		publisher.publishMethod("Account Created Successfully....");
	}
	public void serach()
	{
		System.out.println("Account Serached");
		publisher.publishMethod("Account Searched Successfully....");
	}
	public void update()
	{
		System.out.println("Account Updated");
		publisher.publishMethod("Account Updated Successfully....");
	}
	public void delete()
	{
		System.out.println("Account Deleted");
		publisher.publishMethod("Account Deleted Successfully....");
	}
	
}
