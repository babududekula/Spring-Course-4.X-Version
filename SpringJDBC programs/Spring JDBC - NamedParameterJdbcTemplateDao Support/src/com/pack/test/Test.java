package com.pack.test;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pack.dao.EmployeeDao;
import com.pack.dto.Employee;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
	
	
	
	/*	Employee emp = new Employee();
		emp.setEid(3);
		emp.setEname("Python");
		emp.setEaddr("India");
		String status = employeeDao.add(emp);
		System.out.println(status);
	*/	
	
	/*
		Employee emp = employeeDao.serach(1);
		if(emp == null)
		{
			System.out.println("Employee Not Existed");
		}
		else
		{
			System.out.println("Employee Details");
			System.out.println("================");
			System.out.println("Employee Number :"+emp.getEid());
			System.out.println("Employee Name   :"+emp.getEname());
			System.out.println("Employee address:"+emp.getEaddr());
			System.out.println("===============");
		}
	*/
		
	/*	List<Employee> employeeList = employeeDao.getAllEmployees();
		System.out.println("eid\tename\teaddr");
		System.out.println("====================");
		for(Employee emp : employeeList)
		{
			System.out.print(emp.getEid()+"\t");
			System.out.print(emp.getEname()+"\t");
			System.out.print(emp.getEaddr()+"\n");
			
		}
	*/
		
	
	/* 	Employee emp = new Employee();
		emp.setEid(3);
		emp.setEname("HTML");
		emp.setEaddr("Australia");
		String status = employeeDao.update(emp);
		System.out.println(status);
	*/
		
	
	/*
		String status = employeeDao.delete(3);
		System.out.println(status);
	*/	
	}
}











