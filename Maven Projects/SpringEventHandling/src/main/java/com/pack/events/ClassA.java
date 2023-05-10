package com.pack.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ClassA implements ApplicationListener<ContextRefreshedEvent> 
{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		System.out.println("Context Refreshed");
	}

}
