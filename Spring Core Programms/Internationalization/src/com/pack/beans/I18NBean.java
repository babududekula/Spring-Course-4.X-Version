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
	public void displayMessage() 
	{
		Locale l = new Locale("en","IN");
		Locale l1 = new Locale("it","IT");
		Locale l2 = new Locale("en","US");
		System.out.println("Message  :"+messageSource.getMessage("welcome", new Object[] {"en","English"}, l));
		System.out.println("Message  :"+messageSource.getMessage("welcome",new Object[] {"it","Italic"}, l1));
	}
}
