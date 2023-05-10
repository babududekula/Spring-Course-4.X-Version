package com.pack.core;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test
{
	public static void main(String[] args) 
	{
		Locale l = new Locale("en","EN");
		Locale l1 = new Locale("it","IT");
		NumberFormat number_Format = NumberFormat.getInstance(l);
		System.out.println(number_Format.format(123454356.890));
		
		DateFormat date_Format = DateFormat.getDateInstance(3);
		System.out.println(date_Format.format(new Date()));
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("abc",l);
		System.out.println(resourceBundle.getString("welcome"));
		
		ResourceBundle bundle = ResourceBundle.getBundle("abc",l1);
		System.out.println(bundle.getString("welcome"));
		
	}
}