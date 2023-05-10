package com.pack.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.dao.Student;
import com.pack.dao.StudentDao;
import com.pack.dao.StudentDaoImpl;

public class Test {

	public static void main(String[] args) throws Exception, IOException 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		StudentDaoImpl studentDao = (StudentDaoImpl) context.getBean("studentDao");
	
	/*	Student std = new Student();
		std.setSid("555");
		std.setSname("Naresh");
		std.setSaddr("Nellore");
		String status = studentDao.add(std);
		System.out.println(status);
	*/
	
	/*	Student std = studentDao.serach("555");
		if(std == null)
		{
			System.out.println("Employee is not Existed ");
		}
		else
		{
			System.out.println("Student Details");
			System.out.println("===============");
			System.out.println("Student id   :"+std.getSid());
			System.out.println("Student name :"+std.getSname());
			System.out.println("Student addr :"+std.getSaddr());
			System.out.println("===============");
		}
		
	*/
		
	/*	Student std = new Student();
		std.setSid("666");
		std.setSname("Hero");
		std.setSaddr("hyd");
		String status = studentDao.update(std);
		System.out.println(status);		
	*/
		
	/*	String status = studentDao.delete("666");
		System.out.println(status);
	*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println();
			System.out.println("1.Add student");
			System.out.println("2.search student");
			System.out.println("3.update student");
			System.out.println("4.delete student");
			System.out.println("5.GetAllEmployees");
			System.out.print("Your Option [1,2,3,4,5,6] :");
			int option = Integer.parseInt(br.readLine());
			System.out.println();
			Student std = null;
			String status = "";
			String number = "";
			String name = "";
			String location = "";
			
			switch(option)
			{
			case 1:
				System.out.println("=== Add Module ===");
				System.out.print("Enter number  :");
				number = br.readLine();
				System.out.print("Enter name    :");
				name = br.readLine();
				System.out.print("Enter city    :");
				location = br.readLine();
				
				std = new Student();
				std.setSid(number);
				std.setSname(name);
				std.setSaddr(location);
				status = studentDao.add(std);
				System.out.println(status);
				
				break;
				
			case 2:
				System.out.println("=== Serach Module===");
				System.out.print("Enter number :");
				number = br.readLine();
				std = studentDao.serach(number);
				if(std == null)
				{
					System.out.println("Student Not Existed");
				}
				else
				{
					System.out.println("Employee Details");
					System.out.println("================");
					System.out.println("Student number  :"+std.getSid());
					System.out.println("Student name    :"+std.getSname());
					System.out.println("student address :"+std.getSaddr());
					
				}
				
				break;
				
			case 3:
				System.out.println("====update module====");
				System.out.print("Enter number  :");
				number = br.readLine();
				std = studentDao.serach(number);
				if(std == null)
				{
					System.out.println("Student Not Existed");
				}
				else
				{
					System.out.println("student number       :"+std.getSid());
					System.out.print("student name [old      :"+std.getSname()+" New Name :");
					String new_Name = br.readLine();
					System.out.print("Student addr [old      :"+std.getSaddr()+" New Address :");
					String New_Address = br.readLine();
					
					std = new Student();
					std.setSid(number);
					std.setSname(new_Name);
					std.setSaddr(New_Address);
					
					status = studentDao.update(std);
					System.out.println(status);
					
				}
				
				break;
				
			case 4:
				System.out.println("===delete module===");
				System.out.print("Enter number :");
				number = br.readLine();
				status = studentDao.delete(number);
				System.out.println(status);
				
				break;
				
			case 5:
				System.out.println("===Get All Employees===");
				List<Student> allEmployees = studentDao.getAllEmployees();
				System.out.println("sid\tsname\tsaddr");
				System.out.println("===================");
				for(Student all : allEmployees)
				{
					System.out.print(all.getSid()+"\t");
					System.out.print(all.getSname()+"\t");
					System.out.print(all.getSaddr()+"\n");
				}
				break;
				
			case 6:
				System.out.println("*** Thanks for Using this Application ***");
				System.exit(0);
				break;
				
			default :
				System.out.println("Enter the Option from 1, 2, 3, 4, 5, 6");
				break;
					
			}
		}
		
		
	}

}


















