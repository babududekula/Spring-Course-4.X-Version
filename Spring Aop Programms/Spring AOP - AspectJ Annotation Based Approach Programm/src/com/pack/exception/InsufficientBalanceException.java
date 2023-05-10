package com.pack.exception;

public class InsufficientBalanceException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String desc) 
	{
		super(desc);
    }
}
