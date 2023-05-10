package com.pack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pack.controller.StudentController;
import com.pack.controller.StudentControllerImpl;
import com.pack.dao.StudentDao;
import com.pack.dao.StudentDaoImpl;
import com.pack.service.StudentService;
import com.pack.service.StudentServiceImpl;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
public class AppConfig 
{
	@Bean
	public OracleDataSource dataSource()
	{
		OracleDataSource dataSource = null;
	
		try 
		{
			dataSource = new OracleDataSource();
			dataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			dataSource.setUser("system");
			dataSource.setPassword("bhavani");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return dataSource;
	}

	
	@Bean
	public StudentDao studentDao()
	{
		StudentDao studentDao = new StudentDaoImpl(); 
		return studentDao;
		
	}
	
	@Bean
	public StudentService studentService()
	{
		StudentService studentService = new StudentServiceImpl();
		return studentService;
	}
	
	@Bean
	public StudentController studentController()
	{
		StudentController studentController = new StudentControllerImpl();
		return studentController;
	}
	
	
	
	
	
	
	
	
	
	
}
