package com.pack.beans;

public class SavingsAccount implements Account {

	@Override
	public void create() 
	{
		
		System.out.println("Savings account create");
	}

	@Override
	public void serach() 
	{
		System.out.println("Savings account serach");
		
	}

	@Override
	public void update() 
	{
		System.out.println("Savings account update");
	}

	@Override
	public void delete() 
	{
		System.out.println("Savings account delete");
		
	}

}
