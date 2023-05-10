package com.pack.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pack.dto.Student;
import com.pack.service.StudentService;


@Controller("studentController")
public class StudentControllerImpl implements StudentController 
{
	
	BufferedReader br = null;
	@Autowired
	private StudentService studentService;
	
	
	public StudentControllerImpl() 
	{
		try 
		{
			br = new BufferedReader(new InputStreamReader(System.in));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void addStudent() 
	{
		try 
		{
			System.out.print("student id     :");
			String sid = br.readLine();
			System.out.print("student name   :");
			String name = br.readLine();
			System.out.print("student address:");
			String saddr = br.readLine();
			
			Student student = new Student();
			student.setSid(sid);
			student.setSname(name);
			student.setSaddr(saddr);
			
			String status = studentService.addStudent(student);
			if(status.equals("existed"))
			{
				System.out.println();
				System.out.println("student existed already");
				System.out.println();
			}
			if(status.equals("success"))
			{
				System.out.println();
				System.out.println("student insertion success");
				System.out.println();
			}
			if(status.equals("failure"))
			{
				System.out.println();
				System.out.println("student insertion failure");
				System.out.println();
			}
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void searchStudent() 
	{
		try 
		{
			System.out.print("Student id  :");
			String sid = br.readLine();
			Student student = studentService.searchStudent(sid);
			
			if(student == null)
			{
				System.out.println("Student Not Existed");
			}
			else
			{
				System.out.println("Student Details");
				System.out.println("===============");
				System.out.println("Student id   :"+student.getSid());
				System.out.println("Student Name :"+student.getSname());
				System.out.println("Student Saddr:"+student.getSaddr());
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent() 
	{
		try 
		{
			System.out.print("Student  id :");
			String sid = br.readLine();
			Student student = studentService.searchStudent(sid);
			if(student == null)
			{
				System.out.println("Student Not Existed");
			}
			else
			{
				System.out.println("Student id :"+student.getSid());
				System.out.print("Student Name : Old value : "+student.getSname() + " New Value :");
				String sname = br.readLine();
				System.out.print("Student Addr : Old Value : "+student.getSaddr() + " New Value ");
				String saddr = br.readLine();
				
				student.setSname(sname);
				student.setSaddr(saddr);
				String status = studentService.updateStudent(student);
				if(status.equals("success"))
				{
					System.out.println("Student Updation success");
				}
				else
				{
					System.out.println("Student Updation Failure");
				}
				
			}
			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudent() 
	{
		try 
		{
			System.out.print("Student id  :");
			String sid = br.readLine();
			String status = studentService.deleteStudent(sid);
			if(status.equals("success"))
			{
				System.out.println(" Student Success");
			}
			if(status.equals("failure"))
			{
				System.out.println("Student Failure");
			}
			if(status.endsWith("Not Existed"))
			{
				System.out.println("Student is Not Existed");
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
