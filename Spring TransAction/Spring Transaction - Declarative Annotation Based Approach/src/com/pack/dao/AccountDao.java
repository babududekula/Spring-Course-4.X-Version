package com.pack.dao;

public interface AccountDao 
{
	public String transferAmount(String fromAccount , String toAccount , int amount);
	public String deposite(String fromAccount , int amount);
	public String withDraw(String toAccount , int amount);
}
