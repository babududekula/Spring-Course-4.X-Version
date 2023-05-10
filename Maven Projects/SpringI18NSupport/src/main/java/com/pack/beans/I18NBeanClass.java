package com.pack.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class I18NBeanClass 
{
	private MessageSource messageSource;
	
	public void setMessageSource(MessageSource messageSource) 
	{
		this.messageSource = messageSource;
	}
	
	public void displayMethod() 
	{
		Locale l = new Locale("it","IT");
		Locale l1 = new Locale("en","IN");
		System.out.println("Message is :"+messageSource.getMessage("Welcome", null,l));
		System.out.println("Message is :"+messageSource.getMessage("Welcome", null,l1));
	}
}
