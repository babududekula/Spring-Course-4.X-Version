package com.pack.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ClassB implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Context Closed");
	}

}
