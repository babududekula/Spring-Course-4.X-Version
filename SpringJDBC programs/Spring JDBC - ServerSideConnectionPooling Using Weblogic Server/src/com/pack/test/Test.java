package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.dao.EmployeeDao;
import com.pack.dto.Employee;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDao");
		Employee emp = new Employee();
		emp.setEid(1111);
		emp.setEname("D.Babu");
		emp.setEaddr("Hyderabad");
		
		
		empDao.add(emp);
	}
}
