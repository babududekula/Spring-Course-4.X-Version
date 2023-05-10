package com.pack.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pack.beans.WelcomeBean;

@Configuration
public class AppConfig 
{
	@Bean
	public WelcomeBean welcomeBean()
	{
		return new WelcomeBean();
	}
}
