package com.pack.PostProcess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.pack.beans.Customer;

public class BeanPostProcessImpl implements BeanPostProcessor 
{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException 
	{
		Customer obj = (Customer) bean;
		if(obj.getcName() == null)
		{
			obj.setcName("Babu Dudekula");
		}
		return obj;
		
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException 
	{
		Customer obj = (Customer) bean;
		String email = obj.getCmail();
		if(!email.contains("@"))
		{
			email = email+"@gmail.com";
			obj.setCmail(email);
		}
		
		String mobile = obj.getcNumber();
		if(!mobile.contains("+91-"))
		{
			mobile = "+91-"+mobile;
			obj.setcNumber(mobile);
		}
		
		return obj;

	}	
	

}
