package com.pack.service;

import com.pack.beans.Student;

public class InstituteServiceImpl implements InstituteService 
{

	@Override
	public void enquiry(Student std, String course_name) 
	{
		System.out.println("Student Enquiry Details");
		System.out.println("=====================");
		System.out.println("Student number  :"+std.getSno());
		System.out.println("Student name    :"+std.getSname());
		System.out.println("Student mobile  :"+std.getSmobile());
		System.out.println("Student address :"+std.getSaddr());
		System.out.println("Student Course  :"+course_name);
		System.out.println(" ");
	}

	@Override
	public void registration(Student std, String course_name) 
	{
		System.out.println("Student Registration Details");
		System.out.println("=====================");
		System.out.println("Student number  :"+std.getSno());
		System.out.println("Student name    :"+std.getSname());
		System.out.println("Student mobile  :"+std.getSmobile());
		System.out.println("Student address :"+std.getSaddr());
		System.out.println("Student Course  :"+course_name);
		System.out.println(" ");

	}

}
