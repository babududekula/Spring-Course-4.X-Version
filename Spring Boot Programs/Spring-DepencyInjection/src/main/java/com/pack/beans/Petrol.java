package com.pack.beans;

public class Petrol implements Engine
{
	public Petrol() 
	{
		System.out.println("This is Petrol Constructor....");
	}
	@Override
	public int fuel() 
	{
		System.out.println("This is Petrol Car...");
		return 2;
	}
}
