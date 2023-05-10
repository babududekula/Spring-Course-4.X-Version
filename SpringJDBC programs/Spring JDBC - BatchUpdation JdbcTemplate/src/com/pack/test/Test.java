package com.pack.test;

import java.util.ArrayList;
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
		EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDao");
		
	/*
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setEid(111);
		emp1.setEname("AAA");
		emp1.setEaddr("Hyd");
		employeeList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setEid(222);
		emp2.setEname("BBB");
		emp2.setEaddr("Hyd");
		employeeList.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setEid(333);
		emp3.setEname("CCC");
		emp3.setEaddr("Hyd");
		employeeList.add(emp3);
		
		int[] Rowcount = empDao.insert(employeeList); 
		for(int emp :Rowcount)
		{
			System.out.println("RowCount :"+emp);
		}
	*/
		int[] RowCount = empDao.update();
		for(int emp1 : RowCount)
		{
			System.out.println("RowCount :"+emp1);
		}
	}

}



