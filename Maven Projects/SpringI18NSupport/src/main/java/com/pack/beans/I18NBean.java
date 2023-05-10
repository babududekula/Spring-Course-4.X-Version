package com.pack.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;


public class I18NBean 
{
	
	private MessageSource messageSource;
	
	public void setMessageSource(MessageSource messageSource) 
	{
		this.messageSource = messageSource;
	}
	
	Locale l1 = new Locale("it" ,"IT");
	public void method1() 
	{
		System.out.println("Message  :"+messageSource.getMessage("Welcome",null, l1));
	}
}
