package com.pack.factory;

import com.pack.beans.HelloBean;

public class HelloBeanFactory 
{
	public HelloBean getHelloBeanFactory()
	{
		System.out.println("this is instance factory method");
		return new HelloBean();
	}
}
