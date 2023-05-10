package com.pack.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class AccountEventPublisher implements ApplicationEventPublisherAware 
{

	private ApplicationEventPublisher applicationEventPublisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) 
	{
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	public void publishMethod(String message) 
	{
		AccountEvent ae = new AccountEvent(this,message);
		applicationEventPublisher.publishEvent(ae);
	}

}
