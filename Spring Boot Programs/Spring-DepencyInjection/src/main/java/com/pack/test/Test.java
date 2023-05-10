package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.CarService;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/car.xml");
		
		CarService ctx = context.getBean(CarService.class);
		ctx.service();
	}
}
