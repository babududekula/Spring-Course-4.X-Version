package com.pack.beans;

public class Diesel implements Engine 
{
	public Diesel() 
	{
		System.out.println("This is Diesel Construcotr...");
	}

	@Override
	public int fuel() 
	{
		System.out.println("This is Diesel Car....");
		return 1;
	}

}
