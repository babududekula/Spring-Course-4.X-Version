package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.Movie;
import com.pack.service.MovieService;

public class Test {

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		Movie movie = (Movie) context.getBean("movieBean");
		
		MovieService service =(MovieService) context.getBean("proxy");
		
		try 
		{
			service.playMovie(movie);
		} 
		catch (Exception e) 
		{	
			
		}

	}

}
