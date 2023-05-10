package com.pack.SpringI18NSupport;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18NClass 
{
	public static void main(String[] args) 
	{
		Locale l = new Locale("it" ,"IT");
		Locale l1 = new Locale("en" , "IN");
		
		NumberFormat format = NumberFormat.getInstance(l);
		System.out.println(format.format(12345678.0987));
		
		DateFormat dateFormat = DateFormat.getDateInstance(3,l1);
		System.out.println(dateFormat.format(new Date()));
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("com/pack/SpringI18NSupport/abc", l);
		System.out.println(resourceBundle.getString("welcome"));
		
		ResourceBundle resourceBundle2 = ResourceBundle.getBundle("com/pack/SpringI18NSupport/abc" , l1);
		System.out.println(resourceBundle2.getString("welcome"));
	}
}
