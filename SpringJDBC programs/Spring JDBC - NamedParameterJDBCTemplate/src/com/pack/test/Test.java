package com.pack.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.dao.EmployeeDao;
import com.pack.dto.Employee;

public class Test {

	public static void main(String[] args) throws Exception, Exception 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
	/*	Employee emp = new Employee();
		emp.setEid(1);
		emp.setEname("Babu");
		emp.setEaddr("Hyd");
		String status = employeeDao.add(emp);
		System.out.println(status);
		
	*/
	
	/*	Employee emp = employeeDao.search(2);
		if(emp == null)
		{
			System.out.println("Employee is not Existed");
		}
		else
		{
			System.out.println("Employee details");
			System.out.println("==================");
			System.out.println("Employee number  :"+emp.getEid());
			System.out.println("Employee name    :"+emp.getEname());
			System.out.println("Employee address :"+emp.getEaddr());
		}	
	*/		
	
	/*	Employee emp = new Employee();
		emp.setEid(2);
		emp.setEname("Java");
		emp.setEaddr("USA");
		String status = employeeDao.update(emp);
		System.out.println(status);
	*/
		
	/*
	 	String status = employeeDao.delete(1);
	 	System.out.println(status);
	*/	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("1.add");
			System.out.println("2.serach");
			System.out.println("3.update");
			System.out.println("4.delete");
			System.out.println("5.exit");
			
			System.out.println("Your Option [1,2,3,4,5] :");
			int option = Integer.parseInt(br.readLine());
			Employee emp = null;
			String status = "";
			int eid = 0;
			String ename = "";
			String eaddr = "";
			
			switch(option)
			{
			case 1:
				System.out.println("===Add===");
				System.out.print("Enter number  :");
				eid = Integer.parseInt(br.readLine());
				System.out.print("Enter Name    :");
				ename = br.readLine();
				System.out.print("Enter Eaddr   :");
				eaddr = br.readLine();
				
				emp = new Employee();
				emp.setEid(eid);
				emp.setEname(ename);
				emp.setEaddr(eaddr);
				
				status = employeeDao.add(emp);
				System.out.println(status);
				
				break;
				
			case 2:
				System.out.println("===Serach===");
				System.out.print("Enter number :");
				eid = Integer.parseInt(br.readLine());
				emp = employeeDao.search(eid);
				if(emp == null)
				{
					System.out.println("Employee Not Existed");
				}
				else
				{
					System.out.println("Employee Details");
					System.out.println("=================");
					System.out.println("Employee number :"+emp.getEid());
					System.out.println("Employee name   :"+emp.getEname());
					System.out.println("Employee eaddr  :"+emp.getEaddr());
					System.out.println("=================");
				}
				
				break;
					
			case 3:
				System.out.println("===Update===");
				System.out.print("Enter number :");
				eid = Integer.parseInt(br.readLine());
				emp = employeeDao.search(eid);
				if(emp == null)
				{
					System.out.println("Employee Not Existed");
				}
				else
				{
					System.out.print("Employee number     :"+emp.getEid());
					System.out.print("Employee name old   :"+emp.getEname()+"New Name :");
					String New_name = br.readLine();
					System.out.print("Employee eaddr old  :"+emp.getEaddr()+"New Name :");
					String New_Address = br.readLine();
					
					emp = new Employee();
					emp.setEid(eid);
					emp.setEname(New_name);
					emp.setEaddr(New_Address);
					
					status = employeeDao.update(emp);
					System.out.println(status);
					
				}
				break;
				
			case 4:
				System.out.println("===Delete===");
				System.out.print("Enter Number :");
				eid = Integer.parseInt(br.readLine());
				status = employeeDao.delete(eid);
				System.out.println(status);
				break;
				
			case 5:
				System.out.println("******* Thanks For using This Application *******");
				System.exit(0);
				break;
				
				default :
					System.out.println("Choose the number from [1 , 2, 3, 4, 5] only....");
					break;
			}
					
		}
	}

}































